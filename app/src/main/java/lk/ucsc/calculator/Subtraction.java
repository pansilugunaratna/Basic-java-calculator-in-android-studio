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

        TextView output2 = findViewById(R.id.subOutput);
        output2.setText(dataString);

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