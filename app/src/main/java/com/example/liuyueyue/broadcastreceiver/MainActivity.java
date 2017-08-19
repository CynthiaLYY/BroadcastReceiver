package com.example.liuyueyue.broadcastreceiver;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static android.os.Build.VERSION_CODES.N;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //动态注册
//        IntentFilter intentFilter = new IntentFilter("BC_One");
//        BC2 bc2 = new BC2();
//        registerReceiver(bc2,intentFilter);
    }

    public  void doClick(View v){
        switch (v.getId()){
            //普通广播
            case R.id.send1:
                Intent intent = new Intent();
                intent.putExtra("msg","这是一条普通广播");
                intent.setAction("BC_One");
                sendBroadcast(intent);
                Toast.makeText(MainActivity.this,"这是一条普通广播",Toast.LENGTH_SHORT).show();
                break;
            //有序广播
            case R.id.send2://发送一条普通广播
                Intent intent2 = new Intent();
                intent2.putExtra("msg","这是一条有序广播");
                intent2.setAction("BC_One");
                sendOrderedBroadcast(intent2,null);
                Toast.makeText(MainActivity.this,"这是一条有序广播",Toast.LENGTH_SHORT).show();
                break;
            //异步操作
            case R.id.send3://发送一条普通广播
                Intent intent3 = new Intent();
                intent3.putExtra("msg","这是一条异步操作广播");
                intent3.setAction("BC_Three");
                sendStickyBroadcast(intent3);

                IntentFilter intentFilter = new IntentFilter("BC_Three");
                BC3 bc3 = new BC3();
                registerReceiver(bc3,intentFilter);

                Toast.makeText(MainActivity.this,"这是一条异步操作广播",Toast.LENGTH_SHORT).show();
                break;

            default:
                break;

        }
    }
}
