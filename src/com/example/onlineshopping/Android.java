package com.example.onlineshopping;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;

public class Android extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_ACTION_BAR);
		setContentView(R.layout.activity_android);
	}

	 public boolean onCreateOptionsMenu(Menu menu) {
	    	getMenuInflater().inflate(R.menu.android, menu);
	    	return true;
	    
	 }
	    public boolean onOptionsItemSelected(MenuItem item){
	    	switch(item.getItemId()){
	    	case R.id.main:
	    	{
	    		Intent i6=new Intent(Android.this,Homepage.class);
	    		startActivity(i6);
	    		finish();
	    		return true;
	    	}
	    	case R.id.check:
	    	{
	    		Intent i7=new Intent(Android.this,Homepage.class);
	    		Toast.makeText(getBaseContext(), "No Item Selected", Toast.LENGTH_LONG).show();
	    		startActivity(i7);
	    		finish();
	    		return true;
	    	}
	    	
	    	case R.id.add:
	    	
	    	{Intent i9=new Intent(Android.this,AddToCart.class);
    		startActivity(i9);
    		return true;
    		}
	    	case R.id.exit:
	    		
	    		{

	    			 Intent i8=new Intent(getBaseContext(),Homepage.class);
	    			 i8.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	    			 i8.putExtra("exit", true);
	    			 startActivity(i8);
	    			 finish();
	    			 return true;
	    		}
	    	
	    	default:
	    		return false; 
	    	}
	    }
	 }
