package IntroGraphics;

import processing.core.PApplet;

public class graphics2 extends PApplet {

    int pink = color(255,87,207);
    int green = color(0,255,0);
    int red = color(255,0,0);
    int blue = color(0,0,255);
    double framerate = 60;
    int counter = 0;

public void settings(){
    size(600,600);


}

public void setup(){
    frameRate((float)(framerate));

}

public void draw() {

    background(255, 255, 255);
    framerate = (int)((Math.random() * 7) + 55);
    fill(0, 0, 0);
    textSize(64);
    text("Score : " + counter, 150, 300);
    textSize(12);
    text("FPS : " + (framerate), 0, 20);


}
public void mousePressed(){
    background(red);
    counter = counter + 1;
}

public static void main(String[] args) {
    PApplet.main("IntroGraphics.graphics2");
}

}

