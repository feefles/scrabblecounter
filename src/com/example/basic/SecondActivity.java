package com.example.basic;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;


public class SecondActivity extends Activity {	
	EditText edit;
	
	public final static String EXTRA_MESSAGE = "com.example.Basic.Message";
	String inputText = "";
	
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secondscreen);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		TextView txtresults = (TextView)findViewById(R.id.txtresults);
		
		Intent i = getIntent();
		String results = i.getStringExtra("results");
		txtresults.setText(results);
		//String text = MainActivity.getMessage(edit);
		
		//t = (TextView)findViewById(R.id.results);
				
		

		return true;
	}
	
	public void backScreen(View v) {
		Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
	 	startActivityForResult(myIntent,0);
	}

}
