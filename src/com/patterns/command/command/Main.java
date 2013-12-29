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
public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        GradeDoor  gradeDoor = new  GradeDoor();
        LightOnCommand lightOn = new LightOnCommand(light);
        GradeDoorOpenCommand gradeOpen = new  GradeDoorOpenCommand(gradeDoor);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(gradeOpen);
        remote.buttonWasPressed();
    }
    
}
