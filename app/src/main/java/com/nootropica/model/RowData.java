package com.nootropica.model;

import android.content.Context;

import com.nootropica.R;

import java.util.ArrayList;

public class RowData
{

    public static ArrayList<BiohackModel> getdate(String name , Context context, ArrayList<BiohackModel> blist)
    {

        if (name.equals("Ampakines"))
        {
            String[] title = {};
            int[] imgid = {};
            String[] disc = {};

            blist = new ArrayList<>();
            for (int i = 0; i < title.length; i++) {
                BiohackModel bm = new BiohackModel();
                bm.titile = title[i];
                bm.disc = disc[i];
                bm.imageid = imgid[i];
                blist.add(bm);
            }
            return blist;
        }
        else if (name.equals("Cholinergics"))
        {
            String[] title = {};
            int[] imgid = {};
            String[] disc = {};

            blist = new ArrayList<>();
            for (int i = 0; i < title.length; i++)
            {
                BiohackModel bm = new BiohackModel();
                bm.titile = title[i];
                bm.disc = disc[i];
                bm.imageid = imgid[i];
                blist.add(bm);
            }
            return blist;
        }
        else if (name.equals("Herbs"))
        {
            String[] title = {"Bacopa Monnieri"};
            int[] imgid = {R.drawable.bacopa,};
            String[] disc = {  context.getResources().getString(R.string.Bacopa) };


            blist = new ArrayList<>();
            for (int i = 0; i < title.length; i++) {
                BiohackModel bm = new BiohackModel();
                bm.titile = title[i];
                bm.disc = disc[i];
                bm.imageid = imgid[i];
                blist.add(bm);
            }
            return blist;

        }
        else if (name.equals("Monoaminergics"))
        {
            String[] title = {};
            int[] imgid = {};
            String[] disc = {};

            blist = new ArrayList<>();
            for (int i = 0; i < title.length; i++)
            {
                BiohackModel bm = new BiohackModel();
                bm.titile = title[i];
                bm.disc = disc[i];
                bm.imageid = imgid[i];
                blist.add(bm);
            }
            return blist;
        }
        else if (name.equals("Neurogenics"))
        {
            String[] title = {};
            int[] imgid = {};
            String[] disc = {};

            blist = new ArrayList<>();
            for (int i = 0; i < title.length; i++)
            {
                BiohackModel bm = new BiohackModel();
                bm.titile = title[i];
                bm.disc = disc[i];
                bm.imageid = imgid[i];
                blist.add(bm);
            }
            return blist;
        }
        else if (name.equals("Peptides")) 
		{
			String[] title = {"Noopept"};
            int[] imgid = {R.drawable.noopept};
            String[] disc = {context.getResources().getString(R.string.Noopept) };
            
			blist = new ArrayList<>();
            for (int i = 0; i < title.length; i++) {
                BiohackModel bm = new BiohackModel();
                bm.titile = title[i];
                bm.disc = disc[i];
                bm.imageid = imgid[i];
                blist.add(bm);
            }
            return blist;
        }
        else if (name.equals("Other"))
        {
            String[] title = {};
            int[] imgid = {};
            String[] disc = {};

            blist = new ArrayList<>();
            for (int i = 0; i < title.length; i++) {
                BiohackModel bm = new BiohackModel();
                bm.titile = title[i];
                bm.disc = disc[i];
                bm.imageid = imgid[i];
                blist.add(bm);
            }
            return blist;
        }
        else if (name.equals("Racetams")) 
		{
            String[] title = {"Aniracetam", "Brivaracetam", "Coluracetam", "Dimiracetam", "Etiracetam", "Fasoracetam", "Levetiracetam", "Nebracetam", "Nefiracetam", "Nicoracetam", "Oxiracetam", "Phenylpiracetam", "Piracetam", "Pramiracetam", "Rolziracetam"};
            int[] imgid = {R.drawable.aniracetam, R.drawable.brivaracetam,
                    R.drawable.coluracetam, R.drawable.dimiracetam,
                    R.drawable.etiracetam, R.drawable.fasoracetam,
                    R.drawable.levetiracetam, R.drawable.nebracetam,
                    R.drawable.nefiracetam, R.drawable.nicoracetam,
                    R.drawable.oxiracetam, R.drawable.phenylpiracetam,
                    R.drawable.piracetam1, R.drawable.pramiracetam,
                    R.drawable.rolziracetam};
            String[] disc = {
                    context.getResources().getString(R.string.Aniracetam),
                    context.getResources().getString(R.string.Brivaracetam),
                    context.getResources().getString(R.string.Coluracetam),
                    context.getResources().getString(R.string.Dimiracetam),
                    context.getResources().getString(R.string.Etiracetam),
                    context.getResources().getString(R.string.Fasoracetam),
                    context.getResources().getString(R.string.Levetiracetam),
                    context.getResources().getString(R.string.Nebracetam),
                    context.getResources().getString(R.string.Nefiracetam),
                    context.getResources().getString(R.string.Nicoracetam),
                    context.getResources().getString(R.string.Oxiracetam),
                    context.getResources().getString(R.string.Phenylpiracetam),
                    context.getResources().getString(R.string.Piracetam),
                    context.getResources().getString(R.string.Pramiracetam),
                    context.getResources().getString(R.string.Rolziracetam)};
            blist = new ArrayList<>();
            for (int i = 0; i < title.length; i++) {
                BiohackModel bm = new BiohackModel();
                bm.titile = title[i];
                bm.disc = disc[i];
                bm.imageid = imgid[i];
                blist.add(bm);
            }
            return blist;
        }
        else if (name.equals("Other"))
        {
            String[] title = {};
            int[] imgid = {};
            String[] disc = {};

            blist = new ArrayList<>();
            for (int i = 0; i < title.length; i++) {
                BiohackModel bm = new BiohackModel();
                bm.titile = title[i];
                bm.disc = disc[i];
                bm.imageid = imgid[i];
                blist.add(bm);
            }
            return blist;
        }
        else if (name.equals("Vitamins"))
        {
            String[] title = {"Vitamin A", "Vitamin B1", "Vitamin B2", "Vitamin B3", "Vitamin B5" ,"Vitamin B6", "Vitamin B7","Vitamin B9", "Vitamin B12", "Vitamin B15", "Vitamin B17", "Vitamin C", "Vitamin D", "Vitamin E", "Vitamin K"};
            int[] imgid = {R.drawable.vitamina, R.drawable.vitaminb1, R.drawable.vitaminb2, R.drawable.vitaminb3, R.drawable.vitaminb5, R.drawable.vitaminb6, R.drawable.vitaminb7, R.drawable.vitaminb9, R.drawable.vitaminb12, R.drawable.vitaminb15, R.drawable.vitaminb17, R.drawable.vitaminc, R.drawable.vitamind, R.drawable.vitamine, R.drawable.vitamink};
            String[] disc = {
                    context.getResources().getString(R.string.VitaminA),
                    context.getResources().getString(R.string.VitaminB1),
                    context.getResources().getString(R.string.VitaminB2),
                    context.getResources().getString(R.string.VitaminB3),
                    context.getResources().getString(R.string.VitaminB5),
                    context.getResources().getString(R.string.VitaminB6),
                    context.getResources().getString(R.string.VitaminB7),
                    context.getResources().getString(R.string.VitaminB9),
                    context.getResources().getString(R.string.VitaminB12),
                    context.getResources().getString(R.string.VitaminB15),
                    context.getResources().getString(R.string.VitaminB17),
                    context.getResources().getString(R.string.VitaminC),
                    context.getResources().getString(R.string.VitaminD),
                    context.getResources().getString(R.string.VitaminE),
                    context.getResources().getString(R.string.VitaminK) };
            blist = new ArrayList<>();
            for (int i = 0; i < title.length; i++) {
                BiohackModel bm = new BiohackModel();
                bm.titile = title[i];
                bm.disc = disc[i];
                bm.imageid = imgid[i];
                blist.add(bm);
            }
            return blist;
        }
        else { }

        return null;

    }
}
