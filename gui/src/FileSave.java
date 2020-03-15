import java.io.File;
import java.io.FileWriter;

/**
 * 保存新文件
 * @author linuxbckp
 * @param textField
 * @return void
 */
public class FileSave {
    static void save2(File file,String s1){
        try{
            FileWriter writer = new FileWriter(file);
            writer.write(s1);
            writer.flush();
            writer.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
