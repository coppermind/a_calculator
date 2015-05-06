package io.coppermind.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	EditText operand1;
	EditText operand2;
	EditText resultText;
	
	Button btnAddition;
	Button btnSubtraction;
	Button btnDivision;
	Button btnMultiplication;
	Button btnClear;
	
	public String operand;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		operand1 = (EditText) findViewById(R.id.number1);
		operand2 = (EditText) findViewById(R.id.number2);
		operand = "";
		
		btnAddition       = (Button) findViewById(R.id.buttonPlus);
		btnSubtraction    = (Button) findViewById(R.id.buttonMinus);
		btnDivision       = (Button) findViewById(R.id.buttonDivide);
		btnMultiplication = (Button) findViewById(R.id.buttonMultiply);
		btnClear          = (Button) findViewById(R.id.buttonClear);
		
		resultText = (EditText) findViewById(R.id.numberResult);
		
		btnAddition.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String op1 = operand1.getText().toString();
				String op2 = operand2.getText().toString();
				if (!op1.equals("") && !op2.equals("")) {
					float res = Float.parseFloat(op1) + Float.parseFloat(op2);
					resultText.setText("" + res);
				}
			}
		});
		
		btnSubtraction.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String op1 = operand1.getText().toString();
				String op2 = operand2.getText().toString();
				if (!op1.equals("") && !op2.equals("")) {
					float res = Float.parseFloat(op1) - Float.parseFloat(op2);
					resultText.setText("" + res);
				}
			}
		});
		
		btnDivision.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String op1 = operand1.getText().toString();
				String op2 = operand2.getText().toString();
				if (!op1.equals("") && !op2.equals("")) {
					float res = Float.parseFloat(op1) / Float.parseFloat(op2);
					resultText.setText("" + res);
				}
			}
		});
		
		btnMultiplication.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String op1 = operand1.getText().toString();
				String op2 = operand2.getText().toString();
				if (!op1.equals("") && !op2.equals("")) {
					float res = Float.parseFloat(op1) * Float.parseFloat(op2);
					resultText.setText("" + res);
				}
			}
		});
		
		btnClear.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				operand1.setText("");
				operand2.setText("");
				resultText.setText("0.00");
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
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
