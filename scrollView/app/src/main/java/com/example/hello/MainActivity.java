package com.example.hello;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ScrollView scrollView,scrollView2;
    ImageView imageView,imageView2;
    BitmapDrawable bitmap;
    int count=0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //화면에 무엇을 보여줄지 결정하는 함수 setContentView
        //화면에 보여줄 대상이 되는 XML의 위치 지정 R.layout.activity_main
        scrollView = findViewById(R.id.scrollView);
        scrollView.setHorizontalScrollBarEnabled(true);

        scrollView2 = findViewById(R.id.scrollView2);
        scrollView2.setHorizontalScrollBarEnabled(true);

        imageView=findViewById(R.id.imageView);
        imageView2=findViewById(R.id.imageView2);

        Resources res=getResources();
        bitmap=(BitmapDrawable)res.getDrawable(R.drawable.image);

        int bitmapwidth=bitmap.getIntrinsicWidth();
        int bitmapheight=bitmap.getIntrinsicHeight();

        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width=bitmapwidth;
        imageView.getLayoutParams().height=bitmapheight;

        imageView2.setImageDrawable(bitmap);
        imageView2.getLayoutParams().width=bitmapwidth;
        imageView2.getLayoutParams().height=bitmapheight;

        imageView2.setVisibility(View.INVISIBLE); //처음에는 밑에 안보이게
    }
    public void onClickup(View v){
        changeImageUp();
    }
    public void onClickdown(View v){
        changeImageDown();
    }
    public void changeImageUp(){
        imageView2.setVisibility(View.INVISIBLE);
        imageView.setVisibility(View.VISIBLE);
    }
    public void changeImageDown(){
        imageView2.setVisibility(View.VISIBLE);
        imageView.setVisibility(View.INVISIBLE);
    }

}