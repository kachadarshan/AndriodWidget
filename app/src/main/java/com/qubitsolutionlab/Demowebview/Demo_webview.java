package com.qubitsolutionlab.Demowebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.qubitsolutionlab.demo_widget.R;

public class Demo_webview extends AppCompatActivity {

    Button button;

    WebView view;

    String strurl = "https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569897%7Cb%7Cfacebook%20log%20in%7C&placement=&creative=589460569897&keyword=facebook%20log%20in&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409266755%26loc_physical_ms%3D9302130%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwx5qoBhDyARIsAPbMagAg9ePDgVWHjIH2tGXkHUCgYVRpNR8wiPXxOdC8sc9sB6sjVD10PQsaAsqfEALw_wcB";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_webview);
        button = findViewById(R.id.btn_web);
        view = findViewById(R.id.webview);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                view.loadUrl(strurl);
                view.getSettings().getJavaScriptEnabled();
                view.setWebViewClient(new WebViewClient());
            }
        });


    }
}