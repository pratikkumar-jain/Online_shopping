package com.example.onlineshopping;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ThankYou extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_thank_you);
	
	Button bt1 = (Button) findViewById(R.id.bt1);
	
	bt1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			Intent i50=new Intent(getBaseContext(),Homepage.class); 
    		i50.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); 
    		i50.putExtra("exit", true); 
    		startActivity(i50); 
    		
			
		}
	});
	}

	
}
