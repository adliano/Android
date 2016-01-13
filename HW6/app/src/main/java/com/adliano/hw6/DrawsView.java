/*
***********************************************************
   Author    : Adriano Alves
   Date      : May.02.2015
   Course    : CS211D Spring of 2015
   File Name : DrawsView.java
   Objective : HW6 , class extends View belongs to a application
               to draw random balloons
***********************************************************
 */

package com.adliano.hw6;

import android.content.Context;
import android.graphics.*;
import android.view.View;

class DrawsView extends View
{
    Paint paint = new Paint();
    int X, Y, xLeft, xRight, yLower, RADIUS;

    //*************** default constructor *************//
    public DrawsView(Context context)
    {
        super(context);
    }
    //************************ constructor ****************************//
    public DrawsView(Context context, Point point, int radius, int color)
    {
        super(context);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(5);
        paint.setColor(color);
        X = point.x;
        Y = point.y;
        RADIUS = radius;
    }
    //************** onDraw() *************//
    @Override
    public void onDraw(Canvas canvas)
    {
        xLeft = (X)-RADIUS;
        xRight = (X)+RADIUS;
        yLower = (Y)+(3*RADIUS)/2;
        // drawing the balloon
        canvas.drawLine(X, yLower, X, Y + (5 * RADIUS / 2), paint);
        canvas.drawCircle(X, Y, RADIUS, paint);
        canvas.drawArc(xLeft, Y - RADIUS * 3 / 2, X + RADIUS, yLower, 0, 180, true, paint);
    }
}
//********** END **********//