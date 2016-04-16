package botrecvm;

import java.util.Observer;

public class Controller {
    private float sum=0;
    Display display=null;
    Printer printer=null;
    
    public Controller(Observer o) {
        display = new Display(o);          
        printer = new Printer(o);          
    }
    
    public void buttonPressed(int ticket){
        //float price = printer.printTicket(ticket);
       // if(sum >= price) {
            printer.printTicket(sum);
            display.show("Take the ticket");
            sum=0;
        //}
    }
    
    public void bottleAdded(int bottle) {
        float value=0.0f;
        switch(bottle)
        {
            case 15: value = 0.15f;
            break;
            case 20: value = 0.2f;
            break;
            case 30: value = 0.30f;
            break;
            default: value = Constants.INVALID;
         }
        Controller.buttonPressed(value);
    }
       
    }
    
    //TODO1:
    //Create private members: sum (float), Display and Printer object members (Associations)
    //Create constructor (Observer as parameter)
    //In costructor create display and printer objects (private members above), give observer as parameter
    
    //TODO 3: 
    //Create buttonPressed() method: Set sum as zero and call printTicket method (printer object)
    
    //TODO 2:
    //Create bottleAdded() method (bottle as parameters type int)
    //Check the value of bottle parameter: 20  --> 0.2f, 15  --> 0.15f or 30  --> 0.3f (Or then INVALID)
    //Add the value to the sum and call show() method of display object (sum as parameter)
  
}
