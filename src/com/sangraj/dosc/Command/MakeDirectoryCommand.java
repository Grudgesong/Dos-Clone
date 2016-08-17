/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sangraj.dosc.Command;

import java.io.File;

/**
 *
 * @author Song Grudge Ranjit
 */
public class MakeDirectoryCommand extends DosCommand {
    @Override
    public void execute(String [] cmd) {
        File file = new File(cmd[1]);
            if (file.exists()) {
                System.out.println("File already exist");
            } else{
        new File(cmd[1]).mkdir();//<--------Method Chaining
        //        File f = new File(cmd[1]);
       //        f.mkdir();

    }
}
}
