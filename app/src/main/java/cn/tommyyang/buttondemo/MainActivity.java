package cn.tommyyang.buttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button1, button2, button3;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        display = (TextView)findViewById(R.id.display);

        button2.setOnClickListener(new MyListener());
        button3.setOnClickListener(this);

        button1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("现在使用的是匿名内部类的方式在实现button点击事件的响应");
            }
        });
    }

    private class MyListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            if(v.getId() == R.id.button2){
                display.setText("现在使用的是自定义点击事件监听类来实现button点击事件的响应");
            }
        }
    }

    @Override
    public void onClick(View v) {
        display.setText("现在是使用实现View.OnClickListener接口的方式实现button点击事件的响应");
    }

    public void button4(View v){
        display.setText("现在是使用在xml布局文件指定按钮的onClick属性方式实现button点击事件的响应");
    }
}
