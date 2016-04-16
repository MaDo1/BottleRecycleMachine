/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botrecvm;

import static botrecvm.Constants.STOPPED;
import static botrecvm.Constants.RUNNING;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author vvaisan
 */
public class Motor extends Observable {
    
    private int state = STOPPED;
    
    public Motor (Observer myobs){
        this.addObserver(myobs);
    }
    
    //TODO 1: 
    //Create private member 'state' type int with initial value STOPPED (Use constants in Constants class)
    //Create constructor
    //In costructor because Motor inherits Java Observable class you can call method addObserver with parameter 'myobs' given in main
    
    //TODO 2: 
    //Create start method
    //Set state as RUNNING, call setChanged(), create Event object with 0 data (Event type EVENT_MOTOR_START) and
    //finally call notifyObservers((Object)event);
    
    public void startMotor() {
        state=RUNNING;
        setChanged(); // the two methods of Observable class
        Event event = new Event(Constants.EVENT_MOTOR_START, 0);
        notifyObservers((Object)event);
    }
    
    //TODO 3: 
    //Create stopMotor method: Set state as STOPPED, then call setChanged() method, create Event object with 0 data and call notifyObservers((Object)event);
   
    public void stopMotor(){
        state=STOPPED;
        setChanged();
        Event event = new Event(Constants.EVENT_MOTOR_STOP,0);
        notifyObservers ((Object)event);
    }
}
