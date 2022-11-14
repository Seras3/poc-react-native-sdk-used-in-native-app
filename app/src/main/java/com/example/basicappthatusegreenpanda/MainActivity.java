package com.example.basicappthatusegreenpanda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.clientapp2.GreenPanda;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mButton;
    private GreenPanda mGreenPanda = new GreenPanda();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.button2);
        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        if (view.getId() == R.id.button2) {
            mGreenPanda.verifyPhone(
                    this,
                    () -> Log.d("FromMain", "Finish with Success"),
                    (message) -> Log.d("FromMain", "Error: " + message)
            );
        }
    }
}