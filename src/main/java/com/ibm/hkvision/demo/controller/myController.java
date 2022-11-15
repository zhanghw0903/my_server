package com.ibm.hkvision.demo.controller;


import com.ibm.hkvision.demo.ResBody;
import com.ibm.hkvision.demo.Utils.ImageUtils;
import com.sun.org.apache.regexp.internal.REUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class myController {
    @RequestMapping("/getUrl")
    public ResBody getUrl(){
        ResBody resBody = new ResBody();
        resBody.setText("https://img1.baidu.com/it/u=4269599166,108953845&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=333");
        resBody.setNum(1);
        return resBody;
    }
    @PostMapping("/send")
    public ResBody sout(Integer id,String text){
        System.out.println(id);
        System.out.println(text);
        ResBody resBody = new ResBody();
        resBody.setText("https://img1.baidu.com/it/u=4269599166,108953845&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=333");

        if (id == 1){
            resBody.setNum(1);
        }
        else {
            resBody.setNum(1);
        }
        return resBody;

    }
    //上传图片
    @PostMapping("uploadImg")
    public String uploadImage(@RequestParam(value = "file") MultipartFile multipartFile){
        if (multipartFile.isEmpty()){
            return "文件有误！";
        }
        return ImageUtils.uploadImage(multipartFile);
    }
}
