package com.haige.thinkinjava.iolearn;

import java.io.File;

/**
 * @className: com.haige.thinkinjava.iolearn-> DirCheckAndCreate
 * @description: 目录的检查和创建
 * @author: cqh
 * @createDate: 2021-06-28 16:00
 * @version: 1.0
 * @todo:
 */
public class DirCheckAndCreate {

    public static void main(String[] args) {
        String filePath = "D:\\java_learn_project\\book_learn\\src\\com\\haige\\thinkinjava\\iolearn\\files\\dir1";
        File file = new File(filePath);
        boolean del=true;

        if(file.exists()){
            System.out.println(file+" exist!");
            if(del){
                file.delete();
                System.out.println("deleting the file "+ file + "...");
            }
        }else{
            System.out.println(file+" not exist!");
            file.mkdirs();
            System.out.println("creating the file "+ file + "...");
        }
    }

}
