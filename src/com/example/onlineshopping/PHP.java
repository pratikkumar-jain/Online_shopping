package com.example.onlineshopping;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;

public class PHP extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_ACTION_BAR);
		setContentView(R.layout.activity_php);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ph, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item){
    	switch(item.getItemId()){
    	case R.id.main:
    	{
    		Intent i15=new Intent(PHP.this,Homepage.class);
    		startActivity(i15);
    		finish();
    		return true;
    	}
    	case R.id.check:
    	{
    		Intent i16=new Intent(PHP.this,Homepage.class);
    		Toast.makeText(getBaseContext(), "No Item Selected", Toast.LENGTH_LONG).show();
    		startActivity(i16);
    		finish();
    		return true;
    	}
    	
    	case R.id.add:
    	
    	{Intent i17=new Intent(PHP.this,AddToCart.class);
		startActivity(i17);
		return true;
		}
    	case R.id.exit:
    		
    		{

    			 Intent i18=new Intent(getBaseContext(),Homepage.class);
    			 i18.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    			 i18.putExtra("exit", true);
    			 startActivity(i18);
    			 finish();
    			 return true;
    		}
    	
    	default:
    		return false; 
    	}
	}

}
