package com.demo.Android_exercise;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

/**
 * Created by Administrator on 13-8-6.
 */
public class SecondActivity extends Activity {
    private TextView textView;
    private TextView textView2;
    private Button button;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        inint();
        setbuttonClick();
        setTextview();
    }

    private void setTextview() {
        Intent intent=this.getIntent();
//        String name=intent.getStringExtra("name");
//        String password=intent.getStringExtra("key");
        Bundle bundle=intent.getExtras();
        textView.setText("用户名是："+ bundle.getString("name"));
        textView2.setText("密码是："+bundle.getString("password"));
        ClipboardManager clipboardManager= (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
        Toast.makeText(SecondActivity.this, (CharSequence) clipboardManager.getPrimaryClip().getItemAt(0).getText(), Toast.LENGTH_LONG).show();
    }

    private void setbuttonClick() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void inint() {
        button= (Button) findViewById(R.id.button);
        textView= (TextView) findViewById(R.id.textView);
        textView2= (TextView) findViewById(R.id.textView2);
    }
}