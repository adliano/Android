package com.adliano.demoscreensize;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends Activity
{


    @Override
    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        // Using DisplayMetrics
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        TextView textView = (TextView)findViewById(R.id.text_view);
        int w = metrics.widthPixels;
        int h = metrics.heightPixels;
        // size in inches
        int den = metrics.densityDpi;
        int wSize = w/den;
        int hSize = h/den;
        // size in DP
        float d = metrics.density;
        float wf = w/d;
        float hf = h/d;
        int intW = Math.round(w/d);
        int intH = Math.round(h/d);

        //String str = "size W:"+metrics.widthPixels+" and H:"+metrics.heightPixels ;
        String str = "sizes w ="+intW+" annd h="+intH;
        textView.setText(str);

        // Using Display
        Display display = getWindowManager().getDefaultDisplay();

        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;

        TextView textView2 = (TextView)findViewById(R.id.textView2);
        String str2 = "W:"+width+" and H:"+height;
        textView2.setText(str2);

    }
}
