package com.example.imageprocessingdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



//    public void gray() {
//        operation = Bitmap.createBitmap(bmp.getWidth(),bmp.getHeight(), bmp.getConfig());
//        double red = 0.33;
//        double green = 0.59;
//        double blue = 0.11;
//
//        for (int i = 0; i < bmp.getWidth(); i++) {
//            for (int j = 0; j < bmp.getHeight(); j++) {
//                int p = bmp.getPixel(i, j);
////                int r = Color.red(p);
////                int g = Color.green(p);
////                int b = Color.blue(p);
////
////                r = (int) red * r;
////                g = (int) green * g;
////                b = (int) blue * b;
////                operation.setPixel(i, j, Color.argb(Color.alpha(p), r, g, b));
//            }
//        }
//     //   im.setImageBitmap(operation);
//    }
}