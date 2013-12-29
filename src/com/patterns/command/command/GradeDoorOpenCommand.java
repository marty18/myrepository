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
public class GradeDoorOpenCommand implements Command {

    GradeDoor gradeDoor;

    public GradeDoorOpenCommand(GradeDoor gradeDoor) {
        this.gradeDoor = gradeDoor;
    }

    public void execute() {
        gradeDoor.up();
    }

    public void undo(){
        gradeDoor.up();
    }    
    
}
