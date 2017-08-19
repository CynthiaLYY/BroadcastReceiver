package com.example.liuyueyue.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by liuyueyue on 2017/8/19.
 */

public class BC3 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println("收到了异步广播");
    }
}
