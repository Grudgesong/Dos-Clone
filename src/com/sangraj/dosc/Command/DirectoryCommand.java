/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sangraj.dosc.Command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Song Grudge Ranjit
 */
public class DirectoryCommand extends DosCommand {

    @Override
    public void execute(String[] cmd) {
        {
            try {
                Process p = Runtime.getRuntime().exec("cmd /c dir");
                p.waitFor();
                BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String line = reader.readLine();
                while (line != null) {
                    System.out.println(line);
                    line = reader.readLine();
                }

            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            } catch (InterruptedException io) {
                System.out.println(io.getMessage());
            }

            System.out.println("Done");
        }
    }
}


