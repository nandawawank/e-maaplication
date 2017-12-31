package com.madwak.e_maaplication;

/**
 * Created by BangLubzzz on 12/29/2017.
 */

public class Event {

    String nama_event;
    String tgl_pelaksanaan;
    String waktu;
    String pemateri;
    String poster_event;
    String lokasi;
    String no_tlp;

    public String getNama_event() {
        return nama_event;
    }

    public void setNama_event(String nama_event) {
        this.nama_event = nama_event;
    }

    public String getTgl_pelaksanaan() {
        return tgl_pelaksanaan;
    }

    public void setTgl_pelaksanaan(String tgl_pelaksanaan) {
        this.tgl_pelaksanaan = tgl_pelaksanaan;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getPemateri() {
        return pemateri;
    }

    public void setPemateri(String pemateri) {
        this.pemateri = pemateri;
    }

    public String getPoster_event() {
        return poster_event;
    }

    public void setPoster_event(String poster_event) {
        this.poster_event = poster_event;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getNo_tlp() {
        return no_tlp;
    }

    public void setNo_tlp(String no_tlp) {
        this.no_tlp = no_tlp;
    }



    public Event(String nama_event, String tgl_pelaksanaan, String waktu, String pemateri, String poster_event, String lokasi, String no_tlp) {
        this.nama_event = nama_event;
        this.tgl_pelaksanaan = tgl_pelaksanaan;
        this.waktu = waktu;
        this.pemateri = pemateri;
        this.poster_event = poster_event;
        this.lokasi = lokasi;
        this.no_tlp = no_tlp;
    }


}
