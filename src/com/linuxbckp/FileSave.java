package com.linuxbckp;

import java.io.File;
import java.io.FileWriter;

public class FileSave {
    void save(){
        String name="1";
        File file = new File("./",name+".txt");
        try{
            FileWriter writer = new FileWriter(file);
            writer.write(name);
            writer.flush();
            writer.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
