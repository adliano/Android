package com.balckshark.demoshakescreen;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends Activity
{

    Animation animation, animation2, animation3,animation4, animation5, animation6;
    ImageButton imageButton, imageButton2, imageButton3, imageButton4, imageButton5, imageButton6;
    @Override
    /************** onCreate() **************/
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        animation = AnimationUtils.loadAnimation(this,R.anim.shake);
        animation2 = AnimationUtils.loadAnimation(this, R.anim.pressed);
        animation3 = AnimationUtils.loadAnimation(this, R.anim.rotate);
        animation4 = AnimationUtils.loadAnimation(this, R.anim.scaled);
        animation5 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        animation6 = AnimationUtils.loadAnimation(this, R.anim.traslate);
        imageButton = (ImageButton)findViewById(R.id.imageButton);
        imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
        imageButton3 = (ImageButton)findViewById(R.id.imageButton3);
        imageButton4 = (ImageButton)findViewById(R.id.imageButton4);
        imageButton5 = (ImageButton)findViewById(R.id.imageButton5);
        imageButton6 = (ImageButton)findViewById(R.id.imageButton6);
        imageButton.setAnimation(animation);
        imageButton2.setAnimation(animation2);
        imageButton3.setAnimation(animation3);
        imageButton4.setAnimation(animation4);
        imageButton5.setAnimation(animation5);
        imageButton6.setAnimation(animation6);
    }
    // shake using rotate
    /************* shakeScreen() *************/
    public void shakeButton(View view)
    {
        view.startAnimation(animation);
       // mkToast(getApplicationContext(), "ROTATE");
    }
    // shake using translate
    /***************** shakeScreen2() ************/
    public void shakeButton2(View view2)
    {
        view2.startAnimation(animation2);
        //mkToast(getApplicationContext(),"TRANSLATE");
    }
    // using translate reverse
    /**************** shakeButton3() ****************/
    public void rotateButton(View view3)
    {
        view3.startAnimation(animation3);
    }
    /************* scaleButton() *******************/
    public void scaleButton(View view)
    {
        view.startAnimation(animation4);
    }
    /***************** alphaButton() *****************/
    public void alphaButton(View view)
    {
        view.startAnimation(animation5);
    }
    /************* translateButton() *****************/
    public void translateButton(View view)
    {
        view.startAnimation(animation6);
    }
    /**************** mkToast() **************/
    public void mkToast(Context context, String str)
    {
        Toast.makeText(context, str,Toast.LENGTH_SHORT).show();
    }
}
