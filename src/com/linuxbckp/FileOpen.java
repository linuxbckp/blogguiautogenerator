package com.linuxbckp;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileOpen {
    static void open(){
        String name="模板1";
        FileReader fr =null;
        File file = new File("./",name+".txt");
        try{
            fr = new FileReader(file);
            int ch=0;
            while(true) {
                if ((ch = fr.read()) != '\n') {
                    System.out.print((char) ch);
                    System.out.print('\n');
                } else {
                    break;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        finally
        {
        try
        {
            if(fr!=null)
            {
                fr.close();
            }
        }
        catch(IOException e)
        {
            System.out.println(e.toString());
        }
        }
    }
}
