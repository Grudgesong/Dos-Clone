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

public class RenameCommand extends DosCommand {

    @Override
    public void execute(String[] cmd) {
        File file = new File(cmd[1]);
            if (!file.exists()) {
                System.out.println("File doesnot exist");
            } else{
        new File(cmd[1]).renameTo(new File(cmd[2]));
    }
    }
}
