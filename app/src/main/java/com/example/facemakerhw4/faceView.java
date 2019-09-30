//@author: Gianni Magliana

package com.example.facemakerhw4;

//imports

import android.view.SurfaceView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Color;
import android.graphics.Canvas;
import android.graphics.Paint;


public class faceView extends SurfaceView {

    //instance of model class
    private faceModel faceData;

    //paints for face
    Paint skinPaint = new Paint();
    Paint eyePaint = new Paint();
    Paint hairPaint = new Paint();
    Paint eyeWhites = new Paint(Color.WHITE);



    //face location values
    public static final float faceCenterX = 250.0f;
    public static final float faceCenterY = 250.0f;
    public static final float faceCircleRadius = 150.0f;

    //constructor for faceView
    public faceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.faceData = new faceModel();
        setWillNotDraw(false);

        //setup random paint colors
        skinPaint.setColor(faceData.getSkinColor());
        eyePaint.setColor(faceData.getEyeColor());
        hairPaint.setColor(faceData.getHairColor());

        //set background color
        setBackgroundColor(Color.WHITE);
    }


    //calls all the draw methods to build face
    public void onDraw(Canvas canvas) {
        drawHair(canvas);
        drawHead(canvas);
        drawEyes(canvas);
    }

    //method to draw hair
    public void drawHair(Canvas canvas) {

        //switch for cases 0,1,2 hairStyles
        switch (faceData.getHairStyle()) {
            //bald
            case 0:
                break;
            //box hair
            case 1:
                canvas.drawRect(faceCenterX - 100, faceCenterY - 200, faceCenterX + 100, faceCenterY, hairPaint);
                //round hair
            case 2:
                canvas.drawCircle(faceCenterX, faceCenterY - 75, faceCircleRadius, hairPaint);
        }
    }

    //method to draw head
    public void drawHead(Canvas canvas) {
        canvas.drawCircle(faceCenterX, faceCenterY, faceCircleRadius, skinPaint);
    }

    //method to draw eyes
    public void drawEyes(Canvas canvas) {
        //draw whites
        canvas.drawCircle(faceCenterX - 85, faceCenterY - 100, faceCircleRadius / 4, eyeWhites);
        canvas.drawCircle(faceCenterX + 85, faceCenterY - 100, faceCircleRadius / 4, eyeWhites);
        //draw Irises
        canvas.drawCircle(faceCenterX - 85, faceCenterY - 100, faceCircleRadius / 6, eyePaint);
        canvas.drawCircle(faceCenterX + 85, faceCenterY - 100, faceCircleRadius / 6, eyePaint);

    }

    //get information about the faceModel object
    public faceModel getFaceData() {
        return faceData;
    }



}
