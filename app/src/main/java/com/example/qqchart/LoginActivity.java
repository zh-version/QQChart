package com.example.qqchart;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LoginActivity extends Activity implements View.OnClickListener {
    private Intent intent;
    private LinearLayout layout;
    private EditText editText_Account, editText_Password;
    private TextView textView_forgetPassword, textView_newUserRegister,
            textView_agree;
    private ImageView imageView_check_circle, imageView_admin_circle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);

        init();
    }

    private void init() {
        editText_Account = (EditText) findViewById(R.id.editText_Account);
        editText_Password = (EditText) findViewById(R.id.editText_Password);

        findViewById(R.id.textView_forgetPassword).setOnClickListener(this);
        findViewById(R.id.textView_newUserRegister).setOnClickListener(this);
        findViewById(R.id.textView_agree).setOnClickListener(this);

        findViewById(R.id.button_Login).setOnClickListener(this);

        layout = (LinearLayout) findViewById(R.id.linear_check_circle);
        imageView_check_circle = (ImageView) findViewById(R.id.imageView_check_circle);
        imageView_admin_circle = (ImageView) findViewById(R.id.imageView_admin_circle);
        layout.setOnClickListener(this);
        imageView_check_circle.setOnClickListener(this);
        imageView_admin_circle.setOnClickListener(this);

    }

    @Override
    public void onClick(View arg0) {
        switch (arg0.getId()) {
            case R.id.button_Login:
                intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.textView_forgetPassword:

                break;
            case R.id.textView_newUserRegister:

                break;
            case R.id.textView_agree:

                break;
            case R.id.imageView_check_circle:
                if (imageView_check_circle.getVisibility() == arg0.VISIBLE) {
                    imageView_check_circle.setVisibility(arg0.INVISIBLE);
                }
                break;
            case R.id.linear_check_circle:
                if (imageView_check_circle.getVisibility() == arg0.INVISIBLE) {
                    layout.getChildAt(0).setVisibility(arg0.VISIBLE);
                }
                break;
            case R.id.imageView_admin_circle:

                break;
        }
    }


}
