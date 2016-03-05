package com.example.tranadele.todoapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {
EditText editToDoText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        editToDoText = (EditText) findViewById(R.id.editToDoText);
        editToDoText.setText(getIntent().getStringExtra("todoItems"));

        Button saveBtn = (Button) findViewById(R.id.btnSaveItem);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSubmit();
            }
        });
    }

//    public void onSaveItem(View view){
//        Intent i = new Intent();
//        i.putExtra ("updateitem", editToDoText.getText(), toString());
//    }

    public void onSubmit() {
        Intent returnIntent = new Intent();
        returnIntent.putExtra("taskText", editToDoText.getText().toString());
        setResult(Activity.RESULT_OK, returnIntent);
        this.finish();
    }

}



