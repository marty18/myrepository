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
public class TVOnCommand implements Command {
    TV tv;
    public TVOnCommand( TV tv){
        this.tv = tv;
    }
    public void execute(){
        tv.on();
        tv.setInputChannel(5);
        tv.setVolume(23);
    }
}
