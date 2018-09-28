package com.example.hoanhintern.register;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity {
    TextView tv;
    EditText edtName,edtEmail,edtPhone;
    Button bt;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init(){
        tv = (TextView)findViewById(R.id.tvTitle);
        edtEmail = (EditText)findViewById(R.id.edtEmail);
        edtName = (EditText)findViewById(R.id.edtName);
        edtPhone = (EditText)findViewById(R.id.edtPhone);
        iv = (ImageView)findViewById(R.id.iv);
    }

}
