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
public class StereoOnCommand implements Command {
    Stereo stereo;
    public StereoOnCommand(Stereo stereo){
        this.stereo = stereo;
    }
    
    public void execute(){
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
     public void undo(){
        stereo.off();
    }
    
}
