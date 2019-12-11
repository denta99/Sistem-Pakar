package com.example.sistempakar;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    CheckBox ChckDeman,
    ChckTenggorokanTampakMerah,
    ChckNyeriTenggorokan,
    ChckKelenjarGetahBening,
    ChckSakitKepala,
    ChckHidungMeler,
    ChckBatuk,
    ChckNyeriOtot,
    ChckNyeriSendi,
    ChckKemerahanKulit,
    ChckMunculBintikMerah,
    ChckTubuhMenggigil;

    Button btnProsesDeteksi;
    TextView tvOutputNamaPenyakit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ChckDeman = (CheckBox) findViewById(R.id.checkBox1);
        ChckTenggorokanTampakMerah = (CheckBox) findViewById(R.id.checkBox2);
        ChckNyeriTenggorokan = (CheckBox) findViewById(R.id.checkBox3);
        ChckKelenjarGetahBening = (CheckBox) findViewById(R.id.checkBox4);
        ChckSakitKepala = (CheckBox) findViewById(R.id.checkBox5);
        ChckHidungMeler = (CheckBox) findViewById(R.id.checkBox6);
        ChckBatuk = (CheckBox) findViewById(R.id.checkBox7);
        ChckNyeriOtot = (CheckBox) findViewById(R.id.checkBox8);
        ChckNyeriSendi = (CheckBox) findViewById(R.id.checkBox9);
        ChckKemerahanKulit = (CheckBox) findViewById(R.id.checkBox10);
        ChckMunculBintikMerah = (CheckBox) findViewById(R.id.checkBox11);
        ChckTubuhMenggigil = (CheckBox) findViewById(R.id.checkBox12);

        btnProsesDeteksi = (Button) findViewById(R.id.button);
        tvOutputNamaPenyakit = (TextView) findViewById(R.id.textView);

        tvOutputNamaPenyakit.setText("");

        btnProsesDeteksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String NamaPenyakit = "Anda Menderita Penyakit : ";

                if (ChckDeman.isChecked() && ChckNyeriTenggorokan.isChecked() && ChckHidungMeler.isChecked() &&
                        ChckBatuk.isChecked() && ChckNyeriOtot.isChecked()) {
                    NamaPenyakit += "\n CAMPAK";
                }
                if (ChckDeman.isChecked() && ChckTenggorokanTampakMerah.isChecked() && ChckKelenjarGetahBening.isChecked() &&
                        ChckNyeriSendi.isChecked() && ChckMunculBintikMerah.isChecked()) {
                    NamaPenyakit += "\n CAMPAK JERMAN";
                }
                if (ChckDeman.isChecked() && ChckSakitKepala.isChecked() && ChckMunculBintikMerah.isChecked() &&
                        ChckTubuhMenggigil.isChecked()) {
                    NamaPenyakit += "\n CACAR AIR";
                }

                tvOutputNamaPenyakit.setText("" + NamaPenyakit);
            }
        });

    }


    public  void onCheckboxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();
        String str="";

        switch (view.getId()){
            case R.id.checkBox1:
                str = checked?"Gejala deman diseleksi":"Gejala demam tidak diseleksi";
                break;

            case R.id.checkBox2:
                str = checked?"Gejala nyeri Tenggorokan diseleksi":"Gejala nyeri tenggorokan tidak diseleksi";
                break;
            case R.id.checkBox3:
                str = checked?"Gejala Tenggorokan tampak merah diseleksi":"Gejala Tenggorokan tampak merah tidak diseleksi";
                break;
            case R.id.checkBox4:
                str = checked?"Gejala Tenggorokan tampak merah diseleksi":"Gejala Tenggorokan tampak merah tidak diseleksi";
                break;
            case R.id.checkBox5:
                str = checked?"Gejala Tenggorokan tampak merah diseleksi":"Gejala Tenggorokan tampak merah tidak diseleksi";
                break;
            case R.id.checkBox6:
                str = checked?"Gejala Tenggorokan tampak merah diseleksi":"Gejala Tenggorokan tampak merah tidak diseleksi";
                break;
            case R.id.checkBox7:
                str = checked?"Gejala Tenggorokan tampak merah diseleksi":"Gejala Tenggorokan tampak merah tidak diseleksi";
                break;
            case R.id.checkBox8:
                str = checked?"Gejala Tenggorokan tampak merah diseleksi":"Gejala Tenggorokan tampak merah tidak diseleksi";
                break;
            case R.id.checkBox9:
                str = checked?"Gejala Tenggorokan tampak merah diseleksi":"Gejala Tenggorokan tampak merah tidak diseleksi";
                break;
            case R.id.checkBox10:
                str = checked?"Gejala Tenggorokan tampak merah diseleksi":"Gejala Tenggorokan tampak merah tidak diseleksi";
                break;
            case R.id.checkBox11:
                str = checked?"Gejala Tenggorokan tampak merah diseleksi":"Gejala Tenggorokan tampak merah tidak diseleksi";
                break;
            case R.id.checkBox12:
                str = checked?"Gejala Tenggorokan tampak merah diseleksi":"Gejala Tenggorokan tampak merah tidak diseleksi";
                break;


        }
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }



}
