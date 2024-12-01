/*
 * Course: SWE2410-121
 * Fall 2024-2025
 * File header contains class ThermostatDevice
 * Name: weinbendera
 * Created 12/1/2024
 */

/**
 * Course SWE2410-121
 * Fall 2024-2025
 * Class ThermostatDevice Purpose: ThermostatDevice that implements the Device (Colleague) class
 *
 * @author weinbendera
 * @version created on 12/1/2024 1:03 PM
 */
public class ThermostatDevice extends Device {

    /**
     * Constructor for ThermostatDevice
     * @param homeMediator
     */
    public ThermostatDevice(ConcreteHomeMediator homeMediator) {
        super(homeMediator);
    }

    @Override
    public void detect(String event) {
        //Thermostat Events: temperature_change
        System.out.println("Detecting temperature change...");
        homeMediator.notifyDevices(event);
    }

    @Override
    public void receive(String task) {
        switch (task) {
            case "warm_up":
                homeMediator.home.temperature = 75;
                System.out.println("Warming up the house.");
                break;
            case "make_room_temperature":
                homeMediator.home.temperature = 68;
                System.out.println("Making the house room temperature.");
                break;
            case "cool_down":
                homeMediator.home.temperature = 63;
                System.out.println("Cooling down the house.");
                break;
        }

    }

}