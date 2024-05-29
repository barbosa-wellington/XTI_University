/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

import java.util.Date;

/**
 *
 * @author wellington
 */
public class EventClass {
    
    
    
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
        
        
        private String eventName;
        private String eventDescription;
        private Date eventStart;
        private Date eventFinish;
    
}
