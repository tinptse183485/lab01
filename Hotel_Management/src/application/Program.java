/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import action_service.Service;
import action_service.tool;
import data_objects.HotelDao;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Program {

    public static void main(String[] args) {
        Service sv = new Service();

        int choice = 0
                
        while (choice!=7){
            tool.menu();
            choice = tool.getAnInteger("nhap so", "xui")
        switch (choice) {
            case 1:
                sv.func1();
                break;

            case 2:
                sv.func2();
                break;

            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        }
        

    }

}
