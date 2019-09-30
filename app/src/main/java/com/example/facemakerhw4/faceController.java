//@author: Gianni Magliana

package com.example.facemakerhw4;


import android.view.View;
import android.widget.SeekBar;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Spinner;


public class faceController implements SeekBar.OnSeekBarChangeListener, RadioGroup.OnCheckedChangeListener, View.OnClickListener {

    private faceView mySV;
    private faceModel myFM;

    //constructor for the Controller class which keeps track of events
    public faceController(faceView faceSV) {
        mySV = faceSV;
        myFM = mySV.getFaceData();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {


    }

    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    public void SeekBarListener(faceView theSV) {
        mySV = theSV;

    }

    public void onStopTrackingTouch(SeekBar seekbar) {

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedID) {

    }

    @Override
    public void onClick(View mySV) {

    }
}



