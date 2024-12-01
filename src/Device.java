/*
* Course: SWE2410-121
* Fall 2024-2025
* File header contains class Device
* Name: weinbendera
* Created 12/1/2024
*/

/**
* Course SWE2410-121
* Fall 2024-2025
* Class Device Purpose: Abstract Class for Device (Colleague in Mediator Interface)
*
* @author weinbendera
* @version created on 12/1/2024 2:12 PM
*/
public abstract class Device {

    protected ConcreteHomeMediator homeMediator;

    /**
     * Constructor class for abstract Device
     * @param homeMediator homeMediator
     */
    public Device(ConcreteHomeMediator homeMediator) {
        this.homeMediator = homeMediator;
    }

    //Has the device send the mediator its event detected
    abstract void detect(String event);

    //The mediator calls this method to have the device update the home
    abstract void receive(String task);
}