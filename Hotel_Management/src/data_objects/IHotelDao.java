/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_objects;

import business_objects.Hotel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface IHotelDao {
    public ArrayList<Hotel> getAllHotels();
    public Hotel getHotel(String id);
    public Hotel updateHotel (String id);
    public void deleteHotel (Hotel hotel);
    public boolean addHotel ();
    public boolean existHotel(String id);
    
}
