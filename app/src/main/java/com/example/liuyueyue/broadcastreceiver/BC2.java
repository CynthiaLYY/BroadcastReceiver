package com.example.liuyueyue.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by liuyueyue on 2017/8/19.
 */

public class BC2 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String s = intent.getStringExtra("msg");
        System.out.println("Receiver2收到信息："+s);
        Bundle bundle = getResultExtras(true);
        String s2 = bundle.getString("test");
        System.out.println("得到的处理结果是："+s2);
    }
}
