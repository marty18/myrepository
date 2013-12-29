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
public class RemoteLoader {
    public static void main(String[] args) {
        //ВЫПОЛНЕНИЯ С КНОПКОЙ ОТМЕНА
        RemoteControl remoteControl = new RemoteControl();
        
        //создание всех устройств
        Light livinRoomLight = new Light("Living Room");
        TV tv = new TV("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage Door");
        Stereo stereo = new Stereo("Living Room");
        
       //создание команд для управления освнщением
        LightOnCommand livinRoomLightOn = new LightOnCommand(livinRoomLight);
        LightOffCommand livinRoomLightOff = new LightOffCommand(livinRoomLight);
        
        //создание команд для управления пультом
        TVOnCommand tvOn = new TVOnCommand(tv);
        TVOffCommand tvOff = new TVOffCommand(tv);
        
        //создание команд для управления дверью гаража
        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);
        
        //создание команд для управления стереосистемой
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        
        //готовые команды связываюся с ячейками пульта
        remoteControl.setCommand(0, livinRoomLightOn, livinRoomLightOff);
        remoteControl.setCommand(1, tvOn, tvOff);
        remoteControl.setCommand(2, stereoOnCommand, stereoOffCommand);
        remoteControl.setCommand(3, garageDoorUpCommand, garageDoorDownCommand);
        //пульт готов к проверке: выбираем ячейки и имитируем "выкл" и "вкл"
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        
        //РЕАЛИЗАЦИЯ С ПОМОЩЬЮ МАКРОСА
        Command[] partyOn = { livinRoomLightOn, stereoOnCommand, tvOn, garageDoorUpCommand};
        Command[] partyOff = { livinRoomLightOff, stereoOffCommand, tvOff, garageDoorDownCommand};
        
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);
        
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
        
        System.out.println(remoteControl);
        System.out.println("---Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("---Pushing Macro Off---");
        remoteControl.offButtonWasPushed(0);
    }
    
}
