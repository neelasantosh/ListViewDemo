package com.example.listviewdemo2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends Activity
{
	TextView textPRN,textName,textMarks;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.next);
		textPRN=(TextView) findViewById(R.id.textView1);
		textName=(TextView) findViewById(R.id.textView2);
		textMarks=(TextView) findViewById(R.id.textView3);
		//display data received from home
		
		Intent in=getIntent();
		Student s= (Student) in.getSerializableExtra("student");
		textPRN.setText(s.getPrn() + "");
		textMarks.setText(s.getMarks()+"");
		textName.setText(s.getName());
		
	
	}
}
