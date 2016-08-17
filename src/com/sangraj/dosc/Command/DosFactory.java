/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sangraj.dosc.Command;

/**
 *
 * @author Song Grudge Ranjit
 */
public class DosFactory {

    public static DosCommand get(String param) {
        if (param.equalsIgnoreCase("md")) {
            return new MakeDirectoryCommand();
        } else if (param.equalsIgnoreCase("rd")) {
            return new RemoveDirectoryCommand();
        } else if (param.equalsIgnoreCase("ren")){
            return new RenameCommand();
        } else if (param.equalsIgnoreCase("copy")){
            return new CopyCommand();
        } else if(param.equalsIgnoreCase("del")){
            return new DeleteCommand();
        }else if(param.equalsIgnoreCase("dir")){
            return new DirectoryCommand();
        }else if(param.equalsIgnoreCase("vi")){
            return new viCommand();
        }
        return null;
    }
}
