package BallStuff;

public class Ball {
    float x,y,xSpeed,ySpeed;
    int color;

    public Ball (float x, float y, float xSpeed, float ySpeed,int color){
        this.x=x;
        this.y=y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.color = color;


    }

    public void applyGravity(){
        if (y<600) {
            ySpeed = ySpeed + 0.6f;
        }
    }

    public void move(){
        x = x + xSpeed;
        y = y + ySpeed;
    }
    public void directionDetection(){

        if ((y>600)||(y<0)) ySpeed = -ySpeed;
        if ((x>600)||(x<0)) xSpeed = -xSpeed;
    }

    public void setRandomPosition(){
        x = (float)(Math.random()*600);
        y = (float)(Math.random()*600);
    }

    public void setRandomSpeeds(){
        xSpeed = (float)(Math.random()*6);
        ySpeed = (float)(Math.random()*6);
    }

    public void setPositionOffScreen(){
        x = 1000;
        y = 1000;
    }

    public void stop(){
        xSpeed = 0;
        ySpeed = 0;

    }




    


}
