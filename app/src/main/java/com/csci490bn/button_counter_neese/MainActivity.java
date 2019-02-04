package com.csci490bn.button_counter_neese;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    private TextView countView;
    private Button resetter;
    private Button incrementer;
    private Button decrementer;
    private int count =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countView = (TextView) this.findViewById(R.id.count);
        resetter = (Button) this.findViewById(R.id.resetter);
        incrementer = (Button) this.findViewById(R.id.incrementer);
        decrementer = (Button) this.findViewById(R.id.decrementer);
        countView.setText(String.valueOf(count));

    }

    public void Increment(View v)
    {
        count = count +1;
        countView.setText(String.valueOf(count));
    }

    public void Decrement(View v)
    {
        count = count -1;
        countView.setText(String.valueOf(count));
    }

    public void Reset(View v)
    {
        count = 0;
        countView.setText(String.valueOf(count));
    }

}
