package info.androidhive.canuas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class wisata extends AppCompatActivity implements View.OnClickListener{
    private Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);

        btnBack = findViewById(R.id.btn_back);
        btnBack.setOnClickListener(this);

    }
    @Override
    public void onClick (View v) {
        Intent i = new Intent(wisata.this, MainActivity.class);
        startActivity(i);


    }
}
