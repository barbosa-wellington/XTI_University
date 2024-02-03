/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package oop;

/**
 *
 * @author wellington
 */
public enum Planets {
    
    MERCURY(),
    VENUS(), 
    EARTH(), 
    MARS(), 
    JUPITER(), 
    SATURN(), 
    URANUS(), 
    NEPTUNE(), 
    PLUTO();
    
    
    public static void canIliveHere(Planets myplanet){
    
        switch(myplanet){
            
            case MERCURY:
                System.out.println("This planet is really really hot.");
                break;
            case VENUS:
                System.out.println("This planet is a little hot.");
                break;
            case EARTH:
                System.out.println("You can live on Earth.");
                break;
            case MARS:
                System.out.println("This is not yet our new planet");
                break;
            case JUPITER:
                System.out.println("this planet is a pure gas");
                break;
            case SATURN:
                System.out.println("No live here and that it is.");
                break;
            case URANUS:
                System.out.println("You cannot live here and that is it");
                break;
            case NEPTUNE:
                System.out.println("You cannot live here because it is cold and dark");
                break;
            case PLUTO:
                System.out.println("You cannot live here because it is cold");
                break;
            default:
                System.out.println("nothing was selected.");
                
    }
    
    
    }
    
}
