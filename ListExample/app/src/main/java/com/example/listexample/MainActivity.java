package com.example.listexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list=(ListView)findViewById(R.id.list);

        List<String> data=new ArrayList<String>(); // 데이터 저장을 위함
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,data); // 연결위한 adapter
        // android.R.layout.simple_expandable_list_item_1 안드로이드에서 제공하는 기본 리스트 폼
        list.setAdapter(adapter);

        data.add("박주원");
        data.add("JAVA");
        data.add("ANDROID");
        data.add("PYTHON");
        data.add("C++");
        data.add("HTML");
        data.add("CSS");
        data.add("Kotlin");
        data.add("C#");

        adapter.notifyDataSetChanged(); // 이걸 입력해야 리스트가 현재까지 저장이된다.
    }
}