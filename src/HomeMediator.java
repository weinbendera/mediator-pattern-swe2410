/*
 * Course: SWE2410-121
 * Fall 2024-2025
 * File header contains class HomeMediator
 * Name: weinbendera
 * Created 12/1/2024
 */

import java.util.List;

/**
 * Course SWE2410-121
 * Fall 2024-2025
 * Class HomeMediator Purpose: Interface for a Mediator
 *
 * @author weinbendera
 * @version created on 12/1/2024 12:50 PM
 */
public interface HomeMediator {
    void registerDevice(Device device);
    void removeDevice(Device device);
    void notifyDevices(String message);
}
