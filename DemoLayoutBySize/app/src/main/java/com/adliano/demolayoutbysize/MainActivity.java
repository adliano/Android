/*
Author : Adriano Alves
Objective : Demo Application about different layout sizes
 */

package com.adliano.demolayoutbysize;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        float den = metrics.density;
        int d = metrics.densityDpi;
        int w = Math.round(metrics.widthPixels / den);
        int h = Math.round(metrics.heightPixels / den);
        int wp = metrics.widthPixels;
        int hp = metrics.heightPixels;
        float wtest = metrics.scaledDensity;


        Button bl = (Button)findViewById(R.id.buttonLeft);
        Button bc = (Button) findViewById(R.id.buttonCemter);
        Button br = (Button)findViewById(R.id.buttonRight);

        bl.setWidth(wp / 4);
        //bl.setTextSize((metrics.widthPixels) / 6*d);
        bl.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12);
        //bl.setTextSize((wp/wtest)/3);

        bc.setWidth(wp / 4);
        //bc.setTextSize((metrics.widthPixels / den) / 6);
        bc.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12);
        br.setWidth(wp / 4);
        //br.setTextSize((metrics.widthPixels/den)/6);
        br.setTextSize(TypedValue.COMPLEX_UNIT_SP,12);

    }
}
