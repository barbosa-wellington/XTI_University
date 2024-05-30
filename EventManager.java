/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wellington
 */
public class EventManager {
    
    private List<EventDef> events = new ArrayList<>();
    
    public void addEnvet(EventDef event){
        events.add(event);
    }
    
    public void listEvents(){
        
        for(EventDef event: events){
            System.out.println(event);
        }
    
    }
    
    
    
}
