package com.example.adslo.testbrodcastreceiver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showCustom();

    }

    private void showCustom() {
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService("layout_inflater");
        View layout = layoutInflater.inflate(R.layout.custom_layout, null);

        // findViewByid()는 layout 개체에서 호출하여 사용한다.
        // 즉, 해당 View에 포함된 위젯을 사용할 때는 View내의 findVIewById()를 사용한다.
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.FILL_HORIZONTAL | Gravity.TOP, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }

}
