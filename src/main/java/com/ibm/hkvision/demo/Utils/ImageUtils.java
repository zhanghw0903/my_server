package com.ibm.hkvision.demo.Utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class ImageUtils {
    public static String uploadImage(MultipartFile multipartFile){
        try{
            String realFileName = multipartFile.getOriginalFilename();
            String imgSuffix = realFileName.substring(realFileName.lastIndexOf("."));
            String newFileName = UUID.randomUUID()+imgSuffix;
            File targetPath = new File("./uploadFile");
            if (!targetPath.exists()){
                targetPath.mkdirs();
            }
            File targetFileName = new File("C:\\Users\\leich\\Desktop\\upload",newFileName);
            multipartFile.transferTo(targetFileName);
            return "upload/" + targetPath+"/"+targetFileName;
        }catch (IOException e){
            e.printStackTrace();
            return "上传失败！";
        }
    }
}
