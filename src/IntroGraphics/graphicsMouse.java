package IntroGraphics;

import processing.core.PApplet;

import java.sql.SQLOutput;

public class graphicsMouse extends PApplet {

    int x, y;
    int c = color(125, 125, 125);
    public void settings(){
        size(600,600);

    }

    public void setup(){
        x=300;
        y=300;
    }



    public void draw(){
        x= mouseX;
        y= mouseY;

        fill(c);
        ellipse(x,y,60,60);

        if (mousePressed== true){
            int r =(int)( Math.random()*256);
            int g =(int)( Math.random()*256);
            int b =(int)( Math.random()*256);
            c = color(r,g,b);

        }
        if (keyPressed==true){
            if (key == 'c'){
                background(255,255,255);
            }
            if (key == 'r'){
                ellipse((int)(Math.random()*601),(int)(Math.random()*601), 60, 60);
            }

        }
       ;
    }

    public static void main(String[] args) {
        PApplet.main("IntroGraphics.graphicsMouse");
    }



}
