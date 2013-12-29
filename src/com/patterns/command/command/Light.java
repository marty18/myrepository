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
public class Light {
    
     String name;

    public Light() {
    }
     
    public Light( String name){
        this.name = name;
    }
    void on(){
        System.out.println(name + " light is On");
    }
    void off(){
        System.out.println(name + " light is Off");
    }
    
}
