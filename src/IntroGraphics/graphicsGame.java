package IntroGraphics;

import processing.core.PApplet;
import processing.core.PImage;

public class graphicsGame extends PApplet {

    int pink = color(255, 87, 207);
    int green = color(0, 255, 0);
    int red = color(255, 0, 0);
    int blue = color(0, 0, 255);
    double framerate = 60;
    int counter = 0;
    float x, y, XSpeed, YSpeed, color, x1, y1, XSpeed1, YSpeed1, timeCounter, spawnCounter, Score, rPlayer, rSpawn;
    double distance, time;
    boolean nameCheck;
    String Name;
    int nameButtonColor1,nameButtonColor2,nameButtonColor3 ,playButtonColor;
    PImage shrekPhoto, lennyPhoto;


    public void settings() {
        size(600, 600);


    }

    public void setup() {
        shrekPhoto = loadImage("shrek.jpg");
        lennyPhoto = loadImage("lenny.png");
        rPlayer = 15;
        rSpawn = 5;
        time = 1;
        timeCounter = 300;
        spawnCounter = 0;
        frameRate(60);
        x = 300;
        y = 500;
//        x1 = (int) (Math.random() * 600);
//        y1 = (int) (Math.random() * 570) + 30;
        x1=300;
        y1=100;
        XSpeed = 1;
        YSpeed = -1;
        XSpeed1 = -1;
        YSpeed1 = -1;
        color = color(0, 0, 0);
        nameCheck = false;
        Name = "";
        nameButtonColor1 = color(0,256,0);
        nameButtonColor2 = color(0,256,0);
        nameButtonColor3 = color(0,256,0);
        playButtonColor = color(256,0,0);

    }

    public void draw() {

        background(255, 255, 255);

        if (nameCheck==true){
        //IntroGraphics.test (only used to IntroGraphics.test logic)
//        textSize(12);
//        text("Distance : " + (distance), 0, 550);
            fill(0,0,0);
            rect(30,30,540,540);
            rect(0,0,600,30);


        //Timer
        time = (time + (1.0 / 60));
        fill(0, 0, 0);
        rect(0, 0, 60, 30);
        fill(256, 256, 256);
        textSize(12);
        text("Time : " + (int) (time), 0, 20);

        //Score
        fill(0, 0, 0);
        rect(260, 0, 90, 30);
        fill(256, 256, 256);
        textSize(12);
        text("Score : " + (int) (Score), 280, 20);


        //FPS

        framerate = (int) ((Math.random() * 7) + 55);
        fill(0, 0, 0);
        rect(520, 0, 80, 30);
        fill(256, 256, 256);
        textSize(12);
        text("FPS : " + (framerate), 530, 20);

        //Player


        if (Name=="Shrek") {
//            fill(0,256,0);
            image(shrekPhoto,x-15,y-15);
        }else if (Name=="Lenny") {
//            fill(256,256,256);
            image(lennyPhoto,x-15,y-15);
        }else if (Name=="Yeet"){
            fill(256,256,256);
            ellipse(x, y, 2 * rPlayer, 2 * rPlayer);

        }

        textSize(15);
        fill(256,256,256);
        text(Name, x - 17, y - 25);

        //Movement

        if (keyPressed == true) {

            if (key == 'a') {
                x = x - 10;

            }
            if (key == 'd') {
                x = x + 10;

            }
            if (key == 's') {
                y = y + 10;

            }
            if (key == 'w') {
                y = y - 10;

            }
        }

        //Physics
        if (y + 30 < 600) {
            y = y + 0.6f;
        }
        if (y + 15 >= 570) {
            y = y-50;
            Score = Score-1;
        }
        if (y - 30 <= -20) {
            Score = Score - 1;
            y = 300;
        }
        if (x + 30 >= 620) {
            Score = Score - 1;
            x = 300;
        }
        if (x - 30 <= -20) {
            Score = Score - 1;
            x = 300;
        }


        //random spawner
        if (timeCounter >= 300) {
            textSize(10);
            fill(256,256,256);
            text("Point", x1 - 10, y1 - 10);
            fill(256,256,256);
            if (Score<5){
                ellipse(x1, y1, 2 * rSpawn, 2 * rSpawn);
            }else {
                rect(x1,y1,2*rSpawn,2*rSpawn);
            }
            spawnCounter = spawnCounter + 1;
            if (spawnCounter >= 300) {
                spawnCounter = 0;
                timeCounter = 0;
                x1 = (int) (Math.random() * 510)+30;
                y1 = (int) (Math.random() * 510) +30;
                if (x1==x){
                    x1 = (int) (Math.random() * 510)+30;
                }
                if (y1==y){
                    y1 = (int) (Math.random() * 510) +30;
                }
            }
        }


        //time
        if (timeCounter <= 300) {
            timeCounter = timeCounter + 1;
        }

        //tracking
        distanceTracking();

    }if (nameCheck==false){
            fill(0,20,190);
            rect(0,10,600,210);
            fill(0,0,0);
            line(0,10,600,10);
            textSize(50);
            fill(256,256,256);
            text("Big Yeet",200,90);
            textSize(40);
            fill(red);
            text("THE GAME",200,150);
            textSize(20);
            fill(0,153,255);
            rect(0,210,260,550);
            fill(255,255,0);
            rect(260,210,360,160);
            fill(255,204,255);
            rect(260,370,340,230);
            fill(0,0,0);
            text("Name Selected : " + Name,320,295);
            fill(nameButtonColor1);
            rect(20,265,200,60);
            fill(0,0,0);
            text("Yeet ",100,300);
            fill(nameButtonColor2);
            rect(20,365,200,60);
            fill(0,0,0);
            text("Shrek ",100,400);
            fill(nameButtonColor3);
            rect(20,465,200,60);
            fill(0,0,0);
            text("Lenny ",100,500);


            fill(playButtonColor);
            rect(360,440,140,75);
            fill(0,0,0);
            text("Play",410,485);



            if ((mouseX>360)&&(mouseX<500)){
                if ((mouseY>440)&&(mouseY<515)){
                    playButtonColor= color(0,255,255);
                    if (mousePressed==true){
                        nameCheck = true;
                    } }else if ((mouseX<20)||(mouseX>220)){
                    playButtonColor = color(256,0,0);
                }
            }

            if ((mouseX>20)&&(mouseX<220)){
                if ((mouseY>265)&&(mouseY<325)){
                    nameButtonColor1 = color(204,0,204);
                    if (mousePressed==true){
                        Name = "Yeet";
                    } }else {
                    nameButtonColor1 = color(0,256,0);
                }
            }

            if ((mouseX>20)&&(mouseX<220)){
                if ((mouseY>365)&&(mouseY<425)){
                    nameButtonColor2 = color(204,0,204);
                    if (mousePressed==true){
                        Name = "Shrek";
                    } }else{
                    nameButtonColor2 = color(0,256,0);
                }
            }

            if ((mouseX>20)&&(mouseX<220)){
                if ((mouseY>465)&&(mouseY<525)){
                    nameButtonColor3 = color(204,0,204);
                    if (mousePressed==true){
                        Name = "Lenny";
                    } }else{
                    nameButtonColor3 = color(0,256,0);
                }
            }



        }

}

    public void distanceTracking(){
        distance = Math.sqrt(((x-x1)*(x-x1)+((y-y1)*(y-y1))));
        if ((distance<rPlayer+rSpawn)&&(timeCounter>30)){
            Score = Score + 1;
            spawnCounter = 300;
        }


    }



    public static void main(String[] args) {
        PApplet.main("IntroGraphics.graphicsGame");
    }



}