package com.example.jumblegameproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class GAME9Activity extends Activity {
Button b9;
TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game9);
		Bundle bundle=getIntent().getExtras();
		final int pointsNow=bundle.getInt("points");
		tv=(TextView)findViewById(R.id.scoretext);
		b9=(Button)findViewById(R.id.overbutton);
		tv.setText("Your score is "+pointsNow+" out of 5");
		b9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(GAME9Activity.this,GAMEActivity.class);
				startActivity(i);
				
			}
		});
		
	}
}
