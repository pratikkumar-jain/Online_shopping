package com.example.onlineshopping;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;

public class Java extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_ACTION_BAR);
		setContentView(R.layout.activity_java);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.java, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item){
    	switch(item.getItemId()){
    	case R.id.main:
    	{
    		Intent i10=new Intent(Java.this,Homepage.class);
    		startActivity(i10);
    		finish();
    		return true;
    	}
    	case R.id.check:
    	{
    		Intent i11=new Intent(Java.this,Homepage.class);
    		Toast.makeText(getBaseContext(), "No Item Selected", Toast.LENGTH_LONG).show();
    		startActivity(i11);
    		finish();
    		return true;
    	}
    	
    	case R.id.add:
    	
    	{Intent i12=new Intent(Java.this,AddToCart.class);
		startActivity(i12);
		return true;
		}
    	case R.id.exit:
    		
    		{

    			 Intent i13=new Intent(getBaseContext(),Homepage.class);
    			 i13.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    			 i13.putExtra("exit", true);
    			 startActivity(i13);
    			 finish();
    			 return true;
    		}
    	
    	default:
    		return false; 
    	}
	}

}
