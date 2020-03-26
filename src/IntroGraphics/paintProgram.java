package IntroGraphics;

import processing.core.PApplet;

import java.sql.SQLOutput;

public class paintProgram extends PApplet {

    int x, y;
    int c = color(0);
    int sX = 15;
    int sY = 15;
    boolean toggle = true;
    boolean mirrorPress = false;


    public void settings(){
        size(1000,1000);

    }

    public void setup(){
        frameRate((float) 144);
    }



    public void draw(){


        x= mouseX;
        y= mouseY;

        if ((toggle == true) || (mirrorPress==false)){
            fill(c);
            ellipse(x,y,sX,sY);

        } else if (toggle ==false){
            fill(c);
            rect(x,y,sX,sY);

        }
        if (mirrorPress == true){
            fill(c);
            ellipse(x,y,sX,sY);
            ellipse(1000-x,y,sX,sY);

        }


        if (mousePressed== true){


        }
        if (keyPressed==true){
            if (key == '1'){
                c=color(255,0,0);
            }
            if (key == '2'){
                c=color(0,255,0);
            }
            if (key == '3'){
                c=color(0,0,255);
            }
            if (key == '4'){
                c=color(255,125,175);
            }
            if (key == '5'){
                c=color(90,90,90);
            }
            if (key == '+'){
                sX = sX + 10;
                sY = sY + 10;
            }
            if (key == '-'){
                sX = sX-10;
                sY = sY - 10;
            }
            if (key == ' '){
                background(255,255,255);
            }
            if (key == 's'){
                save("yeetScreenshot");
            }
            if (key == 'c'){
                int r =(int)( Math.random()*256);
                int g =(int)( Math.random()*256);
                int b =(int)( Math.random()*256);
                c = color(r,g,b);
            }
            if (key == 'r'){
                if (toggle==true){
                    toggle = false;
                } else {
                    toggle = true;
                }
            }
            if (key == 'm'){
                if (mirrorPress==true){
                    mirrorPress = false;
                } else if (mirrorPress==false){

                    mirrorPress = true;
                }
            }

        }
        ;
    }

    public static void main(String[] args) {
        PApplet.main("IntroGraphics.paintProgram");
    }



}
