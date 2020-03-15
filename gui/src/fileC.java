import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

/**
 * 调用文件管理器
 * @author linuxbckp
 * @version 1.0
 * @apiNote 11
 */
public class fileC extends Application {
    File af;
    FileChooser fileChooser = new FileChooser();
    Stage stage=new Stage();
    String a="";
    @Override
    public void start(Stage stage) throws IOException {
        fileChooser.setTitle("Explorer");
    }

    public static void main(String[] args) {
        launch();
    }
    public File showF() throws Exception{
        start(stage);
        af=fileChooser.showOpenDialog(stage);
        return af;
    }
    public String gName(){
        String b=af.getName();
        return b;
    }

}
