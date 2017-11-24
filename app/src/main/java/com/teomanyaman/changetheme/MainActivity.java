package com.teomanyaman.changetheme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button_change_with_black)
    Button button_change_with_black;
    @BindView(R.id.button_change_with_white)
    Button button_change_with_white;
    @BindView(R.id.button_change_with_default)
    Button button_change_with_default;
    @BindView(R.id.text_name)
    TextView text_name;
    @BindView(R.id.text_job)
    TextView text_job;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button_change_with_black)
    public void changeThemeBlack() {
        Utils.changeToTheme(MainActivity.this, Utils.THEME_BLACK);
    }

    @OnClick(R.id.button_change_with_white)
    public void changeThemeWhite() {
        Utils.changeToTheme(MainActivity.this, Utils.THEME_WHITE);
    }

    @OnClick(R.id.button_change_with_default)
    public void changeThemeDefault() {
        Utils.changeToTheme(MainActivity.this, Utils.THEME_DEFAULT);
    }
}
