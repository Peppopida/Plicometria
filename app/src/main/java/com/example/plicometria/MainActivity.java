package com.example.plicometria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  Button btnMale,btnFemale, btnConfirm;
  EditText etAge, etTricipite, etAddome, etSoprailiaca, etSottoscapolare, etAscellare, etPettorale, etCoscia;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    initUI();
    buttonsListener();
    disabledAllField();
  }

  private void initUI() {
    btnMale = findViewById(R.id.btn_male);
    btnFemale = findViewById(R.id.btn_female);
    etAge = findViewById(R.id.et_age);
    etTricipite = findViewById(R.id.et_tricipite);
    etAddome = findViewById(R.id.et_addome);
    etSoprailiaca = findViewById(R.id.et_soprailiaca);
    etSottoscapolare = findViewById(R.id.et_sottoscapolare);
    etAscellare = findViewById(R.id.et_ascellare);
    etPettorale = findViewById(R.id.et_pettorale);
    etCoscia = findViewById(R.id.et_coscia);
    btnConfirm = findViewById(R.id.btn_confirm);
  }

  private void disabledAllField() {
    etAge.setEnabled(false);
  }

  private void buttonsListener() {
    btnMale.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        btnFemale.setEnabled(false);
        etAge.setEnabled(true);
      }
    });

    btnFemale.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        btnMale.setEnabled(false);
        etAge.setEnabled(true);
      }
    });

    btnConfirm.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

      }
    });
  }
}