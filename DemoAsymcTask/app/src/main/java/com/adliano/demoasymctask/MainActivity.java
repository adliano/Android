/*
Author    : Adriano Alves
Date      :
Objective : Application Demo about Asymctak
            (multi-thread in android)
 */

package com.adliano.demoasymctask;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import android.widget.TextView;


public class MainActivity extends Activity
{
    TextView textView;
    /*********************** onCreate() ********************/
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView1);
    }
    /**************** startButton() ***********************/
    public void startButton(View view)
    {
        new PrintSequenceTask().execute(1);
    }

   //################# inner class ##################//
   public class PrintSequenceTask extends AsyncTask<Integer,Integer,Void>
   {
       /******************** onPreExecute() ************************/
       @Override
       public void onPreExecute()
       {
           textView.setText("Sequence numbers begins");
       }
       /******************* doInBackground() ***********************/
       @Override
       public Void doInBackground(Integer...args)
       {
           //
           for (int i=args[0]; i<=10 ; i++)
           {
               publishProgress(i);
               SystemClock.sleep(1000);
           }
           return null;
       }
       /********************** onProgressUpdate() ****************/
       @Override
       public void onProgressUpdate(Integer...args)
       {
           textView.setTextSize(80);
           textView.setText(args[0].toString());
       }
   }
   //########### end of inner class ###########//
}
//******* end *******//
