package exception;
import java.io.*;
import java.util.*;
import java.text.*;
public class TestException {
    public static void main(String[] args){
        method1();

        /*File f=new File("d:/LOL.exe");
        try {
            System.out.println("试图打开那个文件");
            new FileInputStream(f);
            System.out.println("成功打开");
            SimpleDateFormat sdf=new SimpleDateFormat();
            Date d=sdf.parse("2016-06-03");
        }
        catch(FileNotFoundException e){
            System.out.println("d:/LOL.exe不存在");
            e.printStackTrace();
        }
        catch(ParseException e){
            System.out.println("日期格式解析错误");
            e.printStackTrace();
        }
        finally{
            System.out.println("无论文件是否存在，都会执行");
        }*/
    }
    private static void method1(){
        try{
            method2();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    private static void method2() throws FileNotFoundException{
        File f=new File("d:/LOL.exe");
        System.out.println("试图打开d:/LOL.exe");
        new FileInputStream(f);
        System.out.println("成功打开");
    }


}

/*package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestException {

    public static void main(String[] args) {

        File f = new File("d:/LOL.exe");

        try {
            System.out.println("试图打开 d:/LOL.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse("2016-06-03");
        } catch (FileNotFoundException e) {
            System.out.println("d:/LOL.exe不存在");
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("日期格式解析错误");
            e.printStackTrace();
        }
    }
}

 */
