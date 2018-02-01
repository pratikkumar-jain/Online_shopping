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
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Checkout extends Activity {
	int cost;
	int discount;
	
	String[] Banks= {
			"Bank Of India",
			"Bank Of Baroda",
			"Axis Bank",
			"Yes Bank",
			"State Bank",
			"Central Bank",
			"Syndicate Bank",
			"Bharat Bank",
			"Kotak Bank"
			};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_checkout);
		
	    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        		android.R.layout.simple_dropdown_item_1line, Banks);
        
        		final AutoCompleteTextView textView = (AutoCompleteTextView)
        		findViewById(R.id.banks);
        
        		textView.setThreshold(0);
        		
        		textView.setAdapter(adapter);
	
	
        		final EditText et2 = (EditText) findViewById(R.id.et2);
        		TextView tv1 = (TextView) findViewById(R.id.checktv1);
	TextView tv2 = (TextView) findViewById(R.id.checktv2);
	TextView tv3 = (TextView) findViewById(R.id.checktv3);
	Button bt1 = (Button) findViewById(R.id.bt1);
	
	
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
         tv1.setText(temp);
	}
         catch(FileNotFoundException e){}
         catch(IOException e1){}
	Intent i31 = getIntent();
	Bundle obj = i31.getExtras();
	String[] a ={"","","",""};
	
	a=obj.getStringArray("strarray");
	
if(a[0]!=null)
	{if(a[0].equals("Android"))
	{
		cost+=4200;
		discount+=3780;
	}}
	
if(a[1]!=null)
{
		if(a[1].equals("Java"))
		{
			cost+=6000;
			discount+=5100;
		}
}	

if(a[2]!=null)
{
if(a[2].equals("Oracle"))
			{
				cost+=10000;
				discount+=9000;
			}
}

if(a[3]!=null)
{
if(a[3].equals("PHP"))
				{
					cost+=4000;
					discount+=3800;
				}

}
	
	tv2.setText(String.valueOf(cost));
	tv3.setText(String.valueOf(discount));
	final String s2 = textView.getText().toString();
	
bt1.setOnClickListener(new View.OnClickListener() {
	
	
	@Override
	public void onClick(View v) {
			if(et2.getText().toString().equals("") && textView.getText().toString().equals(""))
				{Toast.makeText(getBaseContext(), "Please fill in all the fields!", Toast.LENGTH_SHORT).show();}
			else
			{Intent i40 = new Intent(Checkout.this,Confirmation.class);
			Bundle b = new Bundle();
			b.putInt("cost", cost);
			b.putInt("discount", discount);
			i40.putExtras(b);
			startActivity(i40);
			}
			}
	
});

	}	
}
