/*
 * Course: SWE2410-121
 * Fall 2024-2025
 * File header contains class ConcreteHomeMediator
 * Name: weinbendera
 * Created 12/1/2024
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Course SWE2410-121
 * Fall 2024-2025
 * Class ConcreteHomeMediator Purpose: Concrete class for a HomeMediator
 *
 * @author weinbendera
 * @version created on 12/1/2024 12:51 PM
 */
public class ConcreteHomeMediator implements HomeMediator {
    public Home home;
    protected List<Device> devicesList;

    /**
     * HomeMediator constructor
     */
    public ConcreteHomeMediator(Home home) {
        this.home = home;
        devicesList = new ArrayList<>();
    }

    @Override
    public void registerDevice(Device device) {
        devicesList.add(device);
    }

    @Override
    public void removeDevice(Device device) {
        devicesList.remove(device);
    }

    @Override
    public void notifyDevices(String event) {
        switch (event) {
            case "enter_home":
                home.isOccupied = true;
                System.out.println("HomeMediator: Detected home entry.");
//                updateLights();
//                updateThermostat();
//                updateSecurity();
                break;

            case "leave_home":
//                isOccupied = false;
                System.out.println("HomeMediator: Detected home exit.");
//                updateSecurity();
//                updateLocks();
                break;

            case "nightfall":
//                isNight = true;
                System.out.println("HomeMediator: It's now night.");
//                updateLights();
                break;

            case "daybreak":
//                isNight = false;
                System.out.println("HomeMediator: It's now day.");
//                updateLights();
                break;

            case "temperature_change":
                if (home.temperature < 63) {
                    for (Device device : devicesList) {
                        device.receive("warm_up");
                    }
                } else if (home.temperature > 63 && home.temperature < 75) {
                    for (Device device : devicesList) {
                        device.receive("make_room_temperature");
                    }
                } else {
                    for (Device device : devicesList) {
                        device.receive("cool_down");
                    }
                }
                break;
        }
    }
}