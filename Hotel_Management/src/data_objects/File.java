package data_objects;

import business_objects.Hotel;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguye
 */
public class File implements IFile {

    public File() {
    }

    public File(String filepath) {
        
    }
    
    

    @Override
    public void writeObjectToFile(String filepath, Object serObj) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filepath);
            try (ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
                objectOut.writeObject(serObj);
                objectOut.close();
            }
            System.out.println("The Object  was succesfully written to a file");
            fileOut.close();
        } catch (IOException ex) {
        }
    }

    @Override
    public void writePerObjectToFile(String filepath, ArrayList<Hotel> serObj) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filepath);
            try (ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
                //objectOut.writeObject(serObj);
                for (Hotel obj : serObj) {
                    objectOut.writeObject(obj);
                }
                objectOut.close();
            }
            //System.out.println("The Object  was succesfully written to a file");
            fileOut.close();
        } catch (IOException ex) {
        }
    }

    @Override
    public List<Hotel> readArrayPerObjectFromFile(String filepath) throws ClassNotFoundException, IOException {
        List<Hotel> arr = new ArrayList<>();
        FileInputStream fileIn = null;
        ObjectInputStream objectIn = null;
        try {
            fileIn = new FileInputStream(filepath);
            objectIn = new ObjectInputStream(fileIn);
            Object obj;
            while ((obj = objectIn.readObject()) != null) {
                if (obj instanceof Hotel) {
                    arr.add((Hotel) obj);
                }
            }
            objectIn.close();
            fileIn.close();
            //System.out.println("The Object was succesfully reading from a file");
        } catch (EOFException eof) {

        } catch (IOException ex) {
            throw ex;
        } finally {
            if (objectIn != null) {
                objectIn.close();
            }
            if (fileIn != null) {
                fileIn.close();
            }
        }
        return arr;
    }

    @Override
    public void writeObjectToFile(String filepath, ArrayList<Hotel> serObj) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filepath);
            try (ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
                objectOut.writeObject(serObj);
                objectOut.close();
            }
            System.out.println("The Object  was succesfully written to a file");
            fileOut.close();
        } catch (IOException ex) {
        }
    }

    @Override
    public Hotel readObjectFromFile(String filepath) throws ClassNotFoundException {
        try {
            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            Hotel hotel = (Hotel) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            System.out.println("The Object was succesfully reading from a file");
            return hotel;
        } catch (IOException ex) {
        }
        return null;
    }
    @Override

    public ArrayList<Hotel> readArrayObjectFromFile(String filepath) throws ClassNotFoundException {
        ArrayList<Hotel> arr = new ArrayList<>();
        try {
            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            arr = (ArrayList<Hotel>) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            System.out.println("The Object was succesfully reading from a file");
        } catch (IOException ex) {

        }
        return arr;
    }
}
