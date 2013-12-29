/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.patterns.command.command;

/**
 *
 * @author Zoi
 */
public class MacroCommand implements Command {
    Command[] commnads;
    
    public MacroCommand( Command[] commands){
        this.commnads = commands;
    }
    
    public void execute(){
        for( int i = 0; i < commnads.length; i++){
            commnads[i].execute();
        }
    }
    public void undo(){
        for( int i = 0; i < commnads.length; i++ ){
            commnads[i].undo();
        }
    }
}
