package lk.ucsc.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Addition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);

        //Get the value from the main page and declare as a string variable
        String val1 = getIntent().getStringExtra("val1");
        String val2 = getIntent().getStringExtra("val2");

        //Take inputs as integers,do operation and display output
        int in1 = Integer.parseInt(String.valueOf(val1));
        int in2 = Integer.parseInt(String.valueOf(val2));
        int addOutputInt = in1 + in2 ;
        String dataString = String.valueOf(addOutputInt);

        TextView val_1 = findViewById(R.id.val1);
        TextView val_2 = findViewById(R.id.val2);
        TextView output_1 = findViewById(R.id.addOutput);
        output_1.setText(dataString);
        val_1.setText(val1);
        val_2.setText(val2);

        //Close the activity when back button clicked
        Button backButton1 = findViewById(R.id.backBtn1);

        backButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}