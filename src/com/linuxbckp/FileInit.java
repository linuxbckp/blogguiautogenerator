package com.linuxbckp;

import java.io.File;
import java.io.IOException;

public class FileInit {
    static void init(){
        String name="1";
        File file = new File("./",name+".txt");
        try{file.createNewFile();
        }catch(IOException e)
        {e.printStackTrace();
        }
    }
}
