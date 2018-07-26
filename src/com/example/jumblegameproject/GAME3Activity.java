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

public class GAME3Activity extends Activity {
Button b3;
EditText e3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game3);
		Bundle bundle=getIntent().getExtras();
		final int points= bundle.getInt("points");
		b3=(Button)findViewById(R.id.next3);
		e3=(EditText)findViewById(R.id.entertext3);
		b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String s=e3.getText().toString();
				int x=points;
				s=s.trim();
				if(s.equalsIgnoreCase("Computer"))
				{
					x++;
				}
				Intent i=new Intent(GAME3Activity.this,GAME6Activity.class);
				i.putExtra("points", x);
				startActivity(i);
			}
		});
	}
}
