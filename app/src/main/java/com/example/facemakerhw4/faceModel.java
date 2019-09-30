//@author: Gianni Magliana

package com.example.facemakerhw4;

import android.graphics.Color;
import java.util.Random;

public class faceModel {
    //instance variables
    private int skinColor;
    private int eyeColor;
    private int hairColor;
    private int hairStyle;
    //random number generator for randomizing
    public Random numGen = new Random();
    /**
     External Citation
     Date: 9/30/19
     Problem:Could not remember how to turn values of a Color into an int
     Resource:https://developer.android.com/reference/android/graphics/Color
     Solution:found the .argb() method
     */


    //rgb values for slider manipulation
    private int redVal;
    private int greenVal;
    private int blueVal;

    //constructor for faceModel
    public faceModel() {
        this.randomize();
    }

    //many getters and setters for faceModel's values
    public int getHairStyle() {
        return hairStyle;
    }


    public int getGreenVal() {
        return greenVal;
    }

    public void setGreenVal(int green) {
        greenVal = green;
    }

    //red color value getter/setter
    public int getRedVal() {
        return redVal;
    }

    public void setRedVal(int red) {
        redVal = red;
    }

    //blue color value setter/getter
    public int getBlueVal() {
        return blueVal;
    }

    public void setBlueVal(int blue) {
        blueVal = blue;
    }

    //HairStyle setter
    public void setHairStyle(int style) {
        this.hairStyle = style;
    }

    //getter and setter for SkinColor
    public int getSkinColor(){
        return this.skinColor;
    }
    public void setSkinColor(int skinCol){
        this.skinColor=skinCol;
    }

    //getter and setter for eyeColor
    public int getEyeColor(){
        return this.eyeColor;
    }
    public void setEyeColor(int eyeCol){
        this.eyeColor=eyeCol;
    }

    //getter and setter for hair color
    public int getHairColor(){
        return this.hairColor;
    }
    public void setHairColor(int hairCol){
        this.hairColor=hairCol;
    }

    //randomize method
    public void randomize(){
        this.skinColor=randomRGB();
        this.eyeColor=randomRGB();
        this.hairColor=randomRGB();
        this.hairStyle=randomHairStyle();
    }
    //create a random color to be used for each paint when randomizing
    public int randomRGB() {
        int randomR = numGen.nextInt(256);
        int randomG = numGen.nextInt(256);
        int randomB = numGen.nextInt(256);
        int ranCol = Color.argb(255, randomR, randomG, randomB);
        return ranCol;
    }

    public int randomHairStyle() {
        int styleNum = numGen.nextInt(3);
        return styleNum;
    }

}
