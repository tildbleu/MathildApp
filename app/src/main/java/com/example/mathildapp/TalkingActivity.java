package com.example.mathildapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TalkingActivity extends AppCompatActivity {

    private EditText mMessageEditText;
    private TextView mTextHeader;
    private TextView mReplyHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talking);

        mMessageEditText = (EditText) findViewById(R.id.typedmessage);
        mTextHeader = (TextView) findViewById(R.id.text_header);
        mReplyHeader = (TextView) findViewById(R.id.text_previousmessage);
    }


    public void SendMessage(View view) {
        String previousMessage = mMessageEditText.getText().toString();
        mReplyHeader.setVisibility(View.VISIBLE);
        mTextHeader.setVisibility(View.VISIBLE);
        mReplyHeader.setText(previousMessage);
        mMessageEditText.setText("");
    }
}
