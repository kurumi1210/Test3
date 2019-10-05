package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int amount = 1;
    int basePrice = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMinus = findViewById(R.id.btn_minus);
        Button btnPlus = findViewById(R.id.btn_plus);
        final TextView tvAmount = findViewById(R.id.tv_amount);
        final CheckBox cbCream = findViewById(R.id.cb_cream);
        final CheckBox cbC = findViewById(R.id.cb_cc);
        final CheckBox cbVanilla = findViewById(R.id.cb_vanilla);
        Button btnOrder = findViewById(R.id.btn_order);
        final TextView tvThankyou = findViewById(R.id.tv_ty);

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Do stuff
                if (amount >  1) {
                    amount--;
                    tvAmount.setText(Integer.toString(amount));
                }
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Do stuff
                amount++;
                tvAmount.setText(Integer.toString(amount));
            }
        });

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int finalPrice = basePrice;
                if(cbCream.isChecked()){
                    finalPrice += 1;
                }
                if(cbC.isChecked()){
                    finalPrice += 2;
                }
                if(cbVanilla.isChecked()){
                    finalPrice += 3;
                }

                finalPrice += amount;

                Log.d("Final Price", Integer.toString(finalPrice));

                tvThankyou.setText("Thank for your order. \n The total price is $" + Integer.toString(finalPrice));
            }
        });
    }
}
