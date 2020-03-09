package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.os.AsyncTask;
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

//        System.out.println(R.drawable.mini);
//        System.out.println(R.layout.activity_test);
//        System.out.println(R.id.btn_on);



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

        // URL 설정.
        String url = "http://192.168.0.64:5000/sw_r";
        //String url = "https://www.naver.com";

        // AsyncTask를 통해 HttpURLConnection 수행.
        NetworkTask networkTask = new NetworkTask(url, null);
        networkTask.execute();
    }

    public class NetworkTask extends AsyncTask<Void, Void, String> {

        private String url;
        private ContentValues values;

        public NetworkTask(String url, ContentValues values) {

            this.url = url;
            this.values = values;
        }

        @Override
        protected String doInBackground(Void... params) {

            String result; // 요청 결과를 저장할 변수.
            RequestHttpURLConnection requestHttpURLConnection = new RequestHttpURLConnection();

            result = requestHttpURLConnection.request_get(url); // 해당 URL로 부터 결과물을 얻어온다.

            return result;
        }




        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            System.out.println(s+"");

            //doInBackground()로 부터 리턴된 값이 onPostExecute()의 매개변수로 넘어오므로 s를 출력한다.
            tv.setText(s+"");
        }
    }

}
