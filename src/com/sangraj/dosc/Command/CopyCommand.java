/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sangraj.dosc.Command;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Song Grudge Ranjit
 */
public class CopyCommand extends DosCommand {

    @Override
    public void execute(String[] cmd) {
        try {
            BufferedReader bre = new BufferedReader(new FileReader(cmd[1]));
            String line = "";
            StringBuilder content = new StringBuilder();
            while ((line = bre.readLine()) != null) {
                content.append(line).append("\r \n");
                // "/r" means enter
                // "/n" means next line
            }
            bre.close();
            FileWriter writer = new FileWriter(cmd[2]);
            writer.write(content.toString());
            writer.close();
            }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

}
