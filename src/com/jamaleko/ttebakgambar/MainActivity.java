package com.jamaleko.ttebakgambar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText jawabanTxt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//cari komponen edittext
				jawabanTxt = (EditText)findViewById(R.id.editText1);
				//set input huruf besar
				jawabanTxt.setFilters(new InputFilter[] {new InputFilter.AllCaps()});
	}
	public void cekjawaban(View v){
		String jawabanBenar = "PIRING TERBANG";
		String jawabanUser = jawabanTxt.getText().toString();
		if(jawabanUser.equals(jawabanBenar)){
			//pesan toast
			Toast.makeText(getApplicationContext(),
					"JAWABAN TEPAT!", Toast.LENGTH_LONG).show();
			Intent ia = new Intent(getApplicationContext(), Activity2.class);
			startActivity(ia);
		}
		else{
			//pesan toas
			Toast.makeText(getApplicationContext(),
					"JAWABAN MASIH SALAH!",Toast.LENGTH_LONG).show();
		}
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
