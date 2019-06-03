package com.dzh.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class DropZoneController {

    @ResponseBody
    @RequestMapping(value = "upload", method = RequestMethod.POST)
    public Map<String, Object> upload(MultipartFile dropzFile, HttpServletRequest request) {
        System.out.println(dropzFile);
        Map<String, Object> result = new HashMap<String, Object>();
        String fileName = dropzFile.getOriginalFilename();

        String filePath = request.getSession().getServletContext().getRealPath("/static/upload");

        String fileSuffix = fileName.substring(fileName.lastIndexOf("."),fileName.length());
        // 判断并创建上传用的文件夹
        File destFile = new File(filePath);
        if (!destFile.exists()) {
            destFile.mkdirs();
        }
        // 重新设置文件名为 UUID，以确保唯一
        destFile = new File(filePath, UUID.randomUUID() + fileSuffix);
        System.out.println(destFile.getAbsolutePath());
        if(!destFile.exists()){
            try {
                destFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(destFile.getAbsolutePath()+"-------");
        try {
            // 写入文件
            dropzFile.transferTo(destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 返回 JSON 数据，这里只带入了文件名
        result.put("fileName", destFile.getName());
        return result;
    }


    static String UPLOAD_PATH = "/static/upload/";

    @ResponseBody
    @RequestMapping(value = "upload1", method = RequestMethod.POST)
    public Map<String, Object> upload1(MultipartFile editorFile, HttpServletRequest request) {
        Map<String, Object> result = new HashMap<String, Object>();

        // 获取文件后缀
        String fileName = editorFile.getOriginalFilename();
        String fileSuffix = fileName.substring(fileName.lastIndexOf("."));

        // 文件存放路径
        String filePath = request.getSession().getServletContext().getRealPath(UPLOAD_PATH);
        InetAddress ia=null;
        try {
            ia = ia.getLocalHost();
            System.out.println(ia.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        // 判断路径是否存在，不存在则创建文件夹
        //目标文件夹创建
        File file = new File(filePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        //目标文件创建
        // 将文件写入目标
        file = new File(filePath, UUID.randomUUID() + fileSuffix);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            editorFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 获取服务端路径
        String serverPath = String.format("%s://%s:%s%s%s", request.getScheme(), ia.getHostAddress(), request.getServerPort(), request.getContextPath(), UPLOAD_PATH);
        System.out.println(serverPath);
        // 返回给 wangEditor 的数据格式
        result.put("errno", 0);
        result.put("data", new String[]{serverPath + file.getName()});
        return result;
    }

    @ResponseBody
    @RequestMapping("tblhtml")
    public Object getHtml(@RequestParam String sHtml){
        System.out.println(sHtml);
        return null;
    }

}
