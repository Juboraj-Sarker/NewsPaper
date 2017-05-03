package com.juborajsarker.readnewspapers;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class InternationalFragment extends Fragment {

    ImageView the_wall_street_journal, the_news_international, usa_today, the_new_york_times, al_jazeera,
            the_guardian, times_of_india, irna, the_washington_post, dawn, china_daily, the_sydney_morning,
            herald_sun, news_day;


    public InternationalFragment() {




    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_international, container, false);


        the_wall_street_journal = (ImageView) view.findViewById(R.id.the_wall_street_journal);
        the_news_international = (ImageView) view.findViewById(R.id.the_news_international);
        usa_today = (ImageView) view.findViewById(R.id.usa_today);
        the_new_york_times = (ImageView) view.findViewById(R.id.the_new_york_times);
        al_jazeera = (ImageView) view.findViewById(R.id.al_jazeera);
        the_guardian = (ImageView) view.findViewById(R.id.the_guardian);
        times_of_india = (ImageView) view.findViewById(R.id.times_of_india);
        irna = (ImageView) view.findViewById(R.id.irna);
        the_washington_post = (ImageView) view.findViewById(R.id.the_washington_post);
        dawn = (ImageView) view.findViewById(R.id.dawan);
        china_daily = (ImageView) view.findViewById(R.id.chaina_daily);
        the_sydney_morning = (ImageView) view.findViewById(R.id.the_sydney_morning);
        herald_sun = (ImageView) view.findViewById(R.id.herald_sun);
        news_day = (ImageView) view.findViewById(R.id.news_day);



        the_wall_street_journal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),WebviewActivity.class);
                intent.putExtra("webviewValue", "the_wall_street_journal");
                startActivity(intent);
            }
        });



        the_news_international.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),WebviewActivity.class);
                intent.putExtra("webviewValue", "the_news_international");
                startActivity(intent);
            }
        });




        usa_today.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),WebviewActivity.class);
                intent.putExtra("webviewValue", "usa_today");
                startActivity(intent);
            }
        });




        the_new_york_times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),WebviewActivity.class);
                intent.putExtra("webviewValue", "the_new_york_times");
                startActivity(intent);
            }
        });




        al_jazeera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),WebviewActivity.class);
                intent.putExtra("webviewValue", "al_jazeera");
                startActivity(intent);
            }
        });




        the_guardian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),WebviewActivity.class);
                intent.putExtra("webviewValue", "the_guardian");
                startActivity(intent);
            }
        });




        times_of_india.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),WebviewActivity.class);
                intent.putExtra("webviewValue", "times_of_india");
                startActivity(intent);
            }
        });



        irna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),WebviewActivity.class);
                intent.putExtra("webviewValue", "irna");
                startActivity(intent);
            }
        });




        the_washington_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),WebviewActivity.class);
                intent.putExtra("webviewValue", "the_washington_post");
                startActivity(intent);
            }
        });




        dawn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),WebviewActivity.class);
                intent.putExtra("webviewValue", "dawn");
                startActivity(intent);
            }
        });



        china_daily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),WebviewActivity.class);
                intent.putExtra("webviewValue", "china_daily");
                startActivity(intent);
            }
        });



        the_sydney_morning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),WebviewActivity.class);
                intent.putExtra("webviewValue", "the_sydney_morning");
                startActivity(intent);
            }
        });




        herald_sun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),WebviewActivity.class);
                intent.putExtra("webviewValue", "herald_sun");
                startActivity(intent);
            }
        });



        news_day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),WebviewActivity.class);
                intent.putExtra("webviewValue", "news_day");
                startActivity(intent);
            }
        });






        return view;

    }

















}
