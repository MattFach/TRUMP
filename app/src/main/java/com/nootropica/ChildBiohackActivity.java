package com.nootropica;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.nootropica.adapter.biohacksAdapter;
import com.nootropica.model.BiohackModel;
import com.nootropica.model.RowData;

import java.util.ArrayList;

public class ChildBiohackActivity extends Activity {
	ListView list;
	ArrayList<BiohackModel> blist;
	String title, disc;
	int imagid;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_biohack);

		Bundle bundle = getIntent().getExtras();
		title = bundle.getString("title");
		disc = bundle.getString("disc");
		imagid = bundle.getInt("image");

		Log.e("","title::"+title);
		blist =	RowData.getdate(title, this, blist);

		list = (ListView) findViewById(R.id.biohacklist);
		biohacksAdapter adapter = new biohacksAdapter(this, blist);
		list.setAdapter(adapter);


		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

				Intent intent = new Intent(ChildBiohackActivity.this,
						DetailsActivity.class);
				intent.putExtra("title", blist.get(position).titile);
				intent.putExtra("disc", blist.get(position).disc);
				intent.putExtra("image", blist.get(position).imageid);
				startActivity(intent);

			}
		});

	}

}