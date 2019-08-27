package com.asm.action;

import com.asm.entity.Event;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EventAction extends ActionSupport {

    private static List<Event> eventList = new ArrayList<Event>();
    private Event newEvent ;
    public static long eventId = 0;

    public Event getNewEvent() {
        return newEvent;
    }

    public void setNewEvent(Event newEvent) {
        this.newEvent = newEvent;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }

    public List<Event> getEventList() {
        return eventList;
    }

    public String createEvent(){
        this.newEvent = new Event();
        return SUCCESS;
    }
    public String deleteEvent(){

        Iterator it =  eventList.iterator();
        while (it.hasNext()){
            Event ev = (Event)it.next();
            if (ev.getId() == this.newEvent.getId()){
                System.out.println(this.newEvent.getId());
                it.remove();
                break;
            }
        }
        return SUCCESS;
    }

    public String store(){
        if(eventId != 0){
            for (int i = 0 ; i< eventList.size() ; i++){
                if (eventList.get(i).getId() == eventId){
                    this.newEvent.setId(eventId);
                    eventList.set(i,this.newEvent);
                    eventId = 0;
                    break;
                }
            }
            return SUCCESS;
        }
        if (this.newEvent != null){
            eventList.add(this.newEvent);

        }
        return SUCCESS;
    }

    public String edit(){
        eventId = this.newEvent.getId();
        System.out.println(this.newEvent.getId());
        return SUCCESS;
    }

    @Override
    public void validate() {
        if (this.newEvent == null) {
            return;
        }
        if (this.newEvent.getDate()== null
                || this.newEvent.getDate().trim().length() == 0
        ) {
            addFieldError("newEvent.date", "Date is required!");
        }
        if (this.newEvent.getInfo()== null  || this.newEvent.getInfo().trim().length() == 0){
            addFieldError("newEvent.info", "Info is required!");
        }
        if (this.newEvent.getPlanning()== null  || this.newEvent.getPlanning().trim().length() == 0){
            addFieldError("newEvent.planning", "Planning is required!");
        }
        if (this.newEvent.getTime()== null  || this.newEvent.getTime().trim().length() == 0){
            addFieldError("newEvent.time", "time is required!");
        }
        if (this.newEvent.getLocation()== null  || this.newEvent.getLocation().trim().length() == 0){
            addFieldError("newEvent.location", "location is required!");
        }
    }
}
