/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaO;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author wellington
 */
public class dates2 {
    
    
    
    public static void main(String [] args) throws ParseException{
    
        
        Calendar cal = Calendar.getInstance();
        cal.set(1994, cal.MAY,10);
        Date date = cal.getTime();
        
//        System.out.println("javaO.dates2.main()"+ cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(date);
        
//        Date format 
        DateFormat f = DateFormat.getDateInstance();
        f.format(date);
        System.out.println("This format "+ f.format(date));
        
//        Time format
        DateFormat t = DateFormat.getTimeInstance();
        System.out.println(t.format(date));
        
//        date and hour format
        DateFormat dh = DateFormat.getDateTimeInstance();
        System.out.println(dh.format(date));
        
//        Change the style format
        dh = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(dh.format(date));
        
        dh = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(dh.format(date));
        
        dh = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(dh.format(date));
        
//        Display the date in a two number division
        dh = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(dh.format(date));
        
//        Manually, creating a date throught a string
        Date date2 = f.parse("19/02/2024");
        System.out.println("thiss "+date2);
        
//        SimpleDateFormat
//this class can receive on its constructor the date pattern
// the field can be changes its order
        SimpleDateFormat sdf = new SimpleDateFormat("dd/yyyy/mm");
        System.out.println("year "+sdf.format(date2));
        
        System.out.println("test "+sdf.parse("10/10/2010"));
                
        
        
        
    }
    
}
