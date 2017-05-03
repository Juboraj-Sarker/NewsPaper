package com.juborajsarker.readnewspapers;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class BangladeshFragment extends Fragment {

    ImageView prothom_alo, kaler_kontho, ittefaq, jugantor, bangladesh_protidin, jay_jay_din, amar_desh, vorer_kagoj,
              inkilab, amader_somoy, daily_star, news_today, new_nation, new_age;


    public BangladeshFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bangladesh, container, false);

        prothom_alo = (ImageView) view.findViewById(R.id.prothom_alo);
        kaler_kontho = (ImageView) view.findViewById(R.id.kaler_kontho);
        ittefaq = (ImageView) view.findViewById(R.id.ittefaq);
        jugantor = (ImageView) view.findViewById(R.id.jugantor);
        bangladesh_protidin = (ImageView) view.findViewById(R.id.bangladesh_protidin);
        jay_jay_din = (ImageView) view.findViewById(R.id.jay_jay_din);
        amar_desh = (ImageView) view.findViewById(R.id.amar_desh);
        vorer_kagoj = (ImageView) view.findViewById(R.id.vorer_kagoj);
        inkilab = (ImageView) view.findViewById(R.id.inkilab);
        amader_somoy = (ImageView) view.findViewById(R.id.amader_somoy);
        daily_star = (ImageView) view.findViewById(R.id.daily_star);
        news_today = (ImageView) view.findViewById(R.id.news_today);
        new_nation = (ImageView) view.findViewById(R.id.new_nation);
        new_age = (ImageView) view.findViewById(R.id.new_age);

        prothom_alo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),WebviewActivity.class);
                intent.putExtra("webviewValue", "prothom_alo");
                startActivity(intent);
            }
        });


        kaler_kontho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),WebviewActivity.class);
                intent.putExtra("webviewValue", "kaler_kontho");
                startActivity(intent);

            }
        });


        ittefaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),WebviewActivity.class);
                intent.putExtra("webviewValue", "ittefaq");
                startActivity(intent);

            }
        });


        jugantor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),WebviewActivity.class);
                intent.putExtra("webviewValue", "jugantor");
                startActivity(intent);

            }
        });


        bangladesh_protidin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),WebviewActivity.class);
                intent.putExtra("webviewValue", "bangladesh_protidin");
                startActivity(intent);

            }
        });


        jay_jay_din.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),WebviewActivity.class);
                intent.putExtra("webviewValue", "jay_jay_din");
                startActivity(intent);

            }
        });

        amar_desh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),WebviewActivity.class);
                intent.putExtra("webviewValue", "amar_desh");
                startActivity(intent);

            }
        });


        vorer_kagoj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),WebviewActivity.class);
                intent.putExtra("webviewValue", "vorer_kagoj");
                startActivity(intent);

            }
        });



        inkilab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),WebviewActivity.class);
                intent.putExtra("webviewValue", "inkilab");
                startActivity(intent);

            }
        });


        amader_somoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),WebviewActivity.class);
                intent.putExtra("webviewValue", "amader_somoy");
                startActivity(intent);

            }
        });


        daily_star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),WebviewActivity.class);
                intent.putExtra("webviewValue", "daily_star");
                startActivity(intent);

            }
        });


        news_today.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),WebviewActivity.class);
                intent.putExtra("webviewValue", "news_today");
                startActivity(intent);

            }
        });


        new_nation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),WebviewActivity.class);
                intent.putExtra("webviewValue", "new_nation");
                startActivity(intent);

            }
        });


        new_age.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),WebviewActivity.class);
                intent.putExtra("webviewValue", "new_age");
                startActivity(intent);

            }
        });





        return view;
    }

}
