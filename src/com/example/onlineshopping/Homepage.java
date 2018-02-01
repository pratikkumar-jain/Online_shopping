package com.example.onlineshopping;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Homepage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_homepage);
		ImageButton a=(ImageButton)findViewById(R.id.homea);
		ImageButton j=(ImageButton)findViewById(R.id.homej);
		ImageButton o=(ImageButton)findViewById(R.id.homeo);
		ImageButton p=(ImageButton)findViewById(R.id.homep);
		
		a.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View arg0) 
			{
			Intent i2 = new Intent(Homepage.this,Android.class);
			startActivity(i2);
				
			}
		});
		
		j.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View arg0) 
			{
			Intent i3 = new Intent(Homepage.this,Java.class);
			startActivity(i3);
				
			}
		});
		
		o.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View arg0) 
			{
			Intent i4 = new Intent(Homepage.this,Oracle.class);
			startActivity(i4);
				
			}
		});
		
		p.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View arg0) 
			{
			Intent i5 = new Intent(Homepage.this,PHP.class);
			startActivity(i5);
				
			}
		});
		
		
		if(getIntent().getBooleanExtra("exit",false))
		{ 
			finish();
		}
		
		
	}
	

	
	
}
