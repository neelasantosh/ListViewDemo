package com.example.listviewdemo2;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class HomeActivity extends Activity
{
	EditText editPRN,editName,editMarks;
	Button buttonAdd;
	ListView listviewStudent;
	
	ArrayList<Student> listStudents = new ArrayList<Student>();
	ArrayAdapter<Student> adapter;
	
	@Override
	protected void onCreate(Bundle b) {
		// TODO Auto-generated method stub
		super.onCreate(b);
		setContentView(R.layout.home);
		editPRN=(EditText) findViewById(R.id.editText1);
		editName=(EditText) findViewById(R.id.editText2);
		editMarks=(EditText) findViewById(R.id.editText3);
		listviewStudent=(ListView) findViewById(R.id.listView1);
		buttonAdd=(Button) findViewById(R.id.button1);
		
		//add some student objects to arraylist
		
		Student s1=new Student(1001,"Akash",22);
		Student s2=new Student(1002,"Chopra",25);
		Student s3=new Student(1003,"Dravid",34);
		listStudents.add(s1);
		listStudents.add(s2);
		listStudents.add(s3);
		
		//intialize adapter with arraylist and to listview
		adapter = new ArrayAdapter<Student>(HomeActivity.this, android.R.layout.simple_list_item_1,listStudents);
		
		listviewStudent.setAdapter(adapter);
		
		//add button listener
		buttonAdd.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String name = editName.getText().toString();
				String strPRN=editPRN.getText().toString();
				int prn=Integer.parseInt(strPRN);
				String strMarks=editMarks.getText().toString();
				float marks=Float.parseFloat(strMarks);
				Student s=new Student(prn, name, marks);
				listStudents.add(s);
				adapter.notifyDataSetChanged();
				
			}
		});
		
		//add listview item listener
		listviewStudent.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) 
			{
				
				// TODO Auto-generated method stub
				
				Student s=listStudents.get(arg2);
				
				//prepare intent for next screen
				Intent intentnext = new Intent(HomeActivity.this,NextActivity.class);
				//student is serializable
				intentnext.putExtra("student", s);
				startActivity(intentnext);
			}
		});
		
	}
}
