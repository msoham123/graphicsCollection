package IntroGraphics;

import processing.core.PApplet;

public class graphics3 extends PApplet {

    int pink = color(255,87,207);
    int green = color(0,255,0);
    int red = color(255,0,0);
    int blue = color(0,0,255);
    double framerate = 60;
    int counter = 0;
    int x, y, XSpeed, YSpeed, color, x1, y1, XSpeed1, YSpeed1;


public void settings(){
    size(600,600);


}

public void setup(){
    frameRate((float)(framerate));
    x = 225;
    y = 175;
    x1 = 225;
    y1 = 300;
    XSpeed = 1;
    YSpeed = 1;
    XSpeed1 = -1;
    YSpeed1 = -1;
    color = color(0,0,0);

}

public void draw() {
    background(255, 255, 255);
    fill(200,200,200);
    rect(100,100,400,150);
    rect(100, 300, 400, 150);

    //FPS

    framerate = (int)((Math.random() * 7) + 55);
    fill(0, 0, 0);
    textSize(12);
    text("FPS : " + (framerate), 0, 20);

    //Shapes
    fill(color);
    ellipse(x,y,60,60);
    ellipse(x1,y1,60,60);

    x = x + XSpeed;
    y = y - YSpeed;

    if(x>500){
        XSpeed = -XSpeed;
        color = color((int)( Math.random()*256),(int)( Math.random()*256),(int)( Math.random()*256));

    }
    if (x<100) {
        XSpeed = -XSpeed;
        color = color((int)( Math.random()*256),(int)( Math.random()*256),(int)( Math.random()*256));

    }
    if (y>250){
        YSpeed = -YSpeed;
        color = color((int)( Math.random()*256),(int)( Math.random()*256),(int)( Math.random()*256));
    }
    if (y<100){
        YSpeed = -YSpeed;
        color = color((int)( Math.random()*256),(int)( Math.random()*256),(int)( Math.random()*256));

    }

    x1 = x1 + XSpeed1;
    y1 = y1 - YSpeed1;

    if(x1>500){
        XSpeed1 = -XSpeed1;
        color = color((int)( Math.random()*256),(int)( Math.random()*256),(int)( Math.random()*256));

    }
    if (x1<100) {
        XSpeed1 = -XSpeed1;
        color = color((int)( Math.random()*256),(int)( Math.random()*256),(int)( Math.random()*256));

    }
    if (y1>450){
        YSpeed1 = -YSpeed1;
        color = color((int)( Math.random()*256),(int)( Math.random()*256),(int)( Math.random()*256));
    }
    if (y1<300){
        YSpeed1 = -YSpeed1;
        color = color((int)( Math.random()*256),(int)( Math.random()*256),(int)( Math.random()*256));

    }







}
public void mousePressed(){

}

public static void main(String[] args) {
    PApplet.main("IntroGraphics.graphics3");
}

}

