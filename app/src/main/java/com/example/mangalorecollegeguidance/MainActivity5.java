package com.example.mangalorecollegeguidance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {
    Button mite,alvas,yenepoya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        mite= findViewById(R.id.mite);
        alvas=findViewById(R.id.alvas);
        yenepoya=findViewById(R.id.yenepoya);
        mite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com/maps/place/Mangalore+Institute+of+Technology+and+Engineering,+MITE/@13.0506207,74.8140395,12z/data=!4m10!1m2!2m1!1smangalore+engineering+colleges!3m6!1s0x3ba3557f8322286d:0x258a2e8d6d4b45b0!8m2!3d13.0506207!4d74.9664748!15sCh5tYW5nYWxvcmUgZW5naW5lZXJpbmcgY29sbGVnZXNaICIebWFuZ2Fsb3JlIGVuZ2luZWVyaW5nIGNvbGxlZ2VzkgEHY29sbGVnZZoBJENoZERTVWhOTUc5blMwVkpRMEZuU1VOamVWcGlNREIzUlJBQuABAA!16s%2Fm%2F0gxzgys?entry=ttu";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });
        alvas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com/maps/place/Alva's+Institute+of+Engineering+and+Technology/@13.0236033,74.9650266,17z/data=!3m1!4b1!4m6!3m5!1s0x3ba355f5ffc25cab:0x5ef9b57c1b6279cf!8m2!3d13.0236033!4d74.9676015!16s%2Fg%2F11g7c_8d3s?entry=ttu";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });
        yenepoya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com/maps/place/Yenepoya+Institute+Of+Technology/@12.9708808,74.8905885,12.08z/data=!4m10!1m2!2m1!1smangalore+engineering+colleges!3m6!1s0x3ba4aa7ba88df529:0x551812777ca20e10!8m2!3d13.0446744!4d74.9783414!15sCh5tYW5nYWxvcmUgZW5naW5lZXJpbmcgY29sbGVnZXNaICIebWFuZ2Fsb3JlIGVuZ2luZWVyaW5nIGNvbGxlZ2VzkgEHY29sbGVnZZoBI0NoWkRTVWhOTUc5blMwVkpRMEZuU1VOUE1tVjJSbU4zRUFF4AEA!16s%2Fg%2F11h9kvdlwm?entry=ttu";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

            }
        });

    }
}