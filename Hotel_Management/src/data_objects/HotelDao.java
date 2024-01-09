/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_objects;

import action_service.tool;
import business_objects.Hotel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class HotelDao extends ArrayList<Hotel> implements IHotelDao{
    ArrayList<Hotel> hotelList = new ArrayList<>() ;
    String filepath="C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Hotel_Management\file.txt";
    IFile f = new File();
   
     

    public HotelDao(){
       
    }

    @Override
    public ArrayList<Hotel> getAllHotels() {
        
        return (ArrayList<Hotel>) hotelList;
        
    }

    @Override
    public Hotel getHotel(String id) {
        
        Hotel hotel = new Hotel();
        for (Hotel i: hotelList)
            if (i.getId().equals(id))
                hotel=i;
                return hotel;
    }
    
 
    

    @Override
    public Hotel updateHotel(String id) {
        Hotel hotel = new Hotel();
        if(this.existHotel(id)==true){
       for (Hotel i: hotelList)
           if (i.getId()==id){
               // tạo hotel clone để update thông tín 
        hotel.setId(tool.getStringk("Enter Hotel_id "));
        hotel.setName(tool.getStringk("Enter Name: "));
        hotel.setRoomAvailable(tool.getAnIntegerk("Enter Room available", "Invalid room available", 0));
        hotel.setPhone(tool.getStringk("Enter phone number", "Invalid number",hotel.regphone));
        hotel.setAddress(tool.getStringk("Enter address"));
        hotel.setRating(tool.getAnIntegerk("Enter rating", "Invalid Rating", 0, 5));
        
        // so sánh với i nếu dữ liệu trống thì giữ nguyên information ko thì đổi i
        if (!hotel.getId().equals("")) i.setId(hotel.getId());
        if (!hotel.getAddress().equals("")) i.setAddress(hotel.getAddress());
        if (!hotel.getPhone().equals("")) i.setPhone(hotel.getPhone());
        if (!hotel.)
        
            }
           else System.out.println("No exist hotel");
 
        
    }
        return hotel;
    }
    @Override
    public void deleteHotel(Hotel hotel) {
        
    }
    
    @Override
    public boolean addHotel(){
        Hotel hotel = new Hotel();
        boolean flag=false;
        hotel.setId(tool.getString("Enter Hotel_id ","Invalid ID"));
        hotel.setName(tool.getString("Enter Name: ", "Invalid Name"));
        hotel.setRoomAvailable(tool.getAnIntegerk("Enter Room available", "Invalid room available", 0));
        hotel.setPhone(tool.getString("Enter phone number", "Invalid number",hotel.regphone));
        hotel.setAddress(tool.getString("Enter address","Invalid Address"));
        hotel.setRating(tool.getAnInteger("Enter rating", "Invalid Rating", 0, 5));
        hotelList.add(hotel);
        for (Hotel i: hotelList)
            if (i==hotel)
                flag=true;
        return flag;
            
        
    }

    @Override
    public boolean existHotel(String id) {
        Hotel hotel = new Hotel();
        for (Hotel i: hotelList)
            if (i.getId().equals(id))
      
                return true;
      return false;
        
    }
    
   
    
    
    
   
    
}
