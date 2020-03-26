package IntroGraphics;

import processing.core.PApplet;

import java.util.ArrayList;

public class test extends PApplet {
    ArrayList<Float> xList = new ArrayList<Float>();
    ArrayList<Float> yList = new ArrayList<Float>();
    ArrayList<Float> ySpeedList = new ArrayList<Float>();


    float x,y, xSpeed,ySpeed;

    public void settings() {
        size(600, 600);
    }

    public void setup() {
      x = 300;
      y = 300;
      xSpeed = 0;
      ySpeed = 1;


    }

    public void draw() {
        background(255,255,255);
        

        if (mousePressed){
            xList.add((float)mouseX);
            yList.add((float)mouseY);
            ySpeedList.add(0f);

        }

        for (int loc=0;loc<xList.size();loc++){
            ellipse(xList.get(loc),yList.get(loc),30,30);

        }




    }
    public static void main(String[] args) {
        PApplet.main("IntroGraphics.test");
    }

}
