package com.wildman.capitano.lottery;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView lotteryRows;
    private Button lotteryButton;
    private Button lotteryMinusButton;
    private Button lotteryPlusButton;
    private int rowCount;
    private volatile int selection;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    lotteryRows.setText(R.string.lottery_lotto);
                    selection = 1;
                    return true;
                case R.id.navigation_dashboard:
                    lotteryRows.setText(R.string.lottery_eurojackpot);
                    selection = 2;
                    return true;
                case R.id.navigation_notifications:
                    lotteryRows.setText(R.string.lottery_viikinki);
                    selection = 3;
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rowCount = 1;
        selection = 1;

        lotteryRows = (TextView) findViewById(R.id.message);
        lotteryButton = (Button) findViewById(R.id.lottery_button);

        lotteryButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                lotteryRows.setText(LottoArvonta.generateRow(selection, rowCount));
            }
        });

        lotteryMinusButton = (Button) findViewById(R.id.button_minus_row);

        lotteryMinusButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(rowCount >= 2) {
                    rowCount--;
                    if(rowCount == 1){
                        lotteryButton.setText(Integer.toString(rowCount) + " RIVI");
                    } else {
                        lotteryButton.setText(Integer.toString(rowCount) + " RIVIÄ");
                    }

                }
            }
        });

        lotteryPlusButton = (Button) findViewById(R.id.button_plus_row);

        lotteryPlusButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(rowCount <= 9) {
                    rowCount++;
                    lotteryButton.setText(Integer.toString(rowCount) + " RIVIÄ");
                }
            }
        });

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
