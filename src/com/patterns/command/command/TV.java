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
public class TV {
    String name;
    public TV(String name){
        this.name = name;
    }
    void on(){
        System.out.println(name + " TV is On" );
    }
    void off(){
        System.out.println(name + " TV is Off" );
    }
    void setInputChannel( int i ){
        System.out.println(name + " TV channel set to " + i);
    }
    void setVolume( int i){
        System.out.println(name + " TV volume set to " + i);
    }
    
}
