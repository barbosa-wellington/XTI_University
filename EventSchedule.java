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
        EventClass evc = new EventClass();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat f = DateFormat.getDateInstance();
        
        
        
        
        System.out.println("Enter the event's name: ");
        evc.setEventName(sc.nextLine());
        
        System.out.println("Enter the event's description: ");
        evc.setEventDescription(sc.nextLine());
        
        System.out.println("Enter the start date of the event: ");
        Date pddate = sdf.parse(sc.nextLine());
        System.out.println(pddate);
        //evc.setEventStart(sdf.format(pddate));
        System.out.println(evc.getEventStart());
        
        
                
        
    }
    
}
