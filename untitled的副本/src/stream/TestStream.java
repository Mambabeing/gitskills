package stream;
import java.io.*;
public class TestStream {
    public static void main(String[] main){
        File f=new File("/Users/zeus/IdeaProjects/untitled/src/stream/2.txt");
        try(FileWriter fr=new FileWriter(f)){
            String date="abcdefghijklmnopqrstuvwxyz123";
            char[] cs=date.toCharArray();
            fr.write(cs);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
        /*try{
            File f=new File("/Users/zeus/IdeaProjects/untitled/src/stream/1.txt");
            FileInputStream fis=new FileInputStream(f);
            byte[] all=new byte[(int)f.length()];
            fis.read(all);
            for(byte b:all){
                System.out.println(b);
            }
            fis.close();
            //byte date[]={88,89};
            //FileIutputStream fos=new FileIutputStream(f);
            //fos.write(date);
            //fos.close();


        }catch(IOException e){
            e.printStackTrace();
        }*/
    }


