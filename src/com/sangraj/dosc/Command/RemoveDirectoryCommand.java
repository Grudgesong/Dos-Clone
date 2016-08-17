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
public class RemoveDirectoryCommand extends DosCommand {
    @Override
    public void execute(String [] cmd){
        File file = new File(cmd[1]);
            if (file.isDirectory()) {
                file.delete();
    } else {
                System.out.println("Cannot find the file specified");
            }
    }
}
