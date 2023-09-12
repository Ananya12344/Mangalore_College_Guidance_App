package com.example.mangalorecollegeguidance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity8 extends AppCompatActivity {
    Button nitte,manipal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        nitte= findViewById(R.id.nitte);
        manipal=findViewById(R.id.manipal);
        nitte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com/maps/place/N.M.A.M.+Institute+of+Technology/@13.0159439,74.6298629,11z/data=!4m10!1m2!2m1!1smangalore+engineering+colleges++nitte!3m6!1s0x3bbb56415ad85e5b:0x10b77ac6f6afc7fa!8m2!3d13.1830026!4d74.933989!15sCiVtYW5nYWxvcmUgZW5naW5lZXJpbmcgY29sbGVnZXMgIG5pdHRlWiYiJG1hbmdhbG9yZSBlbmdpbmVlcmluZyBjb2xsZWdlcyBuaXR0ZZIBEmVuZ2luZWVyaW5nX3NjaG9vbJoBI0NoWkRTVWhOTUc5blMwVkpRMEZuU1VSdGExbHlTV0pCRUFF4AEA!16zL20vMDQxa25k?entry=ttu";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });
        manipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com/maps/place/Manipal+Institute+of+Technology/@13.0802574,74.5617176,10z/data=!4m10!1m2!2m1!1smangalore+engineering+colleges++manipal!3m6!1s0x3bbca4a7d2c4edb7:0x8d588d4fb81d861f!8m2!3d13.3525321!4d74.7928224!15sCidtYW5nYWxvcmUgZW5naW5lZXJpbmcgY29sbGVnZXMgIG1hbmlwYWxaKCImbWFuZ2Fsb3JlIGVuZ2luZWVyaW5nIGNvbGxlZ2VzIG1hbmlwYWySAQdjb2xsZWdlmgEjQ2haRFNVaE5NRzluUzBWSlEwRm5TVVEyTFZwZlkxUjNFQUXgAQA!16zL20vMDh0Zmsw?entry=ttu";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });


    }
}