/*
Author   : Adriano Alves
Date     : Jan/12/2015
App Name : DemoIntent
 */


package com.balckshark.demointent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity
{
    Button btAudio, btPicture;
    Intent i;

    @Override
    /************* onCreate() *****************/
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        btAudio = (Button)findViewById(R.id.buttonAudio);
        btPicture = (Button)findViewById(R.id.buttonPicture);
    }
    /************** mkAudio() *************/
    public void mkAudio(View view)
    {
        i = new Intent(this,AudioActivity.class);
        callActivity(i);
    }
    /**************** tkPicture() ***************/
    public void mkPicture(View view)
    {
        i = new Intent(this, PictureActivity.class);
        callActivity(i);
    }
    /**************** callActivity() ****************/
    public void callActivity(Intent i)
    {
        if (i.resolveActivity(getPackageManager()) != null)
        {
            startActivity(i);
        }
    }
}
