package com.linuxbckp;


//use Jdk 13

import static com.linuxbckp.FileInit.init;
import static com.linuxbckp.FileOpen.open;
import static com.linuxbckp.FileSave.save;

/***  博客自动生成器
 *     部落格自動生成器
 *     Blog GUI Auto Generator
 *     github.com/linuxbckp
 * @author linuxbckp
 * @version 0.1
 * @return void
 */

public class Main{
    public static void main(String args[]){
        //new FileInit();
        init();
        //new FileSave();
        save();
        //new FileOpen();
        open();
    }
}
