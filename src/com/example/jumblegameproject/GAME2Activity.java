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

public class GAME2Activity extends Activity {
Button b2;
EditText e2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game2);
		Bundle bundle=getIntent().getExtras();
		final int points= bundle.getInt("points");
		b2=(Button)findViewById(R.id.next2);
		e2=(EditText)findViewById(R.id.entertext2);
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String s=e2.getText().toString();
				int x=points;
				s=s.trim();
				if(s.equalsIgnoreCase("Apple"))
				{
					x++;
				}
				Intent i=new Intent(GAME2Activity.this,GAME3Activity.class);
				i.putExtra("points", x);
				startActivity(i);
			}
		});
	}
}
