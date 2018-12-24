package com.example.rajat.labexam;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main6Activity extends AppCompatActivity {

    ListView list;
    ArrayList<String> arr= new ArrayList<String>();
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
     //   getSupportActionBar().setTitle("Most Popular Results");

        list= (ListView)findViewById(R.id.list);

        arr.add("1) HP Laptop - 25000rs/-");
        arr.add("2) 2 Tables - 900rs/-");
        arr.add("3) 4 Chairs - 1000rs/-");
        arr.add("4) Microprocessor Book - 200rs/-");
        arr.add("5) R programming Book - 200rs/-");
        arr.add("6) Table Chair set - 1000rs/-");
        arr.add("7) HardDisk 1TB - 1500rs/-");
        arr.add("8) 64GB Pendrive - 2500rs/-");
        arr.add("9) Dell Laptop - 26000rs/-");
        arr.add("10) Alienware - 56000rs/-");
        arr.add("11) HP Laptop - 25000rs/-");
        arr.add("12) 2 Tables - 900rs/-");
        arr.add("13) 4 Chairs - 1000rs/-");
        arr.add("14) Microprocessor Book - 200rs/-");
        arr.add("15) R programming Book - 200rs/-");
        arr.add("16) Table Chair set - 1000rs/-");
        arr.add("17) HardDisk 1TB - 1500rs/-");
        arr.add("18) 64GB Pendrive - 2500rs/-");
        arr.add("19) Dell Laptop - 26000rs/-");
        arr.add("20) Alienware - 56000rs/-");

        adapter=new ArrayAdapter<String>(Main6Activity.this,android.R.layout.simple_list_item_1 ,arr)
        {
            @Override
            public View getView(int position, View convertView, ViewGroup parent){
                /// Get the Item from ListView
                View view = super.getView(position, convertView, parent);

                TextView tv = (TextView) view.findViewById(android.R.id.text1);

                // Set the text size 25 dip for ListView each item
                tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP,17);
                tv.setTextColor(Color.WHITE);

                // Return the view
                return view;
            }
        };

        list.setAdapter(adapter);
        list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE_MODAL);
        list.setMultiChoiceModeListener(new AbsListView.MultiChoiceModeListener() {
            @Override
            public void onItemCheckedStateChanged(ActionMode actionMode, int i, long l, boolean b) {

            }

            @Override
            public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                getMenuInflater().inflate(R.menu.action_bar,menu);
                return true;
            }

            @Override
            public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }

            @Override
            public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                return false;
            }

            @Override
            public void onDestroyActionMode(ActionMode actionMode) {

            }
        });
    }
}
