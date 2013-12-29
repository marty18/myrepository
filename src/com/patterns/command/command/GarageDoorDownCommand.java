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
public class GarageDoorDownCommand implements Command {
    GarageDoor garageDoor;
    public GarageDoorDownCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }
    public void execute(){
        garageDoor.down();
    }
     public void undo(){
        garageDoor.up();
    }
}
