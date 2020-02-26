package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        tv = findViewById(R.id.tv1);
        tv.setText("안녕하세요");

    }

    // id가 btn_on 버튼의 onclick 속성에 처리될 이벤트 메서드
    public void clickBtnOn(View view){
        TextView t = (TextView)view;
        tv.setText(t.getText()+": 전원을 켰습니다.");

    }

    // id가 btn_off 버튼의 onclick 속성에 처리될 이벤트 메서드
    public void clickBtnOff(View view){
        TextView t = (TextView)view;
        tv.setText(t.getText()+": 전원을 껐습니다.");
    }

    public void click(View view){
        TextView t = (TextView)view;
        if(t.getText().equals("ON")){
            tv.setText(t.getText()+": 전원을 켰습니다.");
        } else if(t.getText().equals("OFF")){
            tv.setText(t.getText()+": 전원을 껐습니다.");
        }
    }


}
