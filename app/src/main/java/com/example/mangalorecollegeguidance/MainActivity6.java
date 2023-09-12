package com.example.mangalorecollegeguidance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {
    Button pace,canara,sahyadri,bit,joseph;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        pace= findViewById(R.id.pace);
        canara=findViewById(R.id.canara);
        sahyadri=findViewById(R.id.sahyadri);
        bit=findViewById(R.id.bit);
        joseph=findViewById(R.id.joseph);

        pace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com/maps/place/P.+A.+College+of+Engineering+(PACE)+Mangalore/@12.8070427,74.7797399,12z/data=!4m10!1m2!2m1!1smangalore+engineering+colleges+in+mangalore!3m6!1s0x3ba350a13025ca43:0xdac750c7c787bb86!8m2!3d12.8070427!4d74.9321752!15sCittYW5nYWxvcmUgZW5naW5lZXJpbmcgY29sbGVnZXMgaW4gbWFuZ2Fsb3JlWi0iK21hbmdhbG9yZSBlbmdpbmVlcmluZyBjb2xsZWdlcyBpbiBtYW5nYWxvcmWSARJlbmdpbmVlcmluZ19zY2hvb2yaASNDaFpEU1VoTk1HOW5TMFZKUTBGblNVUlRhV1ZsWDJKQkVBReABAA!16s%2Fm%2F02z1zjr?entry=ttu";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });
        canara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com/maps/place/Canara+Engineering+College/@12.8070171,74.7797396,12z/data=!4m10!1m2!2m1!1smangalore+engineering+colleges+!3m6!1s0x3ba4a7ec7cde3f61:0x375b242f31af884c!8m2!3d12.8987458!4d74.9845333!15sCh5tYW5nYWxvcmUgZW5naW5lZXJpbmcgY29sbGVnZXNaICIebWFuZ2Fsb3JlIGVuZ2luZWVyaW5nIGNvbGxlZ2VzkgESZW5naW5lZXJpbmdfc2Nob29smgEkQ2hkRFNVaE5NRzluUzBWSlEwRm5TVU5oWDNOeU9ISkJSUkFC4AEA!16s%2Fm%2F0k7yvyr?entry=ttu";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });
        sahyadri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com/maps/place/Sahyadri+College+of+Engineering+%26+Management+(Autonomous)/@12.8070171,74.7797396,12z/data=!4m10!1m2!2m1!1smangalore+engineering+colleges+!3m6!1s0x3ba358ff28ef6cf3:0xe93953598f53c53c!8m2!3d12.8665796!4d74.9253776!15sCh5tYW5nYWxvcmUgZW5naW5lZXJpbmcgY29sbGVnZXNaICIebWFuZ2Fsb3JlIGVuZ2luZWVyaW5nIGNvbGxlZ2VzkgEHY29sbGVnZZoBI0NoWkRTVWhOTUc5blMwVkpRMEZuU1VSeE5HOVVibEIzRUFF4AEA!16s%2Fg%2F11j19z28p8?entry=ttu";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });
        bit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com/maps/place/Bearys+Institute+Of+Technology+(BIT)+Mangalore/@12.8070171,74.7797396,12z/data=!4m10!1m2!2m1!1smangalore+engineering+colleges+!3m6!1s0x3ba358bcce242c21:0x5479cb95fdd00170!8m2!3d12.8459166!4d74.955241!15sCh5tYW5nYWxvcmUgZW5naW5lZXJpbmcgY29sbGVnZXNaICIebWFuZ2Fsb3JlIGVuZ2luZWVyaW5nIGNvbGxlZ2VzkgESZW5naW5lZXJpbmdfc2Nob29smgEjQ2haRFNVaE5NRzluUzBWSlEwRm5TVU5TTmxCUVgwTlJFQUXgAQA!16s%2Fm%2F0bmhs70?entry=ttu";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });
        joseph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com/maps/place/St+Joseph+Engineering+College/@12.8070171,74.7797396,12z/data=!4m10!1m2!2m1!1smangalore+engineering+colleges+!3m6!1s0x3ba359dfac132663:0xa7bf228838232d32!8m2!3d12.9107991!4d74.8986773!15sCh5tYW5nYWxvcmUgZW5naW5lZXJpbmcgY29sbGVnZXNaICIebWFuZ2Fsb3JlIGVuZ2luZWVyaW5nIGNvbGxlZ2VzkgEHY29sbGVnZZoBJENoZERTVWhOTUc5blMwVkpRMEZuU1VONU1qUTNiSGhCUlJBQuABAA!16s%2Fm%2F02r8m8b?entry=ttu";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });
    }
}