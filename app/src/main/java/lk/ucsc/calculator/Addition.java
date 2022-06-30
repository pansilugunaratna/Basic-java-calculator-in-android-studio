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

        String dataString = getIntent().getStringExtra("outputVal1");

        TextView output = findViewById(R.id.addOutput);
        output.setText(dataString);

        Button backButton1 = findViewById(R.id.backBtn1);

        backButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
            }
        });
    }

    public void goBack() {
        finish();
    }
}