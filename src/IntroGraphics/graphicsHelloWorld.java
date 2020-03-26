package IntroGraphics;

import processing.core.PApplet;

public class graphicsHelloWorld extends PApplet {

    int pink = color(255,87,207);
    int green = color(0,255,0);
    int red = color(255,0,0);
    int blue = color(0,0,255);



public void settings(){
    size(600,600);


}

public void setup(){
}

public void draw(){
//    fill(green);
//    rect(0,0, 60, 60);
//    fill(pink);
//    rect(0,200, 60, 60);
//    fill(green);
//    rect(0,400, 60, 60);
//    fill(pink);
//    rect(200,0, 60, 60);
//    fill(green);
//    rect(400,0,60,60);

//    fill(green);
//    rect(250,250,100,100);
//    fill(pink);
//    ellipse(300,300,100,100);

//    fill(red);
//    ellipse(75,100,60,60);
//    fill(green);
//    ellipse(225, 300, 60, 60);
//    fill(blue);
//    ellipse(375,500,60,60);
//
//
//
//    line(150,0,150,600);
//    line(300,0,300,600);
//    line(450,0,450,600);


//    rect(250,250,100,200);
//    curve(250, 250, 100, 100, 300, 300, 150, 150);

    int n = (int)(Math.random()*256);

    int y = 0;
    int count = 0;
    for (int x = 0; x< 600; x = x){
        count = count + 1;

        if (count>=30) {
            fill(n, 0, 0);
            ellipse(x, y, 30, 30);
            y = y + 30;
            x = x + 30;
            count = 0;
        }
    }





}

public static void main(String[] args) {
    PApplet.main("IntroGraphics.graphicsHelloWorld");
}

}

