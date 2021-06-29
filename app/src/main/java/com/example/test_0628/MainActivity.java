package com.example.test_0628;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //뷰 객체 참조(이 레이아웃을 실행하겠다)
        setContentView(R.layout.activity_main);

        final EditText editText = findViewById(R.id.editText);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //입력상자에 입력된 전화번호 확인
                String data = editText.getText().toString();

                //전화걸기 화면을 보여줄 인텐트 객체 생성
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(data));
                //액티비티 띄우기(응답받는 기능까지 하려면 startActivityForResult)
                startActivity(intent);
            }
        });

        Button button2=findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                ComponentName name=new ComponentName("org.techtown.samplecallintent",
                        "org.techtown.samplecallintent.MenuActivity");
                intent.setComponent(name);
                startActivityForResult(intent, 101);
            }
        });

    }


}