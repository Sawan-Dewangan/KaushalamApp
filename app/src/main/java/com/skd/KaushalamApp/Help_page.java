//Java coding for help_page Activity.
package com.skd.KaushalamApp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Help_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_page);
//setOnClickListener call by button1 for sending emails.
        Button button1 = findViewById(R.id.btn_simple);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] TO = {"sawandewangancph@gmail.com"};
                String[] CC = {""};

                Intent mailIntent = new Intent(Intent.ACTION_SEND);
                mailIntent.setData(Uri.parse("mailto:"));
                mailIntent.setType("text/plain");
                mailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
                mailIntent.putExtra(Intent.EXTRA_CC, CC);
                mailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
                mailIntent.putExtra(Intent.EXTRA_TEXT, "Message Type Here");
                startActivity(Intent.createChooser(mailIntent, "Send mail..."));
            }
        });
//setOnClickListener call by button2 for calling event.
        Button button2 = findViewById(R.id.btn_call);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:9174528931"));
                startActivity(callIntent);
            }
        });
//setOnClickListener call by button3 for whatsapp messages.
        Button button3 = findViewById(R.id.btn_whatsapp);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent whatsappIntent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://wa.me/919174528931"));
                startActivity(whatsappIntent);
            }
        });
//setOnClickListener call by button4 for opening New Activity.
        Button button4 = findViewById(R.id.button_faq);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}

