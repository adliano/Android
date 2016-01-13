/*
*************************************************************
   Author    : Adriano Alves
   Date      : May.02.2015
   Course    : CS211D Spring of 2015
   File Name : GenAttributes.java
   Objective : HW6, class responsible to generate
               random points (x, y) , random radius and
               random colors , it will be used at
               BalloonActivity.class
*************************************************************
 */

package com.adliano.hw6;

import android.graphics.Color;
import android.graphics.Point;

public class GenAttributes
{
    Point point;
    //int ARRAY_COLORS[];
    int INT_COLOR_RGB , radius, screenWidth, screenHeight;

    //****************** constructor ********************//
    //public GenAttributes(){}
    //****************** constructor ********************//
    /*
    public GenAttributes(int w , int h, int colors[])
    {
        screenWidth = w;
        screenHeight = h;
        ARRAY_COLORS = colors;
        radius = rand(10,200);
        point = new Point( rand(radius, screenWidth-radius),
                           rand(radius, screenHeight-(3*radius)/2) );

        //********** debugging ************
        Log.d("******** GenAttributes ","*********");
        Log.d("RADIUS Size ;", Integer.toString(radius) );
        Log.d("screenWidth =", Integer.toString(screenWidth));
        Log.d("screenHeight =", Integer.toString(screenHeight));
        Log.d("x =", Integer.toString(point.x));
        Log.d("y =", Integer.toString(point.y));
    }
    */
    //********************** constructor ******** MAY.05.2015 **//
    public GenAttributes(int w , int h)
    {
        screenWidth = w;
        screenHeight = h;
        INT_COLOR_RGB = Color.rgb(R(),R(),R());
        radius = rand(10,200);
        point = new Point( rand(radius, screenWidth-radius),
                rand(radius, screenHeight-(3*radius)/2) );
    }
    //*********************** rand() **********************//
    private int rand(int a, int b)
    {
        return((int)((b-a+1)*Math.random() + a));
    }
    //******************** R() ************ MAY.05.2015 **//
    public int R()
    {
        // method to generate random number from 0 to 255
        return (rand(0, 255));
    }
    //************************* GETTERS ***************************//
    public Point getPoint(){ return(point); }
    public Integer getIntRadius(){ return (radius); }
    public Integer getIntColorRGB(){ return INT_COLOR_RGB; }
    /*
    public Integer getIntColor()
    {
        return (ARRAY_COLORS[rand(0, (ARRAY_COLORS.length)-1)]);
    }
    */
}
//********** END **********//

