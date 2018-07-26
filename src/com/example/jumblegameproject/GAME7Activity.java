package com.example.jumblegameproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class GAME7Activity extends Activity {
	Button b7;
	EditText e7;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game7);
		Bundle bundle=getIntent().getExtras();
		final int points= bundle.getInt("points");
		b7=(Button)findViewById(R.id.next7);
		e7=(EditText)findViewById(R.id.entertext7);
		b7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String s=e7.getText().toString();
				int x=points;
				s=s.trim();
				if(s.equalsIgnoreCase("Collection"))
				{
					x++;
				}
				Intent i=new Intent(GAME7Activity.this,GAME9Activity.class);
				i.putExtra("points", x);
				startActivity(i);
				
			}
		});
	}
}
