package BallStuff;

import processing.core.PApplet;

import java.util.ArrayList;

public class ballFountain extends PApplet {

    int pink = color(255,87,207);
    int green = color(0,255,0);
    int red = color(255,0,0);
    int blue = color(0,0,255);
    double framerate = 60;
    int counter = 0;
    ArrayList<Ball> ballList;
    float timer,it;
    double scaler;


public void settings(){
    size(600,600);


}

public void setup(){
    ballList = new ArrayList<>();
    timer = 0;
    it=0;
    scaler = 2;



}

public void draw() {
    fill(0);
    background(255, 255, 255);
    textSize(15);
    text("Number of Objects :" + ballList.size(), 10,30);
    text("Time : " + (int)timer, 490,30);

    it = (float)(it+(1.0/30));
    timer = (float)(timer+(1.0/60));

//    if (mousePressed) {
//        float x = mouseX;
//        float y = mouseY;
//        int r = (int)(Math.random()*255);
//        int g = (int)(Math.random()*255);
//        int b = (int)(Math.random()*255);
//        int ballColor = color(r,g,b);
//        System.out.println(ballColor);
//    }

    if (it>scaler){
        float xSpeed= (float)((Math.random()*10)-5);
//        float y = (float)((Math.random()*400)+60);
        float y = -22;
        int r = (int)(Math.random()*255);
        int g = (int)(Math.random()*255);
        int b = (int)(Math.random()*255);
        int ballColor = color(r,g,b);
        Ball p = new Ball(300,600,xSpeed,-22,ballColor);
        ballList.add(p);
        it=0;
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



    scaler-=0.002;
}


public static void main(String[] args) {
    PApplet.main("BallStuff.ballFountain");
}

}

