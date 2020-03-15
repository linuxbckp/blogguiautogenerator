import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 读取文件
 * @author linuxbckp
 * @param file
 * @return String
 */
public class FileOpen {
    StringBuffer out=new StringBuffer("");
    StringBuffer open2(File file){
        FileReader fr =null;
        try{
            fr = new FileReader(file);
            int ch=0;
            while(true) {
                if ((ch = fr.read()) != -1) {
                    System.out.print((char) ch);
                    out.append((char)ch);
                    } else {
                    break;
                }
            }


            return out;
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
        return new StringBuffer("");
    }
}
