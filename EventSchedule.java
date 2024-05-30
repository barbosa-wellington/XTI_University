/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author wellington
 */
public class EventSchedule {
    
    
    
    
    public static void main (String [] args) throws ParseException{
    
//        Declare a list of event that will store all the events created
        ArrayList<String> eventList = new ArrayList<>();
        
//      Instance of a scanner to recieve the input data.
        Scanner sc = new Scanner(System.in);
        EventDef t1 = new EventDef();
        EventManager eveMa = new EventManager();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        
        
        do {
        System.out.println("Enter the event's name: ");
        t1.setEventName(sc.nextLine());
        
        System.out.println("Enter the event's description: ");
        t1.setEventDescription(sc.nextLine());
        
        System.out.println("Enter the start date of the event: ");
        t1.setEventStart(sdf.parse(sc.nextLine()));
        
        System.out.println("Enter the end date of the event: ");
        t1.setEventFinish(sdf.parse(sc.nextLine()));
                
        eveMa.addEnvet(t1);
        
        } while (!"a".equals(sc.nextLine()));
        
//        for(String ev : eventList){
//            System.out.println(ev);
//        }

        eveMa.listEvents();
        
        
        
    }
    
}
