package com.example.my2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   EditText tv;
    EditText tv2;
    TextView tv_resultado;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          tv=findViewById(R.id.TX1);
        tv2 = findViewById(R.id.TXT2);
        tv_resultado= findViewById(R.id.text_OLANOME);
        bt = findViewById(R.id.button2);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String N= tv.getText().toString();
                String N2=tv2.getText().toString();
                tv_resultado.setText("Olá" + N +""+N2);

                if (N.isEmpty() || N2.isEmpty()){
                    tv_resultado.setText("Nome não inserido");
                }
                else {
               tv_resultado.setText("Olá" + N +""+N2);
                }

            }
        });

    }
}