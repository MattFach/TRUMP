package com.nootropica;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.nootropica.R;
import com.nootropica.adapter.biohacksAdapter;
import com.nootropica.model.BiohackModel;

public class Biohack extends Activity {
	ListView list;
	String[] title = { "Nootropics", "Supplements" };
	int[] imgid = { R.drawable.ampa, R.drawable.ampa };
	String[] disc = { "Nootropics disc", "Supplements disc" };

	ArrayList<BiohackModel> blist = new ArrayList<BiohackModel>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_biohack);

		for (int i = 0; i < title.length; i++)
		{

			BiohackModel bm = new BiohackModel();
			bm.titile = title[i];
			bm.disc = disc[i];
			bm.imageid = imgid[i];
			blist.add(bm);
		}

		list = (ListView) findViewById(R.id.biohacklist);
		biohacksAdapter adapter = new biohacksAdapter(this, blist);
		list.setAdapter(adapter);

		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

				Intent intent = new Intent(Biohack.this, DetailBiohack.class);
				intent.putExtra("id", blist.get(position).titile);
				startActivity(intent);

			}
		});

	}

}