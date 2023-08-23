/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abccompany.modelclasses;

import java.util.Date;

/**
 *
 * @author Lenovo
 */
public abstract class HallBooking {

    public String getBookingStartDate() {
        return bookingStartDate;
    }

    public void setBookingStartDate(String bookingStartDate) {
        this.bookingStartDate = bookingStartDate;
    }

    public String getBookingEndDate() {
        return bookingEndDate;
    }

    public void setBookingEndDate(String bookingEndDate) {
        this.bookingEndDate = bookingEndDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Receptionist getReceptionist() {
        return receptionist;
    }

    public void setReceptionist(Receptionist receptionist) {
        this.receptionist = receptionist;
    }
    private String bookingStartDate;
    private String bookingEndDate;
    private Customer customer;
    private Receptionist receptionist;
    
    public void cancelBooking(){
        this.setBookingStartDate(null);
        this.setBookingEndDate(null);
        this.setCustomer(null);
        this.setReceptionist(null);
    }
    public boolean isBooked(){
        if(this.getBookingStartDate()!=null || this.getBookingEndDate()!=null){
            return true;
        }
        else{
            return false;
        }
    }
    public abstract double calcPayment();
}
