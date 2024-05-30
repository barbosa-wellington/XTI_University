/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaO;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author wellington
 */
public class date3 {
    
    
    public static void main(String [] args){
    
        
        Calendar c = Calendar.getInstance();
        c.set(1994, Calendar.MAY,10);
        Date date = c.getTime();
        
//        This Locale class will identify the operating system current location
        Locale pattern = Locale.getDefault();

                DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(f.format(date));
        
//        The getDisplayCountry will display the current location coutry of the individuo
        System.out.println(pattern.getDisplayCountry());
        System.out.println(pattern.getDisplayLanguage());
        System.out.println(pattern.getISO3Country());
        System.out.println(pattern.getISO3Language());
//        building a locale manually
        Locale patternBR = new Locale("ru","RU");
        
        DateFormat r = DateFormat.getDateInstance(DateFormat.FULL, patternBR);
        System.out.println(r.format(date));
        
//        The getDisplayCountry will display the current location coutry of the individuo
        System.out.println(patternBR.getDisplayCountry());
        System.out.println(patternBR.getDisplayLanguage());
        System.out.println(patternBR.getISO3Country());
        System.out.println(patternBR.getISO3Language());        
        
        Locale jap = Locale.JAPAN;
        DateFormat u = DateFormat.getDateInstance(DateFormat.FULL, jap);
        System.out.println(u.format(date));
        
        
        Locale eua = Locale.US;
        DateFormat us = DateFormat.getDateInstance(DateFormat.FULL, eua);
        System.out.println(us.format(date));
        
        
        
        
        

    }
    
}
