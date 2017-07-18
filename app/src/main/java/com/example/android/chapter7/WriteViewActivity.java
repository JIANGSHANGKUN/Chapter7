package com.example.android.chapter7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WriteViewActivity extends AppCompatActivity {

    private WriteView1 writeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_view);

        writeView = (WriteView1) findViewById(R.id.write_view);



    }
}
