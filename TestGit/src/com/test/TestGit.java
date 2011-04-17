package com.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class TestGit extends Activity implements OnClickListener
{
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		View oneButton = findViewById(R.id.one);
		oneButton.setOnClickListener(this);

		View twoButton = findViewById(R.id.two);
		twoButton.setOnClickListener(this);

		View threeButton = findViewById(R.id.three);
		threeButton.setOnClickListener(this);

		View clickMeButton = findViewById(R.id.clickMe);
		clickMeButton.setOnClickListener(this);

		View fourButton = findViewById(R.id.four);
		fourButton.setOnClickListener(this);

		View fiveButton = findViewById(R.id.five);
		fiveButton.setOnClickListener(this);

		View sixButton = findViewById(R.id.six);
		sixButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View view)
	{
		switch (view.getId())
		{
		case R.id.one:
		{
			toastMe(getString(R.string.one));
			break;
		}
		case R.id.two:
		{
			toastMe(getString(R.string.two));
			break;
		}
		case R.id.three:
		{
			toastMe(getString(R.string.three));
			break;
		}

		case R.id.clickMe:
		{
			toastMe(getString(R.string.click_me) + "\nOoops. Gotta go! Bye!!");
			finish();
			break;
		}

		case R.id.four:
		{
			toastMe(getString(R.string.four));
			break;
		}
		case R.id.five:
		{
			toastMe(getString(R.string.five));
			break;
		}
		case R.id.six:
		{
			toastMe(getString(R.string.six));
			break;
		}
		}
	}

	private void toastMe(String myToast)
	{
		Toast toast = Toast.makeText(TestGit.this, myToast + " clicked...",
				Toast.LENGTH_LONG);
		toast.show();

	}

}