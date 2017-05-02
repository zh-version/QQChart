package com.example.qqchart;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.Bundle;
import android.view.Window;

public class GuideActivity extends Activity {
    
    private Handler handler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    intent = new Intent(GuideActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                    overridePendingTransition(R.anim.scale_alpha_in, R.anim.scale_alpha_out);
                    break;
            }
        }
    };
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_guide);

        handler.sendEmptyMessageDelayed(1, 2000);

    }
}