/*
*************************************************************
   Author    : Adriano Alves
   Date      : May.02.2015
   Course    : CS211D Spring of 2015
   File Name : BalloonActivity.java
   Objective : HW6 , Activity class belongs to a application
               to draw balloons random colors, location
               and size
*************************************************************
 */

package com.adliano.hw6;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.FrameLayout;

import java.util.ArrayList;

public class BalloonActivity extends Activity
{
    FrameLayout frame ;
    Context context;
    GenAttributes genAttributes;
    ArrayList<DrawsView> arrayList = new ArrayList<>();
    int intColor, radius, screenWidth, screenHeight;

    //****************** onCreate() ***********************//
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_balloon);

        context = getApplicationContext();
        //colors = getResources().getIntArray(R.array.arrayOfColors);
        frame = (FrameLayout)findViewById(R.id.frameLayout);

        //********** getting frame size ************//
        frame.post(new Runnable() {
            @Override
            public void run() {
                screenWidth = frame.getWidth();
                screenHeight = frame.getHeight();
            }
        });

        //********** debugging ************//
        Log.d("******** onCreate() ", "*********");
        Log.d("onCreate getWidth() :", Integer.toString(screenWidth));
        Log.d("onCreate getHeight() :", Integer.toString(screenHeight));
    }
    //****************** DrawButton() **********************//
    public void drawButton(View view)
    {
        frame.removeAllViews();
        genAttributes = new GenAttributes(screenWidth, screenHeight);
        Point point = genAttributes.getPoint();
        intColor = genAttributes.getIntColorRGB();
        radius = genAttributes.getIntRadius();

        arrayList.add(new DrawsView(context,point,radius,intColor));

        for(DrawsView v : arrayList)
        {
            frame.addView(v);
        }

        //********** debugging ************//
        /*
        Log.d("******** DrawButton() ","*********");
        Log.d("DrawButton() Width :", Integer.toString(screenWidth));
        Log.d("DrawButton() Height :", Integer.toString(screenHeight));
        */
    }
    //****************** clearButton() **********************//
    public void clearButton(View view)
    {
        frame.removeAllViews();
        arrayList.clear();

        //********** debugging ************//
        /*
        Object objects[] = arrayList.toArray();
        Log.d("******** clearButton()","*********");
        Log.d("1 ARRAY SIZE :", Integer.toString(objects.length));
        Log.d("2 ARRAY SIZE :", Integer.toString(arrayList.size()));
        arrayList.clear();
        Log.d("ARRAYSIZE.clear() :", Integer.toString(arrayList.size()));
        */
    }
}

// ********* END ********** //
