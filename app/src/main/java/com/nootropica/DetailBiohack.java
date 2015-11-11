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

public class DetailBiohack extends Activity {
	ListView list;

	/* Nootropics */
	String[] NPtitle = { "Ampakines", "Cholinergics", "Herbs", "Monoaminergics", "Neurogenics", "Peptides", "Racetams", "Other" };
	int[] NPimgid = { R.drawable.ampa, R.drawable.ampa, R.drawable.ampa, R.drawable.ampa, R.drawable.ampa, R.drawable.ampa, R.drawable.ampa, R.drawable.ampa };
	String[] NPdisc = { "Ampakines disc", "Cholinergics disc", "Herbs disc", "Monoaminergics disc", "Neurogenics disc", "Peptides disc", "Racetams disc", "Other disc" };
	boolean[] NPhasList = { false, false, true, false, false, true, true, false };

	/* Supplements */
	String[] SPtitle = { "Amino Acids", "Herbs", "Vitamins" };
	int[] SPimgid = { R.drawable.piracetam1, R.drawable.piracetam1, R.drawable.oxiracetam, };
	String[] SPdisc = { "Amino Acids disc", "Herbs disc", "Vitamins disc" };
	boolean[] SPhasList = { false, true, true };

	ArrayList<BiohackModel> blist = new ArrayList<BiohackModel>();
	String id;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_biohack);

		Bundle bundle = getIntent().getExtras();
		id = bundle.getString("id");
		if (id.equals("Nootropics")) {
			for (int i = 0; i < NPtitle.length; i++) {

				BiohackModel bm = new BiohackModel();
				bm.titile = NPtitle[i];
				bm.disc = NPdisc[i];
				bm.imageid = NPimgid[i];
				bm.hasList= NPhasList[i];
				blist.add(bm);
			}
		} else if (id.equals("Supplements")) {
			for (int i = 0; i < SPtitle.length; i++) {

				BiohackModel bm = new BiohackModel();
				bm.titile = SPtitle[i];
				bm.disc = SPdisc[i];
				bm.imageid = SPimgid[i];
				bm.hasList= SPhasList[i];
				blist.add(bm);
			}
		}
		else {}

		list = (ListView) findViewById(R.id.biohacklist);
		biohacksAdapter adapter = new biohacksAdapter(this, blist);
		list.setAdapter(adapter);

		list.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

				if (blist.get(position).hasList) {
					Intent intent = new Intent(DetailBiohack.this,
							ChildBiohackActivity.class);
					intent.putExtra("title", blist.get(position).titile);
					intent.putExtra("disc", blist.get(position).disc);
					intent.putExtra("image", blist.get(position).imageid);
					startActivity(intent);
				} else {
					Intent intent = new Intent(DetailBiohack.this,
							DetailsActivity.class);
					intent.putExtra("title", blist.get(position).titile);
					intent.putExtra("disc", blist.get(position).disc);
					intent.putExtra("image", blist.get(position).imageid);
					startActivity(intent);
				}

			}
		});

	}
}