package com.example.onlineshopping;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class AddToCart extends Activity {
	
	ListView lv;
	Button b;
	String [] stars;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_to_cart);
		Button bt1 = (Button) findViewById(R.id.cartbt1);
		lv = (ListView) findViewById(R.id.lv);
		b = (Button) findViewById(R.id.cartbt1);
		stars = getResources().getStringArray(R.array.items);
		
		final ArrayAdapter<String> adapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_multiple_choice, stars);
		lv.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
		lv.setAdapter(adapter);
		

		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			
				SparseBooleanArray check = lv.getCheckedItemPositions();
				String array[] = new String[4];
				 ArrayList<String> aa = new ArrayList<String>(); 

				for(int i=0;i<check.size();i++)
				{ 
					int pos = check.keyAt(i); 
					if (check.valueAt(i)) 
					{
						aa.add(adapter.getItem(i));
						array[i] = adapter.getItem(i);
					}
				}
				
				int n=lv.getCheckedItemCount();
				
				try{
				FileOutputStream fout = openFileOutput("MyData.txt", MODE_PRIVATE);
				OutputStreamWriter osw = new OutputStreamWriter(fout);
				for (int k = 0; k < aa.size(); k++)
				osw.write(aa.get(k) + ","); 
				osw.close();
				}
				
				catch(FileNotFoundException e1)
				{}
				catch(IOException e)
				{}
				
				if(n==0)
					Toast.makeText(getBaseContext(), "Please Select a Course", Toast.LENGTH_SHORT).show();
				else
				{
				Bundle b = new Bundle();
				b.putStringArray("strarray", array);
				Intent i30 = new Intent(AddToCart.this,Checkout.class);
				i30.putExtras(b);
				startActivity(i30);
				}				
			}
		});

	

}
	}
