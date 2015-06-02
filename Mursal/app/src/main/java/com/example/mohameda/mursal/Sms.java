package com.example.mohameda.mursal;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Sms extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sms, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void SendSms(View view) {

        Editable name = ((EditText) findViewById(R.id.editText)).getText();
        Editable from = ((EditText) findViewById(R.id.editText2)).getText();
        Editable to = ((EditText) findViewById(R.id.editText3)).getText();

        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage("0127272190", null,name+","+from+","+to , null, null);

        Toast.makeText(getApplicationContext(), "تم ارسال الرسالة الى" + "0127272190",
                Toast.LENGTH_LONG).show();
    }
}
