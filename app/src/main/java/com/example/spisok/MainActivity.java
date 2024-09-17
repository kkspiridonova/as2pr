package com.example.spisok;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<State> states = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list);
        StateAdapter adapter = new StateAdapter(this,states);
        recyclerView.setAdapter(adapter);
    }

    private  void setInitialData(){
        states.add(new State("Япония", "Токио", R.drawable.japan));
        states.add(new State("Норвегия", "Осло", R.drawable.norway));
        states.add(new State("Россия", "Москва", R.drawable.russia));

    }
}