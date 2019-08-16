package com.testOnline.model;

public class TestPaperToQuestion extends TestPaperToQuestionKey {
    private Integer testPaperScoreRecordId;

    private Integer questionQueId;

    private String userGrade;

    private String userAns;

    public Integer getTestPaperScoreRecordId() {
        return testPaperScoreRecordId;
    }

    public void setTestPaperScoreRecordId(Integer testPaperScoreRecordId) {
        this.testPaperScoreRecordId = testPaperScoreRecordId;
    }

    public Integer getQuestionQueId() {
        return questionQueId;
    }

    public void setQuestionQueId(Integer questionQueId) {
        this.questionQueId = questionQueId;
    }

    public String getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(String userGrade) {
        this.userGrade = userGrade == null ? null : userGrade.trim();
    }

    public String getUserAns() {
        return userAns;
    }

    public void setUserAns(String userAns) {
        this.userAns = userAns == null ? null : userAns.trim();
    }
}