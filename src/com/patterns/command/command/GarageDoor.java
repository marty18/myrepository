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
public class GarageDoor {
    String name;
    public GarageDoor( String name){
        this.name = name;
    }
    void up(){
        System.out.println(name + " is Open");
    }
    void down(){
        System.out.println(name + " is Close");
    }
}
