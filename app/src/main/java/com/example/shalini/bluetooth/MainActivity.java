package com.example.shalini.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
ToggleButton t;
    BluetoothAdapter badp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=(ToggleButton)findViewById(R.id.t11);
        badp=BluetoothAdapter.getDefaultAdapter();
        t.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    badp.enable();
                    Toast.makeText(MainActivity.this,"bluetooth is on",Toast.LENGTH_LONG).show();
                }
                else
                {
                    badp.disable();
                }
            }
        });
    }
}
