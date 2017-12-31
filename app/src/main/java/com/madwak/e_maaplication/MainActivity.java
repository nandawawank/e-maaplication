package com.madwak.e_maaplication;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.madwak.e_maaplication.R;
import com.madwak.e_maaplication.network.RestClient;
import com.pacific.adapter.RecyclerAdapter;
import com.pacific.adapter.RecyclerAdapterHelper;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.swipe_refresh_layout)
    SwipeRefreshLayout swipeRefreshLayout;
    @BindView(R.id.menu_event)
    RecyclerView menuEvent;

    private RecyclerAdapter<Event> adapter;
    RestClient restClient = RestClient.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        show();
        return;

    }
    private void show() {
        adapter = new RecyclerAdapter<Event>(this, R.layout.event_row) {
            @Override
            protected void convert(RecyclerAdapterHelper helper, final Event data_task) {
                final int position = helper.getAdapterPosition();

//                Log.i(getTag(),"data task");
//                helper.setImageUrl(R.id.img_task, data_task.getGambar());
                helper.setText(R.id.judul_event, data_task.getNama_event());
//                helper.setText(R.id.maps, data_task.getMap());

                helper.setOnClickListener(R.id.cv_task, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                        Intent i = new Intent(getActivity(), KetuaDetailActivity.class);
//                        i.putExtra("status", data.getStatus());
//                        i.putExtra("id_pengajuan", data.getIdPengajuan());
//                        startActivity(i);
                    }
                });

            }
        };
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        menuEvent.setLayoutManager(llm);
        menuEvent.setAdapter(adapter);

        adapter.addAll(load());
    }


    public List<Event> load() {
        List<Event> list = new ArrayList<>();
        list.add(new Event("tilawah", "Pontianak", "27 appril","uas","","",""));
        list.add(new Event("makan bersama", "Pontianak", "27 appril","uas","","",""));
        list.add(new Event("thsin", "Pontianak", "27 appril","uas","","",""));

        return list;
    }
}

