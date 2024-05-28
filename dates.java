/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaO;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author wellington
 */
public class dates {
    
    
    public static void main(String [] args){
        
//    01 January 1970

        System.out.println(System.currentTimeMillis());
        
//        Creating an object type date
        Date nw = new Date();
        
        System.out.println("javaO.dates.main()" + nw);
        
        
        Date nw1 = new Date(1_000_000_000_000L);
        System.out.println("javaO.dates.main()"+ nw1);
        
//        Methods
        System.out.println("javaO.dates.main()"+ nw1.getTime());
        nw1.setTime(1_000_000_000L);        
        nw1.compareTo(nw); //-1 - 0 - 1
        System.out.println(nw1.compareTo(nw));
    
//        Using date in Java thourgh the class calendar
// The class calendar is an abstract class which cannot be instanced.
        Calendar c = Calendar.getInstance();
        //new GregorianCalendar();
//        Here the calendar object is set manually by inputing the year, month and day.
        c.set(1994, Calendar.MAY, 10);
//      the getTime will return an object of tupe Date
        System.out.println(c.getTime());
        
//        Find good information on the calendar object.
System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        
        
//        Defining the time by set parameters
        c.set(Calendar.YEAR, 1992);
        c.set(Calendar.MONTH, 2);//Calendar.MARCH
        c.set(Calendar.DAY_OF_MONTH, 20);
        
//        By chancing the time settings, the new date is printed
        System.out.println(c.getTime());
        
//        Cleaning field
        c.clear(Calendar.MINUTE);
        c.clear(Calendar.SECOND);
    
        System.out.println(c.getTime());
        
        
//        Add time on the date
        c.add(Calendar.DAY_OF_MONTH, 1);
        c.add(Calendar.MONTH,1);
//        Calendar can also decrese the time
        c.add(Calendar.YEAR, -10);
        System.out.println(c.getTime());
        
        
//        Roll is similar to add
// By using the roll method, the additional number will not surpass the superior
// number
        c.roll(Calendar.DAY_OF_MONTH, 20);
        
        
//        Good morning.

        Calendar greeting = Calendar.getInstance();
        int currTime = greeting.get(Calendar.HOUR_OF_DAY);
        
        if (currTime <= 12){
            
            System.out.println("Good morning!");
        } else if (currTime > 12 && currTime < 17){
        
            System.out.println("Good evining.");
        } else {
            System.out.println("Good night.");
                }
        
        
        
    }
    
}
