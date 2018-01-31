package com.example.liqin.builduidemo;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //为进入按钮添加点击事件
        Button enterButton = (Button) findViewById(R.id.centerButton);
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "进入游戏", Toast.LENGTH_SHORT).show();
            }
        });

        //为设置按钮添加点击事件
        Button setButton = (Button) findViewById(R.id.topButton);
        setButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("提示", "需要设置什么？");
                //进入第一个界面
                Intent intent = new Intent(MainActivity.this, FirstPageActivity.class);
                startActivity(intent);
            }
        });

        //为退出按钮添加点击事件
        Button quitButton = (Button) findViewById(R.id.bottomButton);
        quitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "确认退出？", Toast.LENGTH_LONG).show();

                //进入第二个界面
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

            }
        });

        //给帮助按钮添加点击事件
        Button assistButton = (Button) findViewById(R.id.leftButton);
        assistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "有什么可以帮你？", Toast.LENGTH_LONG).show();
            }
        });

        //给风云榜按钮添加点击事件
        Button sortButton = (Button) findViewById(R.id.rightButton);
        sortButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("风云榜", "谁占据了你的封面？");
            }
        });


    }
}
