package com.testing.abcapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class BActivity extends AppCompatActivity implements View.OnClickListener
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		Log.i("BActivity", "onCreate");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_b);
		getSupportActionBar().setTitle("B");

		Button button = (Button)findViewById(R.id.button_b);
		button.setOnClickListener(this);
	}

	@Override
	public void onClick(View v)
	{
		Intent intent = new Intent(this, CActivity.class);
		startActivityForResult(intent, 1);
	}

	@Override
	protected void onRestart()
	{
		Log.i("BActivity", "onRestart");
		super.onRestart();
	}

	@Override
	protected void onStart()
	{
		Log.i("BActivity", "onStart");
		super.onStart();
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data)
	{
		Log.i("BActivity", "onActivityResult");
		super.onActivityResult(requestCode, resultCode, data);
	}

	@Override
	protected void onResume()
	{
		Log.i("BActivity", "onResume");
		super.onResume();
	}

	@Override
	protected void onStop()
	{
		Log.i("BActivity", "onStop");
		super.onStop();
	}

	@Override
	protected void onDestroy()
	{
		Log.i("BActivity", "onDestroy");
		super.onDestroy();
	}
}
