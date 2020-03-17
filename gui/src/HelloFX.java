import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 主程序
 * @author linuxbckp
 * @version 1.0
 * @apiNote 11
 */
public class HelloFX extends Application{
    File file=new File("./");
    @FXML
    TextArea viewTexts;
    @FXML
    TextArea outputName;
    @FXML
    Label nameInfo;
    StringBuffer s=new StringBuffer("");
    String s1,s2,s3="";

    @Override
    public void start(Stage stage) throws IOException {
        FileChooser fileChooser;
        Parent par = FXMLLoader.load(getClass().getResource("hellofx.fxml"));
        Scene scene = new Scene(par, 900, 600);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void open() throws Exception {
        fileC filec=new fileC();
        file=filec.showF();
        FileOpen fileo=new FileOpen();
        StringBuffer s=fileo.open2(file);
        s1=new String(s.toString().getBytes(),"UTF-8");
        System.out.println(s1);
        viewTexts.setText(s1);
        s3=filec.gName();
        nameInfo.setText(s3);
        nameInfo.setVisible(true);

    }
    @FXML
    void save() throws UnsupportedEncodingException {
        s1=viewTexts.getText();
        String s3=new String(s1.getBytes(),"UTF-8");
        s2=outputName.getText();
        File file=new File("./"+s2);
        FileSave fs=new FileSave();
        FileSave.save2(file,s3);
        nameInfo.setText("保存成功");
    }
    public static void main(String[] args) {
        launch();
    }

}
