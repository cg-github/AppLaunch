package com.example.cheng.applaunch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyOnClickListener myOnClickListener = new MyOnClickListener();
        btn = (Button) findViewById(R.id.btn_movie);
        btn.setOnClickListener(myOnClickListener);
        btn = (Button) findViewById(R.id.btn_finance);
        btn.setOnClickListener(myOnClickListener);
        btn= (Button) findViewById(R.id.btn_reader);
        btn.setOnClickListener(myOnClickListener);
        btn = (Button) findViewById(R.id.btn_news);
        btn.setOnClickListener(myOnClickListener);
        btn = (Button) findViewById(R.id.btn_graduation);
        btn.setOnClickListener(myOnClickListener);
    }

    class MyOnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_movie:
                    Toast.makeText(getApplicationContext(),"最新电影",Toast.LENGTH_LONG).show();
                    break;
                case R.id.btn_finance:
                    Toast.makeText(getApplicationContext(),"股票雄鹰",Toast.LENGTH_LONG).show();
                    break;
                case R.id.btn_reader:
                    Toast.makeText(getApplicationContext(),"XYZ阅读器",Toast.LENGTH_LONG).show();
                    break;
                case R.id.btn_news:
                    Toast.makeText(getApplicationContext(),"最新闻",Toast.LENGTH_LONG).show();
                    break;
                case R.id.btn_graduation:
                    Toast.makeText(getApplicationContext(),"毕业设计",Toast.LENGTH_LONG).show();
                    break;
                default:
                    break;
            }
        }
    }
}
