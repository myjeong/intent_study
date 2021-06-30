package com.example.test_0628;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_MENU=101;
    public static final String KEY_SIMPLE_DATA="data";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //뷰 객체 참조(이 레이아웃을 실행하겠다)
        setContentView(R.layout.activity_main);

        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                //정의한 SimpleData 클래스로 객체 생성
                SimpleData data=new SimpleData(100,"Hello, Android");

                //생성된 SimpleData 객체를 인텐트에 value로써 삽입
                intent.putExtra(KEY_SIMPLE_DATA,data);

                startActivityForResult(intent,REQUEST_CODE_MENU);
            }
        });



    }


}