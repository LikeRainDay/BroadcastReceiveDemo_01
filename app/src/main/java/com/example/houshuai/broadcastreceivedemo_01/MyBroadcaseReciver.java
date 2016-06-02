package com.example.houshuai.broadcastreceivedemo_01;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by HouShuai on 2016/6/2.
 */

public class MyBroadcaseReciver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        /*获得用户播出的号码
        * get the user's call  number
        * */
        String teleNumber = getResultData();
        if (teleNumber.startsWith("0")) {
            teleNumber = "521520" + teleNumber;
        } else {
            //do nothing
        }
        /*c传递修改后的结果
        *
        * post the result of  phone number  is's changed
        * */
        setResultData(teleNumber);
    }
}
