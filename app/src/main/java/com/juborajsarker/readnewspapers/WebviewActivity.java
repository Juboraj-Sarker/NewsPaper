package com.juborajsarker.readnewspapers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class WebviewActivity extends AppCompatActivity {

    InterstitialAd mInterstitialAd;

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);


        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(getString(R.string.interstitial_full_screen1));

        AdRequest adRequest = new AdRequest.Builder().addTestDevice("2BA46C54FD47FD80CBBAD95AE0F70E1A").build(); //add test device
        mInterstitialAd.loadAd(adRequest);

        mInterstitialAd.setAdListener(new AdListener() {
            public void onAdLoaded() {
                showInterstitial();
            }
        });






        webView = (WebView) findViewById(R.id.web_view);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        Intent intent = getIntent();
        String value = intent.getStringExtra("webviewValue");

        if (value.equals("prothom_alo")){

            webView.loadUrl("http://www.prothom-alo.com/");
            webView.setWebViewClient(new WebViewClient());

        }


        else if (value.equals("kaler_kontho")){

            webView.loadUrl("http://www.kalerkantho.com/");
            webView.setWebViewClient(new WebViewClient());

        }



        else if (value.equals("ittefaq")){

            webView.loadUrl("http://www.ittefaq.com.bd/");
            webView.setWebViewClient(new WebViewClient());

        }


        else if (value.equals("jugantor")){

            webView.loadUrl("http://www.jugantor.com/");
            webView.setWebViewClient(new WebViewClient());

        }


        else if (value.equals("bangladesh_protidin")){

            webView.loadUrl("http://www.bd-pratidin.com/");
            webView.setWebViewClient(new WebViewClient());

        }


        else if (value.equals("jay_jay_din")){

            webView.loadUrl("http://www.jaijaidinbd.com/");
            webView.setWebViewClient(new WebViewClient());

        }


        else if (value.equals("amar_desh")){

            webView.loadUrl("http://www.amardesh24.com/bangla/");
            webView.setWebViewClient(new WebViewClient());

        }


        else if (value.equals("vorer_kagoj")){

            webView.loadUrl("http://www.bhorerkagoj.net/");
            webView.setWebViewClient(new WebViewClient());

        }





        else if (value.equals("inkilab")){

            webView.loadUrl("https://www.dailyinqilab.com/");
            webView.setWebViewClient(new WebViewClient());

        }


        else if (value.equals("amader_somoy")){

            webView.loadUrl("http://www.dainikamadershomoy.com/");
            webView.setWebViewClient(new WebViewClient());

        }

        else if (value.equals("daily_star")){

            webView.loadUrl("http://www.thedailystar.net/");
            webView.setWebViewClient(new WebViewClient());

        }


        else if (value.equals("news_today")){

            webView.loadUrl("http://www.newstoday.com.bd/");
            webView.setWebViewClient(new WebViewClient());

        }


        else if (value.equals("new_nation")){

            webView.loadUrl("http://thedailynewnation.com/");
            webView.setWebViewClient(new WebViewClient());

        }


        else if (value.equals("new_age")){

            webView.loadUrl("http://newagebd.net/");
            webView.setWebViewClient(new WebViewClient());

        }



        else if (value.equals("the_wall_street_journal")){

            webView.loadUrl("https://www.wsj.com/asia");
            webView.setWebViewClient(new WebViewClient());

        }



        else if (value.equals("the_news_international")){

            webView.loadUrl("https://www.thenews.com.pk/");
            webView.setWebViewClient(new WebViewClient());

        }


        else if (value.equals("usa_today")){

            webView.loadUrl("https://www.usatoday.com/");
            webView.setWebViewClient(new WebViewClient());

        }



        else if (value.equals("the_new_york_times")){

            webView.loadUrl("https://www.nytimes.com/");
            webView.setWebViewClient(new WebViewClient());

        }



        else if (value.equals("al_jazeera")){

            webView.loadUrl("http://www.aljazeera.com/");
            webView.setWebViewClient(new WebViewClient());

        }


        else if (value.equals("the_guardian")){

            webView.loadUrl("https://www.theguardian.com/international");
            webView.setWebViewClient(new WebViewClient());

        }


        else if (value.equals("times_of_india")){

            webView.loadUrl("http://timesofindia.indiatimes.com/");
            webView.setWebViewClient(new WebViewClient());

        }


        else if (value.equals("irna")){

            webView.loadUrl("http://www.irna.ir/en/");
            webView.setWebViewClient(new WebViewClient());

        }


        else if (value.equals("the_washington_post")){

            webView.loadUrl("https://www.washingtonpost.com/");
            webView.setWebViewClient(new WebViewClient());

        }


        else if (value.equals("dawn")){

            webView.loadUrl("https://www.dawn.com/");
            webView.setWebViewClient(new WebViewClient());

        }


        else if (value.equals("china_daily")){

            webView.loadUrl("http://www.chinadaily.com.cn/");
            webView.setWebViewClient(new WebViewClient());

        }


        else if (value.equals("the_sydney_morning")){

            webView.loadUrl("http://www.smh.com.au/");
            webView.setWebViewClient(new WebViewClient());

        }


        else if (value.equals("herald_sun")){

            webView.loadUrl("http://www.heraldsun.com.au/");
            webView.setWebViewClient(new WebViewClient());

        }


        else if (value.equals("news_day")){

            webView.loadUrl("http://www.newsday.com/");
            webView.setWebViewClient(new WebViewClient());

        }












    }



    public void onBackPressed() {

        if (webView.canGoBack()){

            webView.goBack();
        }else {

            super.onBackPressed();
        }


    }






    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }






}
