package com.example.a503_.basicview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);

        // 레이아웃을 생성 - 다른 뷰들을 묶어주기 위한 뷰 그룹
        LinearLayout layout = new LinearLayout(this);

        // 뷰를 생성해서 레이아웃에 추가
        Button btn01 = new Button(this);
        btn01.setText("버튼01");
        layout.addView(btn01);

        Button btn02 = new Button(this);
        btn02.setText("버튼02");
        layout.addView(btn02);

        // Activity 의 뷰로 코드로 만든 뷰를 설정
        setContentView(layout);

    }
}
