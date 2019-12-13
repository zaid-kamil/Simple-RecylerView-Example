package com.zbk.sample2;

import android.content.Context;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ArrayList<String> names = new ArrayList<>();
        names.add("Raju");
        names.add("Kaju");
        names.add("Baju");
        names.add("Laju");
        names.add("Maju");
        names.add("Uaju");
        names.add("Qaju");
        names.add("Eaju");
        names.add("Eaju");
        names.add("Eaju");
        names.add("Eaju");
        names.add("Eaju");
        names.add("Eaju");
        names.add("Eaju");
        names.add("Eaju");
        names.add("Eaju");
        names.add("Eaju");
        names.add("Eaju");

        RecyclerView recyclerNames = findViewById(R.id.recyclerNames);
        NameAdapter adapter = new NameAdapter(this,names);
        recyclerNames.setLayoutManager(new GridLayoutManager(this,2));
        recyclerNames.setAdapter(adapter);
    }

    class NameAdapter extends RecyclerView.Adapter<Holder>{

        Context context;
        ArrayList<String> names;
        LayoutInflater inflater;

        public NameAdapter(Context context, ArrayList<String> names) {
            this.context = context;
            this.names = names;
            inflater= LayoutInflater.from(context);
        }

        @NonNull
        @Override
        public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = inflater.inflate(android.R.layout.simple_list_item_1,parent,false);
            return new Holder(v);
        }

        @Override
        public void onBindViewHolder(@NonNull Holder holder, int position) {
            String name = names.get(position);
            holder.text.setText(name);
        }

        @Override
        public int getItemCount() {
            return names.size();
        }
    }

    private class Holder  extends RecyclerView.ViewHolder{
        TextView text;
        public Holder(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(android.R.id.text1);
        }
    }
}
