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
public class RemoteControl {
   Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;
    
    public RemoteControl(){
        onCommands = new Command[6];
        offCommands = new Command[6];
        
         Command noCommand = new NoCommand();
         for( int i = 0; i < 6; i++){
             onCommands[i] = noCommand;
             offCommands[i] = noCommand;
         }
         undoCommand = noCommand;
    }
    
    public void setCommand( int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }
    
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n-------Remote Control-------\n");
        for(int i = 0; i < onCommands.length; i++){
            stringBuffer.append("[slot " + i +"]" + onCommands[i].getClass().getName()
                    + "     " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
    
}
