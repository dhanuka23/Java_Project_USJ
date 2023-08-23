/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abccompany.modelclasses;

/**
 *
 * @author Lenovo
 */
public class ContinuesBooking extends HallBooking{

    public double getHall_1_Price() {
        return hall_1_Price;
    }

    public void setHall_1_Price(double hall_1_Price) {
        this.hall_1_Price = hall_1_Price;
    }

    public double getHall_2_Price() {
        return hall_2_Price;
    }

    public void setHall_2_Price(double hall_2_Price) {
        this.hall_2_Price = hall_2_Price;
    }

    public double getHall_3_Price() {
        return hall_3_Price;
    }

    public void setHall_3_Price(double hall_3_Price) {
        this.hall_3_Price = hall_3_Price;
    }
    private double hall_1_Price = 500000;
    private double hall_2_Price = 100000;
    private double hall_3_Price = 1000000;
    
    @Override
    public double calcPayment(){
        double pay = (Integer.valueOf(super.getBookingEndDate())-
                Integer.valueOf(super.getBookingStartDate()))*hall_1_Price;
        return pay;
    }
    public double calcPayment_1(){
        double pay = (Integer.valueOf(super.getBookingEndDate())-
                Integer.valueOf(super.getBookingStartDate()))*hall_2_Price;
        return pay;
    }
    public double calcPayment_2(){
        double pay = (Integer.valueOf(super.getBookingEndDate())-
                Integer.valueOf(super.getBookingStartDate()))*hall_3_Price;
        return pay;
    }
    
    
}
