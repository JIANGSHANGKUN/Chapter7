package com.example.android.chapter7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WriteViewActivity extends AppCompatActivity {

    private WriteView1 writeView1;
    private WriteView2 writeView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_view);

        writeView1 = (WriteView1) findViewById(R.id.write_view1);
        writeView2 = (WriteView2) findViewById(R.id.write_view2);



    }
}
