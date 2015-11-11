package com.nootropica;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailsActivity extends Activity {

	String title, disc;
	TextView disctxt, titletxt;
	ImageView img;
	int imagid;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_details);

		Bundle bundle = getIntent().getExtras();
		title = bundle.getString("title");
		disc = bundle.getString("disc");
		imagid = bundle.getInt("image");

		img = (ImageView) findViewById(R.id.img);
		titletxt = (TextView) findViewById(R.id.title);
		disctxt = (TextView) findViewById(R.id.disc);

		titletxt.setText(title);
		disctxt.setText(disc);
		Picasso.with(DetailsActivity.this).load(imagid).into(img);


	}

}