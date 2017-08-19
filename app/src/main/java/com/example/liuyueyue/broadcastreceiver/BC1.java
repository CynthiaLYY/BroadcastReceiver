package com.example.liuyueyue.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;


/**
 * Created by liuyueyue on 2017/8/19.
 */

public class BC1 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String s = intent.getStringExtra("msg");
        System.out.println("Receiver1收到信息："+s);
        //中断操作
        //abortBroadcast();
        Bundle bundle = new Bundle();
        bundle.putString("test","广播处理的数据");
        setResultExtras(bundle);

    }
}
