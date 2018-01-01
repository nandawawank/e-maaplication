package com.madwak.e_maaplication.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by nandawk on 1/1/18.
 */

public class getEvent {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    List<Event> listDataEvent;
    @SerializedName("message")
    String message;

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getMessage(){
        return message;
    }

    public List<Event> getListDataEvent(){
        return listDataEvent;
    }

    public void setListDataEvent(List<Event> listDataEvent){
        this.listDataEvent = listDataEvent;
    }
}
