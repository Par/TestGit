package com.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class TestGit extends Activity implements OnClickListener
{
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		View playVideoButton = findViewById(R.id.clickMe);
		playVideoButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View view)
	{
		switch (view.getId())
		{
		case R.id.clickMe:
		{
			finish();
			break;
		}
		}
	}
}