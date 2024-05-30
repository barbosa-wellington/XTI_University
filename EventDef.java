/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author wellington
 */
public class EventDef {
    
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public String getEventName() {
            return eventName;
        }

        public void setEventName(String eventName) {
            this.eventName = eventName;
        }

        public String getEventDescription() {
            return eventDescription;
        }

        public void setEventDescription(String eventDescription) {
            this.eventDescription = eventDescription;
        }

       
        
        private String eventName;
        private String eventDescription;

    public Date getEventStart() {
        return eventStart;
    }

    public void setEventStart(Date eventStart) {
        this.eventStart = eventStart;
    }

    public Date getEventFinish() {
        return eventFinish;
    }

    public void setEventFinish(Date eventFinish) {
        this.eventFinish = eventFinish;
    }
        private Date eventStart;
        private Date eventFinish;
        

//        These method are in charge of format the date to an specific pattern
    public String getFormattedStart(){
        return sdf.format(eventStart);
    }
    
    public String getFormattedEnd(){
        return sdf.format(eventFinish);
    }



//        Method override of the class EventDef to print the object details
    public String toString(){
        return getEventName() + " " + getEventStart() + " " + getEventFinish();
    }
        
    
}
