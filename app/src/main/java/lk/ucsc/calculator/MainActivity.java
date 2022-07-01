package lk.ucsc.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Call the add function when add button clicked
        Button addButton = findViewById(R.id.addBtn);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoAdd();
            }
        });

        //Call the subtract function when subtract button clicked
        Button subBtn = findViewById(R.id.subBtn);

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoSub();
            }
        });
    }

    //Read inputs, add them and direct the output value to addition page
    public void gotoAdd() {
        EditText input_1 = findViewById(R.id.input_1);
        EditText input_2 = findViewById(R.id.input_2);

        Intent intent = new Intent(this, Addition.class);
        //Send output value as argument of string type
        intent.putExtra("val1", input_1.getText().toString());
        intent.putExtra("val2", input_2.getText().toString());
        startActivity(intent);
    }

    //Read inputs, subtract them and direct the output value to subtraction page
    public void gotoSub() {
        EditText input_1 = findViewById(R.id.input_1);
        EditText input_2 = findViewById(R.id.input_2);

        Intent intent = new Intent(this, Subtraction.class);
        //Send output value as argument of string type
        intent.putExtra("val1", input_1.getText().toString());
        intent.putExtra("val2", input_2.getText().toString());
        startActivity(intent);
    }

}