/*
 * Course: SWE2410-121
 * Fall 2024-2025
 * File header contains class SmartHomeTester
 * Name: weinbendera
 * Created 12/1/2024
 */

/**
 * Course SWE2410-121
 * Fall 2024-2025
 * Class SmartHomeTester Purpose: TesterClass for Mediator Pattern
 *
 * @author weinbendera
 * @version created on 12/1/2024 1:06 PM
 */
public class SmartHomeTester {
    public static void main(String[] args) {
        Home home = new Home(68, true, false);
        ConcreteHomeMediator homeMediator = new ConcreteHomeMediator(home);
        ThermostatDevice thermostat = new ThermostatDevice(homeMediator);
        homeMediator.registerDevice(thermostat);
//        MotionSensorDevice motionSensorDevice
//        DaytimeSensorDevice daytimeSensorDevice

        thermostat.detect("temperature_change");

        home.temperature = 80;
        thermostat.detect("temperature_change");
        thermostat.detect("temperature_change");

    }
}