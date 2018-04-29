package camerasample.yamschikovdima.dima.ua.camerasample;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import camerasample.yamschikovdima.dima.ua.camerasample.fragments.FirstFragment;
import camerasample.yamschikovdima.dima.ua.camerasample.fragments.SecondFragment;

public class StepsHostActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnNext;

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steps_host);

        btnNext = (Button) findViewById(R.id.btnNext);

        Intent intent = getIntent();

        int frag = intent.getIntExtra("frag", 0);
        Log.e("FRAG", frag + "");

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        Fragment firstFragment = new FirstFragment();
        fragmentTransaction.add(R.id.frameHost, firstFragment);
        fragmentTransaction.commit();

        btnNext.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        Log.e("SEC",  "CLICK");

        Fragment secondFragment = new SecondFragment();
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameHost, secondFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
