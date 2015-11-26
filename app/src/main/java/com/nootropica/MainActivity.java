package com.nootropica;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.nootropica.R;

public class MainActivity extends Activity implements OnClickListener {

	private Button biohack, lifehack, website, disclaimer;
	private TextView support;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		biohack = (Button) findViewById(R.id.biohack);
		lifehack = (Button) findViewById(R.id.lifehack);
		website = (Button) findViewById(R.id.website);
		disclaimer = (Button) findViewById(R.id.disclaimer);
		support = (TextView) findViewById(R.id.tvGoSupport);

		biohack.setOnClickListener(this);
		lifehack.setOnClickListener(this);
		website.setOnClickListener(this);
		disclaimer.setOnClickListener(this);
		support.setOnClickListener(this);

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
		case R.id.tvGoSupport:
			Intent startSupport = new Intent(this, SupportActivity.class);
			startActivity(startSupport);
			break;

		default:
			break;
		}

	}

}
