package com.example.inf04czerwiec2022;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button polub, zapisz, usun;
    TextView likes;
    int licznik = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

            polub = (Button) findViewById(R.id.polubBtn);
            usun = (Button) findViewById(R.id.usunBtn);
            zapisz = (Button) findViewById(R.id.zapiszBtn);
            likes = (TextView) findViewById(R.id.likes);

            polub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    licznik += 1;
                    likes.setText(licznik + " polubień");
                }
            });

        usun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(licznik > 0){
                    licznik -= 1;
                    likes.setText(licznik + " polubień");
                }


            }
        });


    }
}