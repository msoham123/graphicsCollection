package BallStuff;

import processing.core.PApplet;

import java.util.ArrayList;

public class ballwithObject extends PApplet {

    int pink = color(255,87,207);
    int green = color(0,255,0);
    int red = color(255,0,0);
    int blue = color(0,0,255);
    double framerate = 60;
    int counter = 0;
    ArrayList<Ball> ballList;


public void settings(){
    size(600,600);


}

public void setup(){
    ballList = new ArrayList<>();
//    for (int i = 0; i<100; i++){
//        float x = (float)Math.random()*600;
//        float y = (float)Math.random()*50;
//        BallStuff.Ball p = new BallStuff.Ball(x,y,0,0);
//        fill(0);
//        ellipse(p.x,p.y,30,30);
//        ballList.add(p);
//    }


}

public void draw() {
    background(255, 255, 255);
    textSize(15);
    text("Number of Objects :" + ballList.size(), 10,30);


    if (mousePressed) {
        float x = mouseX;
        float y = mouseY;
        int r = (int)(Math.random()*255);
        int g = (int)(Math.random()*255);
        int b = (int)(Math.random()*255);
        int ballColor = color(r,g,b);
        System.out.println(ballColor);
        Ball p = new Ball(x,y,0,0,ballColor);
        ballList.add(p);
    }



    for (int loc=0; loc<ballList.size();loc++){
        Ball b = ballList.get(loc);
        fill(b.color);
        ellipse(b.x,b.y,10,10);
        b.applyGravity();
        b.move();
        b.directionDetection();
    }



    if (keyPressed){
        if (key == 'c'){
            ballList.clear();
            background(255,255,255);
        }
    }




}


public static void main(String[] args) {
    PApplet.main("BallStuff.ballwithObject");
}

}

