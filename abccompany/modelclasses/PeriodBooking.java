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
public class PeriodBooking {

    public double getHallprice_1() {
        return hallprice_1;
    }

    public void setHallprice_1(double hallprice_1) {
        this.hallprice_1 = hallprice_1;
    }

    public Date getSpecificDate() {
        return specificDate;
    }

    public void setSpecificDate(Date specificDate) {
        this.specificDate = specificDate;
    }
    private double hallprice_1 = 500000;
    private double hallprice_2 = 100000;
    private double hallprice_3 = 1000000;

    public double getHallprice_2() {
        return hallprice_2;
    }

    public void setHallprice_2(double hallprice_2) {
        this.hallprice_2 = hallprice_2;
    }

    public double getHallprice_3() {
        return hallprice_3;
    }

    public void setHallprice_3(double hallprice_3) {
        this.hallprice_3 = hallprice_3;
    }
    private Date specificDate;
}
