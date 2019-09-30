//@author: Gianni Magliana

package com.example.facemakerhw4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        faceView mainFace = findViewById(R.id.faceView);
        faceController faceControl = new faceController(mainFace);

        //make seekBar listeners
        SeekBar greenSeeker = findViewById(R.id.greenSeek);
        greenSeeker.setOnSeekBarChangeListener(faceControl);
        SeekBar blueSeeker = findViewById(R.id.blueSeek);
        blueSeeker.setOnSeekBarChangeListener(faceControl);
        SeekBar redSeeker = findViewById(R.id.redSeek);
        redSeeker.setOnSeekBarChangeListener(faceControl);

        //radio buttons
        /**
         External Citation
         Date: 9/30/19
         Problem: Not sure how to set up radioButtons
         Resource:https://www.mkyong.com/android/android-radio-buttons-example/
         Solution:walked through an online example of radioButtons and radioGroups
         */
        RadioGroup buttons = findViewById(R.id.radioGroup);
        buttons.setOnCheckedChangeListener(faceControl);

        //spinner
        /**
         External Citation
         Date: 9/30/19
         Problem:Not sure how to set up Spinner and connect an Adapter
         Resource:https://developer.android.com/reference/android/widget/AdapterView.OnItemSelectedListener.html
         Solution:Studied the documentation and looked at some examples
         */
        Spinner hairStyle = findViewById(R.id.hairStyleSelector);
        //make array for spinner options
        ArrayList<String> list = new ArrayList<>();
        list.add("Style 1");
        list.add("Style 2");
        list.add("Style 3");
        //make adapter for array
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, list);
        //connect spinner to adapter to get options
        hairStyle.setAdapter(adapter);



    }
}
