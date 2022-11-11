package br.com.gomobi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DashView : AppCompatActivity() {

    ArrayList barArrayList;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_view)

        BarChart barChart = findViewById(R.id.barchart);
        BarDataSet barDataSet = new BarDataSet(barArrayList; "Valores")
        BarData barData = new BarData(barDataSet);
        barChart.setData(barData);


    }


}