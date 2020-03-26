package IntroGraphics;

import processing.core.PApplet;

public class pongSoham extends PApplet {

    int pink = color(255, 87, 207);
    int green = color(0, 255, 0);
    int red = color(255, 0, 0);
    int blue = color(0, 0, 255);
    int counter = 0;
    float x, y, color, x1, y1, Score, Score2, ballX, ballxDirection, ballY;
    double  distance, time, yAngle, Speed, XSpeed, YSpeed;
    boolean up, down, up1, down1;

    public void settings() {
        size(600, 600);


    }

    public void setup() {
        x = 10;
        y = 300;
        x1 = 590;
        y1 = 300;
        ballX = 300;
        ballxDirection = 1;
        ballY = 300;
        color = color(0, 0, 0);
        XSpeed = 5;
        YSpeed = 0;
        Speed = 1;

    }

    public void draw() {

        background(0, 0, 0);
        fill(66, 233, 245);



        //IntroGraphics.test (only used to IntroGraphics.test logic)
//        textSize(12);
//        text("Distance : " + (distance), 0, 550);
//        textSize(15);
//        text("Angle"+ yAngle, 30,30);
//        text("Speed"+Speed, 30, 50);
//        text("X"+XSpeed, 30, 75);
//        text("Y"+YSpeed, 30, 90);





        //Score
        fill(256, 256, 256);
        textSize(50);
        text("" + ((int)Score), 230, 55);
        text("" + ((int)Score2), 340, 55);


        //line
        stroke(200);
        fill(256, 256, 256);
        line(300, 0, 300, 600);

        //ball
        ballX = ballX - ((int)XSpeed * (ballxDirection));
        ballY = ballY +((int)YSpeed);
//        XSpeed = Speed * Math.cos(yAngle);
//        YSpeed = Speed * Math.sin(yAngle);
//        Speed = Math.sqrt((XSpeed)*(XSpeed))+(YSpeed)*(YSpeed);
//        yAngle = yAngle*(Math.PI/180);


        fill(256, 256, 256);
        ellipse(ballX, ballY, 20, 20);
//        Speed = 1;
        YSpeed = yAngle;


        //Player1
        fill(256, 256, 256);
        rect(x, y, 5, 80);

        //Player2
        fill(256, 256, 256);
        rect(x1, y1, 5, 80);


        //Movement

        if (up == true) {
            if (y > 0) {
                if (key == 'w') {
                    y = y - 15;


                }
            }
        }

        if (up1 == true) {
            if (y1 > 0) {
                if (keyCode == UP) {
                    y1 = y1 - 15;


                }
            }

        }
        if (down == true) {
            if (y + 80 < 600) {
                if (key == 's') {
                    y = y + 15;



                }
            }
        }
        if (down1 == true) {
            if (y1 + 80 < 600) {
                if (keyCode == DOWN) {
                    y1 = y1 + 15;

                }
            }

        }







        //edge detection

        if (((ballX>x+5)&&(ballX<x1-5))){
            if (ballY-30<=0){
                yAngle = Math.random()*4;
            }
            if (ballY+30>=600){
                yAngle= Math.random()*-4;

            }

        }


        if ((ballY <= y + 80) && (ballY >= y)) {
            if (ballX - 30 <= x + 7) {
                ballX = ballX + 6;
                ballxDirection = ballxDirection * (-1);
                yAngle = ((Math.random()*8)-4);

            }
        } else if ((ballY > y + 80) || (ballY < y)) {
            if (ballX - 30 <= x-30) {
                Score2 = Score2 + 1;
                ballxDirection = ballxDirection * (-1);
                ballX = 300;
                ballY = 300;
                yAngle = 0;
            }
        }


        if ((ballY <= y1 + 80) && (ballY >= y1)) {
            if (ballX + 30 >= x1) {
                ballX = ballX - 6;
                ballxDirection = ballxDirection * (-1);
                yAngle = ((Math.random()*8)-4);

            }
        } else if ((ballY > y1 + 80) || (ballY < y1)) {
            if (ballX + 30 >= x1+30) {
                Score = Score + 1;
                ballxDirection = ballxDirection * (-1);
                ballX = 300;
                ballY = 300;
                yAngle = 0;
            }
        }


    }


    public void keyPressed() {
        if (key == 'w') up = true;
        if (key == 's') down = true;
        if (keyCode == UP) up1 = true;
        if (keyCode == DOWN) down1 = true;

    }

    public void keyReleased() {
        if (key == 'w') up = false;
        if (key == 's') down = false;
        if (keyCode == UP) up1 = false;
        if (keyCode == DOWN) down1 = false;

    }


    public static void main(String[] args) {
        PApplet.main("IntroGraphics.pongSoham");
    }


}