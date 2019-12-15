package info.androidhive.uascan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnprofil, btnwisata, btnkuliner,btnlistview,btnorder;
    private ImageView btntampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnprofil = findViewById(R.id.btn_profil);
        btnprofil.setOnClickListener(this);

        btnwisata = findViewById(R.id.btn_wisata);
        btnwisata.setOnClickListener(this);


        btnkuliner = findViewById(R.id.btn_kuliner);
        btnkuliner.setOnClickListener(this);

        btntampil = findViewById(R.id.btn_tampil);
        btntampil.setOnClickListener (this);

        btnlistview = findViewById(R.id.btnlistview);
        btnlistview.setOnClickListener(this);

        btnorder = findViewById(R.id.btnorder);
        btnorder.setOnClickListener(this);


    }
    @Override
    public void  onClick(View view){
        switch (view.getId()){
            case R.id.btn_profil:
                startActivity(new Intent(this, profil.class));
                break;
        }
        switch (view.getId()){
            case R.id.btn_wisata:
                startActivity(new Intent(this, wisata.class));
                break;
        }
        switch (view.getId()){
            case R.id.btn_kuliner:
                startActivity(new Intent(this, kuliner.class));
                break;
        }
        switch (view.getId()){
            case R.id.btn_tampil:
                startActivity(new Intent(this, tampil.class));
                break;
        }
        switch (view.getId()){
            case R.id.btnlistview:
                startActivity(new Intent(this, listview.class));
                break;
        }
        switch (view.getId()){
            case R.id.btnorder:
                startActivity(new Intent(this, order.class));
                break;
        }

    }
}

