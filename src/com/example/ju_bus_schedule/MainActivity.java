package com.example.ju_bus_schedule;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button morn = (Button) findViewById(R.id.morn);
		Button after = (Button) findViewById(R.id.after);
		Button even = (Button) findViewById(R.id.even);
		Button night = (Button) findViewById(R.id.night);
		Button teacher = (Button) findViewById(R.id.teacher);
		Button numbers = (Button) findViewById(R.id.numbers);

		Typeface bangla_fonts = Typeface.createFromAsset(getAssets(),
				"fonts/Siyamrupali.ttf");

		morn.setTypeface(bangla_fonts);
		after.setTypeface(bangla_fonts);
		even.setTypeface(bangla_fonts);
		night.setTypeface(bangla_fonts);
		teacher.setTypeface(bangla_fonts);
		numbers.setTypeface(bangla_fonts);
	}

}
