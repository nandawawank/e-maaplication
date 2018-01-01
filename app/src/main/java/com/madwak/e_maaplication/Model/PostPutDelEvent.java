package com.madwak.e_maaplication.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nandawk on 1/1/18.
 */

public class PostPutDelEvent {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    Event mEvent;
    @SerializedName("message")
    String message;
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Event getEvent() {
        return mEvent;
    }
    public void setEvent(Event Event) {
        mEvent = Event;
    }
}
