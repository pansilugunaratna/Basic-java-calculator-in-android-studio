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

        Button addButton = findViewById(R.id.addBtn);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoAdd();
//                generateText();
            }
        });

//        Button subBtn = findViewById(R.id.subBtn);

//        subBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                gotoSub();
//            }
//        });
    }


    //Read inputs, add them and direct the output value to addition page
    public void gotoAdd() {
        EditText input_1 = findViewById(R.id.input_1);
        EditText input_2 = findViewById(R.id.input_2);
        int in1 = Integer.parseInt(String.valueOf(input_1.getText()));
        int in2 = Integer.parseInt(String.valueOf(input_2.getText()));
        int toParse = in1 + in2;
        Intent intent = new Intent(this, Addition.class);
        intent.putExtra("outputVal1", String.valueOf(toParse));
        startActivity(intent);
    }


//    public void generateText() {
//        EditText input_1 = findViewById(R.id.input_1);
//        EditText input_2 = findViewById(R.id.input_2);
//        int in1 = Integer.parseInt(String.valueOf(input_1.getText()));
//        int in2 = Integer.parseInt(String.valueOf(input_2.getText()));
//        int toParse = in1 + in2;
//        TextView output = findViewById(R.id.textOutput);
//        output.setText(String.valueOf(toParse));
//    }

    //Direct the output value to subtraction page
//    public void gotoSub() {
//        EditText input = findViewById(R.id.textInput);
//        String toParse = input.getText().toString();
//        Intent intent = new Intent(this, Addition.class);
//        intent.putExtra("fieldValue",toParse);
//        startActivity(intent);
//    }
}