package com.madwak.e_maaplication.Adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import com.madwak.e_maaplication.DetailActivity;
import com.madwak.e_maaplication.Model.Event;
import com.madwak.e_maaplication.R;

import java.util.List;

/**
 * Created by nandawk on 1/1/18.
 */

public class AdapterEvent extends RecyclerView.Adapter<AdapterEvent.MyViewHolder>{
    List<Event> mEventList;

    public AdapterEvent(List <Event> EventList){
        mEventList = EventList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_list, parent,false);
        MyViewHolder mViewHolder = new MyViewHolder(mView);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.mTextViewIdEvent.setText("Id Event = " + mEventList.get(position).getIdEvent());
        holder.mTextViewNamaEvent.setText("Nama Event = " + mEventList.get(position).getNamaEvent());
        holder.mTextViewPemateri.setText("Pemateri = " + mEventList.get(position).getPemateri());
        holder.mTextViewLokasiEvent.setText("Lokasi = " + mEventList.get(position).getLokasiEvent());
        holder.mTextViewTlpEvent.setText("Telepon = " + mEventList.get(position).getTlpEvent());
        holder.mTextViewWaktuEvent.setText("Waktu = " + mEventList.get(position).getWaktuEvent());

        holder.itemView.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View view){
               Intent mIntent = new Intent(view.getContext(), DetailActivity.class);
               mIntent.putExtra("Id Event", mEventList.get(position).getIdEvent());
               mIntent.putExtra("Nama Event", mEventList.get(position).getNamaEvent());
               mIntent.putExtra("Pemateri", mEventList.get(position).getPemateri());
               mIntent.putExtra("Lokasi", mEventList.get(position).getLokasiEvent());
               mIntent.putExtra("Telepon", mEventList.get(position).getTlpEvent());
               mIntent.putExtra("Waktu", mEventList.get(position).getWaktuEvent());
               view.getContext().startActivity(mIntent);
           }
        });
    }

    @Override
    public int getItemCount() {
        return mEventList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView
                mTextViewIdEvent, mTextViewNamaEvent, mTextViewPemateri,
                mTextViewWaktuEvent, mTextViewLokasiEvent, mTextViewTlpEvent;

        public MyViewHolder(View itemView) {
            super(itemView);
            mTextViewNamaEvent = (TextView) itemView.findViewById(R.id.nama_event);
            mTextViewPemateri = (TextView) itemView.findViewById(R.id.pemateri_event);
            mTextViewWaktuEvent = (TextView) itemView.findViewById(R.id.waktu_event);
            mTextViewTlpEvent = (TextView) itemView.findViewById(R.id.tlp_event);
        }
    }
}
