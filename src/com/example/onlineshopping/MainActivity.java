package com.example.onlineshopping;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   
    Thread t =new Thread()
    {
    	public void run()
    	{
    		try {
				sleep(5000);
				 Intent i=new Intent(MainActivity.this,Homepage.class);
				    startActivity(i);
				    finish();
				   
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
   
    	
    }; t.start();
    
    
    		
    
    
    
    
    
    
    
    
    
    }


    
}
