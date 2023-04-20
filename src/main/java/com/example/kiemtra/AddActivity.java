package com.example.kiemtra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.kiemtra.database.SQLiteHelper;
import com.example.kiemtra.model.Item;

public class AddActivity extends AppCompatActivity implements View.OnClickListener {

    // Code các TextView, EditText, ...

    private Spinner spCategory;
    private Button btUpdate, btCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        initView();
//        btUpdate.setOnClickListener(this);
//        btCancel.setOnClickListener(this);
    }

    private void initView() {

        // Code ánh xạ

//        spCategory = findViewById(R.id.spCategory);
//        btUpdate = findViewById(R.id.btUpdate);
//        btCancel = findViewById(R.id.btCancel);
//        spCategory.setAdapter(new ArrayAdapter<String>(this, R.layout.item_spinner,
//                getResources().getStringArray(R.array.category)));
    }

    @Override
    public void onClick(View view) {
//        if(view == btUpdate){

        // Code String ten = tvTen.getText.toString();

//        Item i = new Item();
//        SQLiteHelper db = new SQLiteHelper(this);
//        db.addItem(i);
//        finish();
//        }
//        if(view == btCancel){
//
//        }
    }
}