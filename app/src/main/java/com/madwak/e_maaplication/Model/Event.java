package com.madwak.e_maaplication.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nandawk on 1/1/18.
 */

public class Event {
    @SerializedName("id_dkm")
    private String id_event;
    @SerializedName("nama_event")
    private String nama_event;
    @SerializedName("pemateri")
    private String pemateri;
    @SerializedName("lokasi_event")
    private String lokasi_event;
    @SerializedName("tlp_event")
    private String tlp_event;
    @SerializedName("waktu_event")
    private String waktu_event;

    public Event(){}

    public Event(String id_event,String nama_event, String pemateri, String lokasi_event, String tlp_event, String waktu_event){
        this.id_event = id_event;
        this.nama_event = nama_event;
        this.pemateri = pemateri;
        this.lokasi_event = lokasi_event;
        this.tlp_event = tlp_event;
        this.waktu_event = waktu_event;
    }

    public String getIdEvent(){
        return id_event;
    }

    public void setIdEvent(String id_event){
        this.id_event = id_event;
    }

    public String getNamaEvent(){
        return nama_event;
    }

    public void setNamaEvent(String nama_event){
        this.nama_event = nama_event;
    }

    public String getPemateri(){
        return pemateri;
    }

    public void setPemateri(String pemateri){
        this.pemateri = pemateri;
    }

    public String getLokasiEvent(){
        return lokasi_event;
    }

    public void setLokasiEvent(String lokasi_event){
        this.lokasi_event = lokasi_event;
    }

    public String getTlpEvent(){
        return tlp_event;
    }

    public void setTlpEvent(String tlp_event){
        this.tlp_event = tlp_event;
    }

    public String getWaktuEvent(){
        return waktu_event;
    }

    public void setWaktuEvent(String waktu_event){
        this.waktu_event = waktu_event;
    }
}
