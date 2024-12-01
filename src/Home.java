/*
 * Course: SWE2410-121
 * Fall 2024-2025
 * File header contains class Home
 * Name: weinbendera
 * Created 12/1/2024
 */

/**
 * Course SWE2410-121
 * Fall 2024-2025
 * Class Home Purpose: Home class for variables to be changed
 *
 * @author weinbendera
 * @version created on 12/1/2024 1:34 PM
 */
public class Home {

    /**
     * temperature of house
     * meant to be public
     */
    public int temperature;

    /**
     * boolean for daytime
     * meant to be public
     */
    public boolean isDay;

    /**
     * boolean for occupation
     * meant to be public
     */
    public boolean isOccupied;

    public Home (int temperature, boolean isDay, boolean isOccupied) {
        this.temperature = temperature;
        this.isDay = isDay;
        this.isOccupied = isOccupied;
    }

}