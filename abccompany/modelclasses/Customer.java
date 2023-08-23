/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abccompany.modelclasses;

/**
 *
 * @author Lenovo
 */
public class Customer {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    private String name;
    private String nic;
    private String contactNum;
    private String address;

    public Customer() {
        this.setName("");
        this.setNic("");
        this.setContactNum("");
        this.setAddress("");
    }

    public Customer(String name, String nic, String contactNum, String address) {
        this.setName(name);
        this.setNic(nic);
        this.setContactNum(contactNum);
        this.setAddress(address);
    }
}
