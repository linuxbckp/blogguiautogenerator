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
