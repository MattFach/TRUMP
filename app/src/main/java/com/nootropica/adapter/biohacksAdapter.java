package com.nootropica.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nootropica.R;
import com.nootropica.model.BiohackModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class biohacksAdapter extends BaseAdapter {

	public static LayoutInflater inflater;
	public final Context context;
	public ArrayList<BiohackModel> list;

	public biohacksAdapter(final Context context, ArrayList<BiohackModel> list) {
		this.context = context;
		this.list = list;
		inflater = LayoutInflater.from(context);
	}

	public int getCount() {
		return list.size();
	}

	public Object getItem(int position) {
		return position;
	}

	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(final int position, View convertView, final ViewGroup parent) {

		final ViewHolder holder;

		convertView = inflater.inflate(R.layout.biohack_item, null);
		holder = new ViewHolder();
		holder.iconBiohack = (ImageView) convertView
				.findViewById(R.id.iconBiohack);
		holder.title = (TextView) convertView.findViewById(R.id.title);
		holder.disc = (TextView) convertView.findViewById(R.id.disc);

		holder.title.setText(list.get(position).titile);
		holder.disc.setText(list.get(position).disc);

		Picasso.with(context)
				.load(list.get(position).imageid)
				.resize(200, 200).centerInside()
				.into(holder.iconBiohack);


		convertView.setTag(holder);
		return convertView;
	}

	private class ViewHolder {
		TextView title, disc;
		ImageView iconBiohack;

	}



}
