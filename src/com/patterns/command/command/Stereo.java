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
public class Stereo {
    String name;
    public Stereo(String name){
        this.name = name;
    }
    void on(){
        System.out.println(name + " stereo is On");
    }
    void off(){
        System.out.println(name + " stereo is Off");
    }
    void setCD(){
        System.out.println(name + " stereo is set for CD input");
    }
    void setDVD(){
        System.out.println(name + " stereo is set for DVD input");
    }
    void setRadio(){
        System.out.println(name + " stereo is set for Radio input");
    }
    void setVolume( int i){
        System.out.println(name + " stereo volume set to " + i);
    }
    
}
