package com.nootropica;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.nootropica.R;

public class MainActivity extends Activity implements OnClickListener {

	Button biohack, lifehack, website, disclaimer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		biohack = (Button) findViewById(R.id.biohack);
		lifehack = (Button) findViewById(R.id.lifehack);
		website = (Button) findViewById(R.id.website);
		disclaimer = (Button) findViewById(R.id.disclaimer);

		biohack.setOnClickListener(this);
		lifehack.setOnClickListener(this);
		website.setOnClickListener(this);
		disclaimer.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.biohack:
			Intent startBiohack = new Intent(this, Biohack.class);
			startActivity(startBiohack);
			break;
		case R.id.lifehack:
			Intent startLifehack = new Intent(this, Lifehack.class);
			startActivity(startLifehack);

			break;
		case R.id.website:
			Intent browserIntent = new Intent(Intent.ACTION_VIEW,
					Uri.parse("http://www.Nootropica.us"));
			startActivity(browserIntent);
			break;
		case R.id.disclaimer:
			Intent startDisclaimer = new Intent(this, Disclaimer.class);
			startActivity(startDisclaimer);
			break;

		default:
			break;
		}

	}

}
