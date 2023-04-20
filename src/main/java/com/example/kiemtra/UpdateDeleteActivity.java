package com.example.kiemtra;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.kiemtra.database.SQLiteHelper;
import com.example.kiemtra.model.Item;

public class UpdateDeleteActivity extends AppCompatActivity  implements View.OnClickListener {

    // Khai báo các TextView, EditText, ...

    private Spinner spCategory;

    private Button btUpdate, btDelete, btBack;

    private Item item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_delete);
        initView();
//        btUpdate.setOnClickListener(this);
//        btBack.setOnClickListener(this);
//        btDelete.setOnClickListener(this);
//        Intent intent = getIntent();
//        item = (Item) intent.getSerializableExtra("item");


        //Code tvTen.setText(item.getTen());


//        int p = 0;
//        for(int i = 0; i<spCategory.getCount(); i++){
//            if(spCategory.getItemAtPosition(i).toString().equalsIgnoreCase(item.get***())){
//                p = i;
//                break;
//            }
//        }
//        spCategory.setSelection(p);


    }

    private void initView() {

        // Code Ánh xạ

//        btUpdate = findViewById(R.id.btUpdate);
//        btDelete = findViewById(R.id.btDelete);
//        btBack = findViewById(R.id.btBack);
//        spCategory.setAdapter(new ArrayAdapter<String>(this, R.layout.item_spinner,
//                getResources().getStringArray(R.array.category)));
    }

    @Override
    public void onClick(View view) {
//        if(view == btUpdate){

        // Copy phần đầu Update bên AddActivity

//            int ma = item.getMa();
//            Item i = new Item(ma, );
//            SQLiteHelper db = new SQLiteHelper(this);
//            db.update(i);
//            finish();
//        }

//        if(view == btDelete){
//            int id = item.getMa();
//            AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
//            builder.setTitle("Thông báo xóa");
//            builder.setMessage("Bạn chắc muốn xóa " + item.get***() + " không?");
//            builder.setIcon(R.drawable.remove);
//            builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialogInterface, int i) {
//                    SQLiteHelper bb = new SQLiteHelper(getApplicationContext());
//                    bb.delete(id);
//                    finish();
//                }
//            });
//
//            builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialogInterface, int i) {
//
//                }
//            });
//            AlertDialog dialog = builder.create();
//            dialog.show();
//        }


//        if(view == btBack){
//            finish();
//        }
    }
}