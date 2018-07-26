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

public class GAME6Activity extends Activity {
	Button b6;
	EditText e6;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game6);
		Bundle bundle=getIntent().getExtras();
		final int points= bundle.getInt("points");
		b6=(Button)findViewById(R.id.next6);
		e6=(EditText)findViewById(R.id.entertext6);
		b6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String s=e6.getText().toString();
				int x=points;
				s=s.trim();
				if(s.equalsIgnoreCase("Android"))
				{
					x++;
				}
				Intent i=new Intent(GAME6Activity.this,GAME7Activity.class);
				i.putExtra("points", x);
				startActivity(i);
				
			}
		});
	}
}
