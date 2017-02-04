package com.seoulhot.hotple;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        startActivity(new Intent(this, SplashActivity.class));
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        SlidingView sv = new SlidingView(this);
        View v1 = View.inflate(this, R.layout.sliding, null);
        View v2 = View.inflate(this, R.layout.activity_main, null);
        sv.addView(v1);
        sv.addView(v2);
        setContentView(sv);
    }

    @Override
    public void onClick(View v) {
        String title = v.getResources().getResourceName(v.getId());
        switch (v.getId()) {
            case R.id.hotple :
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://seoulhot-psypu.c9users.io/subway/1bz/"));
                startActivity(intent1);
                break;
            case R.id.coldple :
                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://seoulhot-psypu.c9users.io/subway/2em/"));
                startActivity(intent2);
                break;
            case R.id.chat :
                Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
                startActivity(intent3);
                break;
            case R.id.wherehotple :
                Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://seoulhot-psypu.c9users.io/subway/3my/"));
                startActivity(intent4);
                break;
            case R.id.compare :
                Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://seoulhot-psypu.c9users.io/subway/4vs"));
                startActivity(intent5);
                break;
            case R.id.work :
                Intent intent6 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://seoulhot-psypu.c9users.io/subway/5cm"));
                startActivity(intent6);
                break;
            case R.id.fire :
                Intent intent7 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://seoulhot-psypu.c9users.io/subway/6fd"));
                startActivity(intent7);
                break;
            case R.id.develop :
                Intent intent8 = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
                startActivity(intent8);
                break;
        }

    }

    @Override
    // 뒤로가기 버튼 눌렀을 때 종료할지 물어보기
    public void onBackPressed() {
       // super.onBackPressed();

        new AlertDialog.Builder(this)
                .setTitle("앱을 종료하시겠습니까?")
                .setNegativeButton("아니요", null)
                .setPositiveButton("예", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                }).show();
    }
}
