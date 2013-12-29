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
public class StereoOffCommand implements Command {
    Stereo stereo;
    public StereoOffCommand( Stereo stereo){
        this.stereo = stereo;
    }
    public void execute(){
        stereo.off();
    }
    public void undo(){
        stereo.on();
    }
}
