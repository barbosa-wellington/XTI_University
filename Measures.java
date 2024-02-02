/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package oop;

/**
 *
 * @author wellington
 * @details this is a ENUM class which allows the creation of constant variables
 * that will never change its initial value.
 */
public enum Measures {
    
    
    
    MM("Millimeter"), CM("Centimeter"), M("Meter");
    
    public String title; 
    
    // this is a constructor method that initialize the ENUM variable and its title.
    Measures(String title){
        this.title = title;
    }
    
}
