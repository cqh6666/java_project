package com.haige.thinkinjava.iolearn;

import java.io.File;
import java.io.IOException;

import java.util.Arrays;


/**
 * @className: com.haige.thinkinjava.iolearn-> DirList
 * @description: listing files using regular expressions
 * @author: cqh
 * @createDate: 2021-06-28 14:36
 * @version: 1.0
 * @todo:
 */
public class DirList {

    /**
     * 目录列表器
     */
    public static void main(String[] args) throws IOException {
        // 获取当前路径
        File file = new File("");
        String rootPath = file.getCanonicalPath();
        String packPath = DirList.class.getPackage().getName().replace(".", "\\");
        String filePath = rootPath + "\\src\\" + packPath + "\\files";
        System.out.println("文件路径：" + filePath);
        System.out.println("=========================================");

        File fileList = new File(filePath);
        if (fileList.isDirectory()) {
            // 正则匹配
            String[] list = fileList.list(new DirFilter(".+.java"));
            Arrays.sort(list, new StringComparator());
            for (int i = 0; i < list.length; i++) {
                System.out.println(list[i]);
            }
        }

    }


}


