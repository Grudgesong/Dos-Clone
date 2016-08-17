/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sangraj.dosc.Command;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Song Grudge Ranjit
 */
public class viCommand extends DosCommand {

    @Override
    public void execute(String[] cmd) {

        try {
            Scanner s=new Scanner(System.in);
            File file = new File(cmd[1]);
            // if file doesnt exists, then create it
            if (file.exists()) {
                System.out.println("File already exist");
            } else{
            FileWriter bw = new FileWriter(cmd[1]);
            bw.write(s.nextLine());
            bw.close();
            }
        } catch (IOException ioe) {
            ioe.getMessage();
        }
    }
}
