package vn.hieuruoi.test;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        CaculatorFragment caculatorFragment = new CaculatorFragment();
        fragmentTransaction.add(R.id.am_main, caculatorFragment);
        fragmentTransaction.commit();

    }
}


