package com.haige.thinkinjava.iolearn;

import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @className: com.haige.thinkinjava.iolearn.stream-> IOStreamDemo
 * @description:
 * @author: cqh
 * @createDate: 2021-06-28 16:09
 * @version: 1.0
 * @todo:
 */
public class IOStreamDemo {


    private static String path = "D:\\java_learn_project\\book_learn\\src\\com\\haige\\thinkinjava\\iolearn\\files\\file01.txt";

    @Test
    public void demo01() {
        /**
         * 读取文件的每一行，并进行输出
         */
        BufferedReader bufferedReader = null;
        String s2 = "";
        try {

            bufferedReader = new BufferedReader(new FileReader(path));
            String s;
            while( (s = bufferedReader.readLine()) != null){
                s2 += s + "\t";
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(s2);

    }

    @Test
    public void demo02(){
        /**
         * 读取标准输入 OutputStreamWriter
         */

        try {
            OutputStreamWriter dataOutputStream = new OutputStreamWriter(new FileOutputStream(path), "utf-8");
            dataOutputStream.write(3.14+" ");
            dataOutputStream.write("pi");
            dataOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) throws Exception {
        /**
         *  缓冲输入文件
         */

        // Reading standard input:
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("standard input: " + bufferedReader1.readLine());

        System.out.println("==============================================");

        // input from memory
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String s,s2=new String();
        while( (s = bufferedReader.readLine()) != null){
            s2 += s + "\t";
        }
        StringReader stringReader = new StringReader(s2);
        int c = 0;
        System.out.print("memory input: ");
        while((c=stringReader.read()) != -1){
            System.out.print((char)c);
        }

        // 
    }

}
