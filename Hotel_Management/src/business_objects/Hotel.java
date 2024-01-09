/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business_objects;

/**
 *
 * @author ASUS
 */
public class Hotel {
    private String id;
    private String name;
    private int roomAvailable;
    private String address;
    private String phone;
    private int rating;
    public String regphone ="(0[3|5|7|8|9|1])+([0-9]{8})";

    public Hotel() {
    }

    public Hotel(String id, String name, int roomAvailable, String address, String phone, int rating) {
        this.id = id;
        this.name = name;
        this.roomAvailable = roomAvailable;
        this.address = address;
        this.phone = phone;
        this.rating = rating;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomAvailable() {
        return roomAvailable;
    }

    public void setRoomAvailable(int roomAvailable) {
        this.roomAvailable = roomAvailable;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
       
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        
        this.rating = rating;
    }
    
    @Override
    public String toString(){
        return String.format("|%-5s | %-10s | %-3d | %-17s | %-7s | %3d star | ",this.id, this.name, this.roomAvailable, this.address, this.phone, this.rating);
    }
    
    
}
