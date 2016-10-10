package com.testing.abcapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class CActivity extends AppCompatActivity implements View.OnClickListener
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_c);
		getSupportActionBar().setTitle("C");

		Button button = (Button)findViewById(R.id.button_c);
		button.setOnClickListener(this);
	}

	@Override
	public void onClick(View v)
	{
		Log.i("CActivity", "Done button is clicked");
		Intent intent = new Intent();
		setResult(RESULT_OK, intent);
		finish();
	}

	@Override
	public void onBackPressed()
	{
		Log.i("CActivity", "Hard Back button is pressed");
		Intent intent = new Intent();
		setResult(RESULT_CANCELED,intent);
		super.onBackPressed();
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		switch (item.getItemId())
		{
			case android.R.id.home:
				Log.i("CActivity", "Back button on action bar is clicked");
				Intent intent = new Intent();
				setResult(RESULT_CANCELED, intent);
				return super.onOptionsItemSelected(item);
			default:
				return super.onOptionsItemSelected(item);
		}
	}
}
