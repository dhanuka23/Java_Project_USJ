/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abccompany.modelclasses;

/**
 *
 * @author Lenovo
 */
public class Hall {

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getHallID() {
        return hallID;
    }

    public void setHallID(String hallID) {
        this.hallID = hallID;
    }

    public HallBooking[] getHallBooking() {
        return hallBooking;
    }

    public void setHallBooking(HallBooking[] hallBooking) {
        this.hallBooking = hallBooking;
    }

    public Hall(int capacity, String hallID) {
        this.setCapacity(capacity);
        this.setHallID(hallID);
    }
    private int capacity;
    private String hallID;
    private HallBooking[] hallBooking = new HallBooking[30];
}
