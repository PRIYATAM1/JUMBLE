package com.example.jumblegameproject;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class SplashActivity extends Activity {
MediaPlayer mp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Log.i("MY NIT APP","MY SPLASH STATED ");
        mp1=MediaPlayer.create(this, R.drawable.sm1);
        mp1.start();
        Thread t=new Thread()
        {
        	public void run()
        	{
        		try
        		{
        			sleep(3000);
        			Intent i=new Intent(SplashActivity.this,GAMEActivity.class);
        			startActivity(i);
        		}
        		catch(Exception e){}
        	}
        };
        t.start();
        		
    }
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		mp1.release();
		finish();
	}
    
}
