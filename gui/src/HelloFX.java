/**
 *     Blog GUI Auto Generator
 *     Copyright (C) 2020, LinuxBCKP
 *     This library is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This library is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this library.  If not, see <http://www.gnu.org/licenses/>.
 *
 *     As a special exception, you may use this file as part of a free
 *     software library without restriction.  Specifically, if other files
 *     instantiate templates or use macros or inline functions from this
 *     file, or you compile this file and link it with other files to
 *     produce an executable, this file does not by itself cause the
 *     resulting executable to be covered by the GNU General Public
 *     License.  This exception does not however invalidate any other
 *     reasons why the executable file might be covered by the GNU General
 *     Public License.
 */

/**
 * BSD 3-Clause License
 *
 * Copyright (c) 2019, Gluon
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * * Neither the name of the copyright holder nor the names of its
 *   contributors may be used to endorse or promote products derived from
 *   this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

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
