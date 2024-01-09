/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_objects;

import business_objects.Hotel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface IFile {
    public void writeObjectToFile(String filepath, Object serObj);
    public void writePerObjectToFile(String filepath, ArrayList<Hotel> serObj);
    public List<Hotel> readArrayPerObjectFromFile(String filepath) throws ClassNotFoundException, IOException;
    public void writeObjectToFile(String filepath, ArrayList<Hotel> serObj);
    public Hotel readObjectFromFile(String filepath) throws ClassNotFoundException;
    public ArrayList<Hotel> readArrayObjectFromFile(String filepath) throws ClassNotFoundException;
}
