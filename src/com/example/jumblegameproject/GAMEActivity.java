package com.example.jumblegameproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class GAMEActivity extends Activity {
Button b;
int c=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);
		b=(Button)findViewById(R.id.startgame);
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(GAMEActivity.this,GAME1Activity.class);
				i.putExtra("points", c);
				startActivity(i);
				
			}
		});
	}
}
