package com.example.helloworld;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.layout);
        ImageView image = findViewById(R.id.firstImage);
        image.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.spearow));
        TextView myText = findViewById(R.id.textView2);
        myText.setText("Updating text in java");
        Button button = findViewById(R.id.button);
        EditText editText = findViewById(R.id.editText);

        button.setOnClickListener(v -> sayHi(myText));
   //     button.setOnClickListener(new View.OnClickListener() {
   //         public void onClick(View v) {
   //             myText.setText("Hi " + editText.getText());
   //             System.out.println("Clicked!");
   //         } });
    }

    public void sayHi(TextView txt){
        EditText editText = findViewById(R.id.editText);
        int num = Integer.parseInt(editText.getText().toString());
        txt.setText("Hi " + editText.getText());
    }


}