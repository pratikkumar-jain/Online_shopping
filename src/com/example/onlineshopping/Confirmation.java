package com.example.onlineshopping;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Confirmation extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_confirmation);

		TextView ctv1 = (TextView) findViewById(R.id.ctv1);
		TextView ctv2 = (TextView) findViewById(R.id.ctv2);
		Button bt1 = (Button) findViewById(R.id.bt1c);
		Button bt2 = (Button) findViewById(R.id.bt2c);
		
		try{
			String temp="";
			StringBuffer stringBuffer = new StringBuffer();
			 FileInputStream in = openFileInput("MyData.txt");
			 InputStreamReader isr=new InputStreamReader(in);
			 char[] inputBuffer=new char[10];
			 int charRead;
			 while ((charRead = isr.read(inputBuffer))>0) {  
	            String readString=String.copyValueOf(inputBuffer,0,charRead);
	            temp+= readString;
	            inputBuffer=new char[10];  
	            
			 }
			 ctv1.setText(temp);
	    		}
	         catch(FileNotFoundException e){}
	         catch(IOException e1){}
		
		

	Intent i41 = getIntent();
	Bundle obj = i41.getExtras();
	int cost = obj.getInt("cost");
	int discount = obj.getInt("discount");
	
	
	
	ctv2.setText("Total Cost: "+String.valueOf(cost));
	
	bt1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			Intent i43 = new Intent(Confirmation.this, ThankYou.class);
			startActivity(i43);
			finish();
		}
	});

bt2.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			Intent i42 = new Intent(Confirmation.this, AddToCart.class);
			startActivity(i42);
			finish();
			// TODO Auto-generated method stub
			
		}
	});

}}
