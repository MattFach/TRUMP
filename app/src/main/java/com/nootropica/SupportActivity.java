package com.nootropica;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.nootropica.R;

public class SupportActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);
        //getActionBar().setDisplayHomeAsUpEnabled(true);
//        TODO: Add title bar

        setTitle("Contact Form");
        toolbar = (Toolbar) findViewById(R.id.toolbar); // Attaching the layout to the toolbar object
        setSupportActionBar(toolbar);

        Button btnCancel = (Button)findViewById(R.id.btnCancel);
        Button btnSend = (Button)findViewById(R.id.btnSend);

        btnCancel.setOnClickListener(this);
        btnSend.setOnClickListener(this);

        context = this;


    } // onCreate

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.btnCancel:
                finish();
                break;
            case R.id.btnSend:
                new AlertDialog.Builder(this)
                            .setTitle("Sent!!")
                            .setMessage("Feedback sent. Please expect 1-3 business days for reply. Thank you.")
                            .setCancelable(false)
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                }
                            }).create().show();
                break;
            default:
                break;
        } // switch
    }
}
