package com.example.a503_.basicview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class TestViewAttr extends AppCompatActivity {

    // 인스턴스 변수 선언
    EditText et;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_view_attr);

        et = (EditText)findViewById(R.id.edit);
        tv = (TextView)findViewById(R.id.text);

        et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                tv.setText(et.getText());

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        // XML 파일에 만든 뷰를 가져오기
        TextView tv = findViewById(R.id.길앞잡이);
        // text 속성을 설정할 때는 String 을 대입 가능
        tv.setText("킹앞잡이");
        // 가져올 때는 toString() 을 이용해서 String 으로 변환해서 가져와야 한다.
        String msg = tv.getText().toString();
    }
}
