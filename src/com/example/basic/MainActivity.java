package com.example.basic;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText edit;
	
	public final static String EXTRA_MESSAGE = "com.example.Basic.MESSAGE";
	String inputText = "";
	static String outputOfInput;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public static String[] splitString(String input) {
    	String words[] = new String[2];
    	words = input.split(" ");
    	return words;
    	 }
	 	
	 	
	public void nextScreen(View v) {
		EditText mEdit = (EditText)findViewById(R.id.text);
		inputText= mEdit.getText().toString();
		inputText=inputText.toUpperCase();
		String[] words;
		words =splitString(inputText);
		//outputOfInput = inputText;
		String totalValue = (ScrabCount.getVal(words[0],words[1]));
	 	Intent myIntent = new Intent(getApplicationContext(), SecondActivity.class);
	 	myIntent.putExtra("results", totalValue);
	 	
	 	startActivityForResult(myIntent,0);
	 	;
	}
	 	
	 	
	

}
