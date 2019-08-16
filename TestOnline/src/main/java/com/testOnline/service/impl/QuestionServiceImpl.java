package com.testOnline.service.impl;

import com.testOnline.dao.QuestionMapper;
import com.testOnline.dao.QuestionOptionMapper;
import com.testOnline.model.QuestionExample;
import com.testOnline.model.QuestionOption;
import com.testOnline.model.QuestionOptionExample;
import com.testOnline.model.QuestionWithBLOBs;
import com.testOnline.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Service("IQuestionService")
public class QuestionServiceImpl implements IQuestionService {


    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private QuestionOptionMapper optionMapper;

    /**
     *
     * @param que_info 题干
     * @param queTag 题目类型（1选择，0简答）
     * @param courseId 课程id
     * @param queAns 参考答案
     * @param queValue 分值
     * @param queRank 难易程度
     * @param options 选项（非必须，选择题字段）
     * @return 1 操作成功，0 操作失败
     */
    @Override
    public Integer addQuestion(String que_info, String  queTag, Integer courseId, String queAns, String queValue, String queRank,List<String> options) {

        Integer result=0;

        QuestionWithBLOBs questionWithBLOBs=new QuestionWithBLOBs();

        questionWithBLOBs.setQueInfo(que_info);

        questionWithBLOBs.setQueTag(queTag);

        questionWithBLOBs.setCourseId(courseId);

        questionWithBLOBs.setQueAns(queAns);

        questionWithBLOBs.setQueValue(queValue);

        questionWithBLOBs.setQueRank(queRank);

        result=questionMapper.insertSelective(questionWithBLOBs);


        if ("0".equals(queTag)&&result==1){

            Integer queid = questionWithBLOBs.getQueId();

            for (int i = 0; i <options.size() ; i++) {

                QuestionOption option=new QuestionOption();

                option.setQueId(queid);

                option.setOptionInfo(options.get(i));

                optionMapper.insertSelective(option);

            }
        }

        return result;
    }


    /**
     * 随机选取num道course相关的题目
     * @param num 题目数量
     * @param courseId 所属课程
     * @return 题目列表，类型为List
     */
    @Override
    public List<QuestionWithBLOBs> getQuestionsForQuiz(Integer num,Integer courseId) {

        QuestionExample questionExample=new QuestionExample();
        questionExample.clear();
        questionExample.or().andQueTagEqualTo("0").andCourseIdEqualTo(courseId);

        List<QuestionWithBLOBs> questionWithBLOBs=questionMapper.selectByExampleWithBLOBs(questionExample);

        int max=0;
        for (QuestionWithBLOBs question:questionWithBLOBs){
            if (question.getQueId()>max){
                max=question.getQueId();
            }
        }

        if(num>questionWithBLOBs.size()){
            return questionWithBLOBs;
        }else {
            HashSet<Integer> indexs=new HashSet<>();
            randomSet(0,max,num,indexs);

            List<QuestionWithBLOBs> list=new ArrayList<QuestionWithBLOBs>();
            for (Integer i:indexs){
                list.add(questionWithBLOBs.get(i));
            }
            return list;
        }


    }

    /**
     *
     * @param queId 题目id
     * @return 选项列表
     */
    @Override
    public List<QuestionOption> getOptions(Integer queId) {

        QuestionOptionExample optionExample=new QuestionOptionExample();

        optionExample.clear();

        optionExample.or().andQueIdEqualTo(queId);

        List<QuestionOption> optionList= optionMapper.selectByExample(optionExample);

        return optionList;
    }

    /**
     * 随机指定范围内N个不重复的数
     * 利用HashSet的特征，只能存放不同的值
     * @param min 指定范围最小值
     * @param max 指定范围最大值
     * @param n 随机数个数
     * @param  set 随机数结果集
     */
    public static void randomSet(int min, int max, int n, HashSet<Integer> set) {
        if (n > (max - min + 1) || max < min) {
            return;
        }
        for (int i = 0; i < n; i++) {
            // 调用Math.random()方法
            int num = (int) (Math.random() * (max - min)) + min;
            set.add(num);// 将不同的数存入HashSet中
        }
        int setSize = set.size();
        // 如果存入的数小于指定生成的个数，则调用递归再生成剩余个数的随机数，如此循环，直到达到指定大小
        if (setSize < n) {
            randomSet(min, max, n - setSize, set);// 递归
        }
    }


}
