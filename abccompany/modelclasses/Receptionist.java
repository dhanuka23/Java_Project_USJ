/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abccompany.modelclasses;

/**
 *
 * @author Lenovo
 */
public class Receptionist {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
    }
    private String name;
    private String employeeNum;

    public Receptionist(String name, String employeeNum) {
        this.setName(name);
        this.setEmployeeNum(employeeNum);
    }
    public Receptionist() {
        this.setName("");
        this.setEmployeeNum("");
    }
    
}
