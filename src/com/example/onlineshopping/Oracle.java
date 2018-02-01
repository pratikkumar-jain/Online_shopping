package com.example.onlineshopping;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;

public class Oracle extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_ACTION_BAR);
		setContentView(R.layout.activity_oracle);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.oracle, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item){
    	switch(item.getItemId()){
    	case R.id.main:
    	{
    		Intent i22=new Intent(Oracle.this,Homepage.class);
    		startActivity(i22);
    		finish();
    		return true;
    	}
    	case R.id.check:
    	{
    		Intent i20=new Intent(Oracle.this,Homepage.class);
    		Toast.makeText(getBaseContext(), "No Item Selected", Toast.LENGTH_LONG).show();
    		startActivity(i20);
    		finish();
    		return true;
    	}
    	
    	case R.id.add:
    	
    	{Intent i19=new Intent(Oracle.this,AddToCart.class);
		startActivity(i19);
		return true;
		}
    	case R.id.exit:
    		
    		{

    			 Intent i21=new Intent(getBaseContext(),Homepage.class);
    			 i21.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    			 i21.putExtra("exit", true);
    			 startActivity(i21);
    			 finish();
    			 return true;
    		}
    	
    	default:
    		return false; 
    	}
	}

}
