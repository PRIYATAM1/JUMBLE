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

public class GAME1Activity extends Activity {
Button b;
EditText enterword;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game1);
		Bundle bundle=getIntent().getExtras();
		final int points= bundle.getInt("points");
		b=(Button)findViewById(R.id.next1);
		enterword=(EditText)findViewById(R.id.entertext1);
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String s=enterword.getText().toString();
				int x=points;
				s=s.trim();
				if(s.equalsIgnoreCase("Facebook"))
				{
					x++;
				}
				Intent i=new Intent(GAME1Activity.this,GAME2Activity.class);
				i.putExtra("points", x);
				startActivity(i);
				
			}
		});
	}
}
