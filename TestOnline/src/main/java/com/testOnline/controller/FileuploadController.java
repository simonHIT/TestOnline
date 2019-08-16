package com.testOnline.controller;


import com.testOnline.common.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
@RequestMapping(value = "/fileup")
@Scope("request")
public class FileuploadController {

    @RequestMapping(value = "/upload" , method = RequestMethod.POST)
    public Result fileupLoad(MultipartFile file, HttpServletRequest request ){

        Result result = new Result();

        Map<String,Object> map = new HashMap<String,Object>();
        try{
            String path = request.getServletContext().getRealPath("/").replace("\\", "/")+"/upload";
            String fileName = file.getOriginalFilename();
            String image = uploadFile(file,path);
            map.put("code","0");
            map.put("image",image);
            map.put("fname",fileName);
        }catch (Exception e){
            map.put("code",1);
            e.printStackTrace();
        }
        result.setMap(map);
        return result;
    }

    public static String uploadFile(MultipartFile file , String path) throws IOException {
        String fileName = file.getOriginalFilename();
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        String hash = Integer.toHexString(new Random().nextInt());
        String newfile = hash + suffixName;
        File tempFile = new File(path,newfile);
        if(!tempFile.getParentFile().exists()){
            tempFile.getParentFile().mkdir();
        }
        if(tempFile.exists()){
            tempFile.delete();
        }

        tempFile.createNewFile();
        file.transferTo(tempFile);
        return tempFile.getName();
    }

}
