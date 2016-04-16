/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botrecvm;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author vvaisan
 */
public class MoveSensor {
    
    private Motor motor;
    private Controller controller;
    
    public MoveSensor (Object motor, Object controller){
         this.motor = (Motor) motor;
         this.controller = (Controller) controller;
    }
    
    public void buttonPressed() {
        this.controller.buttonPressed(0);
        this.motor.stopMotor();
        
    
    }
    
    //TODO 1:
    //Create private members Motor and Controller objects. 
    //Create constructor and set private members as parameter values (Associations)
    
    //TODO 3:
    //Create method buttonPressed()
    //The method calls stop() method of Motor object and buttonPressed() method of Controller object
      
}
