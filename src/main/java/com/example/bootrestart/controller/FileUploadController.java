package com.example.bootrestart.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@RestController
public class FileUploadController {
    @PostMapping("/upload")
    public String up(String nickname, MultipartFile photo, HttpServletRequest request) throws Exception {
        System.out.println(nickname);

        System.out.println(photo.getOriginalFilename());
        
        System.out.println(photo.getContentType());
        System.out.println(System.getProperty("user.dir"));

        //根据文件上下文找到文件的运行路径再加上要保存的路径，这里的路径是idea随机分配的
        String path = request.getServletContext().getRealPath("/upload/");
        System.out.println(path);
        saveFile(photo, path);
        return "success";
    }

    private void saveFile(MultipartFile photo, String path) throws IOException {
        File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdir();
        }

        File file = new File(path + photo.getOriginalFilename());//直接路径加文件名就行，不用加/
        photo.transferTo(file);
    }
}
