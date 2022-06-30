package lk.ucsc.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Subtraction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtraction);

        //Get the value from the main page and declare as a string variable
        String dataString = getIntent().getStringExtra("outputVal2");
        String val1 = getIntent().getStringExtra("val1");
        String val2 = getIntent().getStringExtra("val2");
        TextView val_1 = findViewById(R.id.val1);
        TextView val_2 = findViewById(R.id.val2);
        TextView output2 = findViewById(R.id.subOutput);
        output2.setText(dataString);
        val_1.setText(val1);
        val_2.setText(val2);

        //Close the activity when back button clicked
        Button backButton1 = findViewById(R.id.backBtn2);

        backButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}