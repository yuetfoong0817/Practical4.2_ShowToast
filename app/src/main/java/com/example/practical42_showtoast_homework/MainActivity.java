package com.example.practical42_showtoast_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox chocolate_syrup,orio_cookie_crumbles,crushed_nuts,sprinkles,cherries;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chocolate_syrup = findViewById(R.id.ChocolateSyrup_checkbox);
        sprinkles = findViewById(R.id.Sprinkles_checkbox);
        crushed_nuts = findViewById(R.id.CrushedNuts_checkbox);
        cherries = findViewById(R.id.Cherries_checkbox);
        orio_cookie_crumbles = findViewById(R.id.OrioCookieCrumbles_checkbox);
        Button show_toast = findViewById(R.id.button);
        show_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = "Topping:";
                if(chocolate_syrup.isChecked()){
                    result += "\nChocolate Syrup";
                }
                if(sprinkles.isChecked()){
                    result += "\nSprinkle";
                }
                if(crushed_nuts.isChecked()){
                    result += "\nCrushed Nuts";
                }
                if(cherries.isChecked()){
                    result += "\nCherries";
                }
                if(orio_cookie_crumbles.isChecked()){
                    result += "\nOrio cookie crumbles";
                }
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
            }
            });

    }
    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String str="";
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.ChocolateSyrup_checkbox:
                str = checked?"ChocolateSyrup Selected":"ChocolateSyrup Deselected";
                break;
            case R.id.Sprinkles_checkbox:
                str = checked?"Sprinkles Selected":"Sprinkles Deselected";
                break;
            case R.id.CrushedNuts_checkbox:
                str = checked?"CrushedNuts":"CrushedNuts Deselected";
                break;
            case R.id.Cherries_checkbox:
                str = checked?"Cherries Selected":"Cherries Deselected";
                break;
            case R.id.OrioCookieCrumbles_checkbox:
                str = checked?"Orio CookieCrumbles Selected":"Orio CookieCrumbles Deselected";
                break;
        }
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();

    }
}
