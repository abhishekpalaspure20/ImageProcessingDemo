package com.example.imageprocessingdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileWriter;

public class CasetteActivity extends AppCompatActivity {
    Button b1, b2, b3;
    ImageView im;
TextView textView;
    private Bitmap bmp;
    private Bitmap operation;
    int centW, intH;
int count =0;
    int stored_x,stored_y;
    String  first_added= "0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casette);

        im = (ImageView) findViewById(R.id.testKitImageView);
        textView = (TextView) findViewById(R.id.textView);



//        ColorMatrix matrix = new ColorMatrix();
//        matrix.setSaturation(0);
//
//        ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrix);
//        im.setColorFilter(filter);

        BitmapDrawable abmp = (BitmapDrawable) im.getDrawable();
        bmp = abmp.getBitmap();

        Bitmap resizedBitmap = Bitmap.createScaledBitmap(
                bmp, 273,1043, false);

        // toGrayscale(bmp);
      //  test(resizedBitmap);
    //    createBlackAndWhite(resizedBitmap);
      //  test(resizedBitmap);
        // getImage();
        imagesAreEqual(resizedBitmap);

      //  changeBitmapContrastBrightness(resizedBitmap,10,-255);


        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;
        centW = bmp.getWidth() / 2;
        intH = height / 2;
        Log.i("JIJI", "RR 00 h =" + height + " we=" + width);
    }

    public void getImage() {
        Log.i("TTTT", "RR 1");
        //    operation = Bitmap.createBitmap(bmp.getWidth(),bmp.getHeight(), bmp.getConfig());
        double red = 0.33;
        double green = 0.59;
        double blue = 0.11;
//height = 596  end height = 650   width = 155
//        for (int i = 155; i < bmp.getWidth(); i++) {
//            for (int j = 596; j < 650; j++) {
//                for (int i = 0; i < bmp.getWidth(); i++) {
//            for (int j = 0; j <bmp.getHeight(); j++) {

                for (int i = 123; i < 156; i++) {
                    for (int j = 536; j < 581; j++) {
                Log.i("TTTT", "RR 2");
                int p = bmp.getPixel(i, j);
                int a = Color.alpha(p);
                Log.i("ALPHA", "RR ALPHA =" + a);
                int r = Color.red(p);
                Log.i("TTTT", "RR 3");
                int g = Color.green(p);
                Log.i("TTTT", "RR 4");
                int b = Color.blue(p);
                Log.i("PIXEL", "px = " + p);
                String hex = String.format("#%02X%02X%02X", r, g, b);
                //  String hex = String.format("#%02X%02X%02X", a,red, green, blue);

                System.out.println(hex);
                Log.i("ZZZZ", "RR 5 =" + hex);
                if (hex.equals("#000000") || hex.equals("#010101")) {
                    count++;
                  //  Toast.makeText(this, "Your are positive", Toast.LENGTH_SHORT).show();
                    //  Log.i("TAGA","COLOR  MATCHED");
                } else {
                    //   Log.i("TAG","COLOR NOT MATCHED");
                }


            }
        }
        // im.setImageBitmap(operation);
    }


    public void imagesAreEqual(Bitmap bmp) {

        operation = Bitmap.createBitmap(bmp.getWidth(), bmp.getHeight(), bmp.getConfig());
        double red = 0.33;
        double green = 0.59;
        double blue = 0.11;
        try {
            File file = new File(CasetteActivity.this.getFilesDir(), "text");
            if (!file.exists()) {
                file.mkdir();
            }
            File gpxfile = new File(file, "sample");
            FileWriter writer = new FileWriter(gpxfile);

//        for (int y = 596; y < 650; ++y)
//            for (int x = 155; x < bmp.getWidth(); ++x) {
//                for (int y = 596; y < 650; y++)
//                    for (int x = 155; x < bmp.getWidth(); x++) {

//                            for (int x = 136; x < bmp.getWidth(); x++)
//                                for (int y = 450; y < 580; y++){

//            for (int y = 0; y < bmp.getHeight(); y++)
//            for (int x = 0; x <bmp.getWidth(); x++) {
                for (int x = 0; x < bmp.getWidth(); x++)
                    for (int y = 0; y <bmp.getHeight(); y++) {

//                        for (int x = 123; x < 156; x++)
//                            for (int y = 536; y < 573; y++) {
//                        for (int x = 121; x < 150; x++)
//                            for (int y = 440; y <544; y++) {
                           // for (int y = 480; y <530; y++) {
//                        for (int x = 120; x < 160; x++)
//                            for (int y = 549; y <556; y++) {
//            for (int x = 31; x < 43; x++)
//                for (int y = 133; y < 137; y++) {
                    int p = bmp.getPixel(x, y);

                              Log.i("LLLLL","PPPP x="+bmp.getWidth() +"y ="+bmp.getHeight());
                    int a = Color.alpha(p);
                    //    Log.i("ALPHA","RR ALPHA ="+a);
                    int r = Color.red(p);
                    //   Log.i("TTTT","RR 3");
                    int g = Color.green(p);
                    //    Log.i("TTTT","RR 4");
                    int b = Color.blue(p);
                    //    Log.i("PIXEL","px = "+p);
                    String hex = String.format("#%02X%02X%02X", r, g, b);
                    //  String hex = String.format("#%02X%02X%02X", a,red, green, blue);
                    Log.i("LPLPLP", "RR 2 x=" + x + "y =" + y + " color = " + hex);


                        writer.write("RR 2 x="+x +"y ="+y +" color = "+hex + "\n");

Log.i("RDRD","WRITED");


                    System.out.println(hex);
                    //      Log.i("ZZZZ","RR 5 ="+hex);
                    if (hex.equals("#000000")) {
                      //  count++;
                        if (first_added.equals("1")) {

                            Log.i("LJLJL"," stored_x = "+stored_x+" x = "+x +"stored_y = "+stored_y+ " y ="+y);
                            if (stored_x == x && stored_y != y) {
                                Log.i("POPOP"," IN IF CONDITION");
                            }
                            else{


                                Log.i("POPOP"," count = "+count);
                                count++;
                                Log.i("TAGA", "You're test result is positive x=" + x + "y = " + y + " count =" + count);
                                stored_x = x;
                                stored_y = y;
                            }

                        } else if(first_added.equals("0")){
                            count++;
                            first_added = "1";
                            stored_x = x;
                            stored_y = y;
                            Log.i("LOLO"," IN If CONDITION");
                        }

                      //     Toast.makeText(this, "Your are positive", Toast.LENGTH_SHORT).show();
                      //  Log.i("TAGA", "You're test result is positive count ="+count);
                    } else {
                     //   Toast.makeText(this, "Your are negative", Toast.LENGTH_SHORT).show();
                        Log.i("TAGA", "You're test result is negative");
                    }
//if( y > 596 || y<650 && x>155 || x<bmp.getWidth()){

                    int img_cenh = bmp.getHeight() / 2;
                    int img_cenW = bmp.getWidth() / 2;
                    int centHF = img_cenh + 50;
                    int centWF = img_cenW + 50;

//if( y > img_cenh || y<centHF && x>img_cenW || x<centWF){
                    // Log.i("HUHU","CH = "+img_cenh+ " CW = "+img_cenW);
                    r = (int) red * r;
                    g = (int) green * g;
                    b = (int) blue * b;
                    //   operation.setPixel(x, y, Color.argb(Color.alpha(p), r, g, b));
                    //   }
                }
                        if(count>50)
                        {
                            textView.setText("You're test result is positive");
                        }
                        else{
                            textView.setText("You're test result is negative");
                        }

            writer.flush();
            writer.close();
        } catch (Exception e) {
            Log.i("AQAQ", "Errro=" + e.getMessage());
        }

        // im.setImageBitmap(operation);
    }

    public void toGrayscale(Bitmap srcImage) {

        Bitmap bmpGrayscale = Bitmap.createBitmap(srcImage.getWidth(), srcImage.getHeight(), Bitmap.Config.ARGB_8888);

        Canvas canvas = new Canvas(bmpGrayscale);
        Paint paint = new Paint();

        ColorMatrix cm = new ColorMatrix();
        cm.setSaturation(0);
        paint.setColorFilter(new ColorMatrixColorFilter(cm));
        canvas.drawBitmap(srcImage, 0, 0, paint);

        im.setImageBitmap(bmpGrayscale);
        imagesAreEqual(bmpGrayscale);
    }

    public void test(Bitmap src) {
        int width = src.getWidth();
        int height = src.getHeight();
        // create output bitmap
        Bitmap bmOut = Bitmap.createBitmap(width, height, src.getConfig());
        // color information
        int A, R, G, B;
        int pixel;
        for (int x = 0; x < width; ++x) {
            for (int y = 0; y < height; ++y) {
                // get pixel color
                pixel = src.getPixel(x, y);
                A = Color.alpha(pixel);
                R = Color.red(pixel);
                G = Color.green(pixel);
                B = Color.blue(pixel);
                int gray = (int) (0.2989 * R + 0.5870 * G + 0.1140 * B);
                // use 128 as threshold, above -> white, below -> black
                if (gray > 128) {
                    gray = 255;
                } else {
                    gray = 0;
                }
                // set new pixel color to output bitmap
                bmOut.setPixel(x, y, Color.argb(A, gray, gray, gray));
            }
        }
        im.setImageBitmap(bmOut);
        imagesAreEqual(bmOut);

      //  changeBitmapContrastBrightness(bmOut,10,-255);
    }

    public void createBlackAndWhite(Bitmap src) {
        int width = src.getWidth();
        int height = src.getHeight();

        Bitmap bmOut = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);

        final float factor = 255f;
        final float redBri = 0.2126f;
        final float greenBri = 0.2126f;
        final float blueBri = 0.0722f;

        int length = width * height;
        int[] inpixels = new int[length];
        int[] oupixels = new int[length];

        src.getPixels(inpixels, 0, width, 0, 0, width, height);

        int point = 0;
        for(int pix: inpixels){
            int R = (pix >> 16) & 0xFF;
            int G = (pix >> 8) & 0xFF;
            int B = pix & 0xFF;

            float lum = (redBri * R / factor) + (greenBri * G / factor) + (blueBri * B / factor);

            if (lum > 0.4) {
                oupixels[point] = 0xFFFFFFFF;
            }else{
                oupixels[point] = 0xFF000000;
            }
            point++;
        }
        bmOut.setPixels(oupixels, 0, width, 0, 0, width, height);
        im.setImageBitmap(bmOut);
        imagesAreEqual(bmOut);
    }


    public void changeBitmapContrastBrightness(Bitmap bmp, float contrast, float brightness)
    {
        ColorMatrix cm = new ColorMatrix(new float[]
                {
                        contrast, 0, 0, 0, brightness,
                        0, contrast, 0, 0, brightness,
                        0, 0, contrast, 0, brightness,
                        0, 0, 0, 1, 0
                });

        Bitmap ret = Bitmap.createBitmap(bmp.getWidth(), bmp.getHeight(), bmp.getConfig());

        Canvas canvas = new Canvas(ret);

        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(cm));
        canvas.drawBitmap(bmp, 0, 0, paint);

        im.setImageBitmap(ret);
        imagesAreEqual(ret);
    }
}
