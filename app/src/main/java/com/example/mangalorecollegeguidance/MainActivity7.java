package com.example.mangalorecollegeguidance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {
    Button nitk,srinivas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        srinivas= findViewById(R.id.srinivas);
        nitk=findViewById(R.id.nitk);
        nitk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com/maps/place/National+Institute+of+Technology+Karnataka+(NITK)+Surathkal./@13.0159959,74.789527,16z/data=!4m10!1m2!2m1!1smangalore+engineering+colleges++nitk!3m6!1s0x3ba35211b768ac8f:0x6b1144ac2d5dadf3!8m2!3d13.0107776!4d74.794309!15sCiRtYW5nYWxvcmUgZW5naW5lZXJpbmcgY29sbGVnZXMgIG5pdGtaJSIjbWFuZ2Fsb3JlIGVuZ2luZWVyaW5nIGNvbGxlZ2VzIG5pdGuSARR0ZWNobmljYWxfdW5pdmVyc2l0eZoBJENoZERTVWhOTUc5blMwVkpRMEZuU1VOb2FFdGhhV3gzUlJBQuABAA!16zL20vMDQ1MmRw?entry=ttu";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });
        srinivas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com/maps/place/Srinivas+University+Institute+of+Engineering+%26Technology/@13.0159959,74.789527,16z/data=!4m10!1m2!2m1!1smangalore+engineering+colleges++nitk!3m6!1s0x3ba351eca58e1c95:0x8b3ca4ff4734ea43!8m2!3d13.0212144!4d74.7934372!15sCiRtYW5nYWxvcmUgZW5naW5lZXJpbmcgY29sbGVnZXMgIG5pdGtaJSIjbWFuZ2Fsb3JlIGVuZ2luZWVyaW5nIGNvbGxlZ2VzIG5pdGuSAQdjb2xsZWdlmgEkQ2hkRFNVaE5NRzluUzBWSlEwRm5TVU40Y1hKTFVYSm5SUkFC4AEA!16s%2Fg%2F11c3k53vtl?entry=ttu";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });


    }
}