package com.neopixl.jessifabiocool;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bottom_button)
    Button bottomButton;
    @BindView(R.id.imageView)
    ImageView imageView;
    @BindView(R.id.button_jessi)
    Button buttonJessi;
    @BindView(R.id.image_coin)
    ImageView imageCoin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.bottom_button)
    public void onViewClicked() {

        imageView.setVisibility(View.VISIBLE);

    }

    @OnClick(R.id.button_jessi)
    public void onViewClicked2() {

        imageCoin.setVisibility(View.VISIBLE);


    }
}
