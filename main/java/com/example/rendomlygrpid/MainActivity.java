package com.example.rendomlygrpid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    private Button btn;
    int randomno;
    char randomChar;
    final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.tv_rendom);
        btn = findViewById(R.id.btn_click);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
              //  Random rnd = new Random();
                char randomChar = alphabet.charAt(r.nextInt(alphabet.length()));
                Log.i("myapp", "Thread ID is "+Thread.currentThread().getId() + ", Random character is "+randomChar);
                String generatedPassword = String.format("%06d", r.nextInt(1000000));
                Log.d("MyApp", "Generated Password : " + generatedPassword);

                text.setText(randomChar+""+generatedPassword);
            }
        });
    }

}
