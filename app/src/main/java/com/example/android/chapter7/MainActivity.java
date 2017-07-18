package com.example.android.chapter7;

import android.content.res.AssetManager;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "-TAG";

    private List<String> imgs;
    private AssetManager assetManager;
    private int i;
    private ImageView imageView;

//    private ImageView imageView;
//    private ImageView imageView2;
//    private ImageView imageView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        imageView = (ImageView) findViewById(R.id.iv);
//        imageView2 = (ImageView) findViewById(R.id.iv2);
//        imageView3 = (ImageView) findViewById(R.id.iv3);

//        Drawable drawable = getResources().getDrawable(R.drawable.new_drawable);
//        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher);
//        imageView.setImageBitmap(bitmap);
//        Bitmap bitmap2 = Bitmap.createBitmap(bitmap,0,0,100,100);
//        imageView2.setImageBitmap(bitmap2);
//        Bitmap bitmap3 = Bitmap.createScaledBitmap(bitmap,50,50,false);
//        imageView3.setImageBitmap(bitmap3);
////        BitmapDrawable


        imageView = (ImageView) findViewById(R.id.img);
        Button button = (Button) findViewById(R.id.btn);
        Button button2 = (Button) findViewById(R.id.btn2);
        assetManager = getAssets();
        imgs = new ArrayList<>();
        try {
            String[] assets = assetManager.list("");
            for (int j = 0; j < assets.length; j++) {
                if (assets[j].endsWith(".jpg") || assets[j].endsWith(".jpeg")) {
                    imgs.add(assets[j]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        i = 0;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (imgs != null && imgs.size() > 0) {
                    try {
                        BitmapDrawable bitmapDrawable = (BitmapDrawable) imageView.getDrawable();
                        if (bitmapDrawable != null && !bitmapDrawable.getBitmap().isRecycled()) {
                            Log.i(TAG, "onClick: recycle");
                            bitmapDrawable.getBitmap().recycle();
                        }
                        InputStream inputStream = assetManager.open(imgs.get(i));
                        imageView.setImageBitmap(BitmapFactory.decodeStream(inputStream));
                        if (i == imgs.size() - 1) {
                            i = 0;
                        } else {
                            i++;
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick: ");
                ((BitmapDrawable) imageView.getDrawable()).getBitmap().recycle();
            }
        });
    }
}
