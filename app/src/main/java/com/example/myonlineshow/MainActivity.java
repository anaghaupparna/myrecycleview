package com.example.myonlineshow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<ModelClass> modelclassList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        modelclassList = new ArrayList<>();

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        Adapter adapter = new Adapter(modelclassList, MainActivity.this);
        recyclerView.setAdapter(adapter);
        modelclassList.add(new ModelClass(R.drawable.euphony, "Euphony band", "Rs 456"));
        modelclassList.add(new ModelClass(R.drawable.taylorswift, "Taylor Swift", "Rs 480"));
        modelclassList.add(new ModelClass(R.drawable.thelocaltrain, "The Local Train", "Rs 530"));
        modelclassList.add(new ModelClass(R.drawable.katyperry, "Katy Perry", "Rs 543"));
        modelclassList.add(new ModelClass(R.drawable.onedirection, "One Direction", "Rs 330"));
        adapter.notifyDataSetChanged();
    }
}