package com.example.tipcalculatorapp;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

	private EditText enterAmount;
	private TextView tipAmount;
	private EditText userDesireTip;
	private String dollar = "$";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    	enterAmount = (EditText) findViewById(R.id.enterAmount);
        tipAmount = (TextView) findViewById(R.id.tipAmount);
        userDesireTip = (EditText) findViewById(R.id.userDesireTip);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
   public void firstTipOption(View v){
	  
	   float totalAmount = Float.valueOf(enterAmount.getText().toString());
	   float tip = totalAmount * 10/100;
	   tipAmount.setText (dollar + (Float.toString(tip)));
   }
   public void secondTipOption(View v){
		  
	   float totalAmount = Float.valueOf(enterAmount.getText().toString());
	   float tip = totalAmount * 15/100;
	   tipAmount.setText (dollar + (Float.toString(tip)));	  
   }
   
   public void thirdTipOption(View v){
		  
	   float totalAmount = Float.valueOf(enterAmount.getText().toString());
	   float tip = totalAmount * 20/100;
	   tipAmount.setText (dollar + (Float.toString(tip)));
   }
   
   public void calculateTip(View v){
	   float userTip = Float.valueOf(userDesireTip.getText().toString());
	   float totalAmount = Float.valueOf(enterAmount.getText().toString());
	   float tip = totalAmount * userTip/100;
	   tipAmount.setText (dollar + (Float.toString(tip)));
   }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
