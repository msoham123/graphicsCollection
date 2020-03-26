package SolarSystem;
import processing.core.*;

import static processing.core.PConstants.CLOSE;
import static processing.core.PConstants.SPHERE;

public class Planet {

    static PApplet window;

    //Properties
    float radius, angle, distance, orbitSpeed;
    String classification;
    int color;
    PVector vector;
    PShape globe;

    //Data
    Planet[] planets;

    Planet(float radius, float distance, PApplet w, float orbitSpeed, String classification){
        vector = PVector.random3D();
        this.radius = radius;
        this.distance = distance;
        vector.mult(distance);
        window = w;
        angle = window.random(PConstants.TWO_PI);
        this.orbitSpeed = orbitSpeed;



        if(classification.equalsIgnoreCase("Star")){
            color = window.color(242,239,65,100);
        }else if (classification.equalsIgnoreCase("Planet")){
            color = window.color(92,242,65,100);
        }else if (classification.equalsIgnoreCase("Moon")){
            color = window.color(65,169,242,100);
        }else{
            color = window.color(0,100);
        }
        window.noStroke();
        window.fill(color);
        window.beginShape();
        globe = window.createShape(SPHERE, radius);
        globe.setTexture(SolarSystemGenerator.getImage("Sun"));
        window.endShape(CLOSE);
    }

    void show(){
        window.pushMatrix();
        window.noStroke();

        PVector constant = new PVector(1,0,1);
        PVector crossVector = vector.cross(constant);

        window.rotate(angle,crossVector.x,crossVector.y,crossVector.z);
//        window.stroke(255);
//        window.line(0,0,0,vector.x,vector.y,vector.z);
//        window.line(0,0,0,crossVector.x,crossVector.y,crossVector.z);

//        window.rotate(angle);
//        window.translate(distance,0);
        window.translate(vector.x,vector.y,vector.z);



//        window.ellipse(0,0,radius*2, radius*2);
//        window.sphere(radius);
        window.shape(globe);


        if(planets!=null){
            for (int i = 0; i< planets.length; i++){
                planets[i].show();
            }
        }

        window.popMatrix();
    }

    void spawnSatellites(int totalSatellites, int level){
        planets = new Planet[totalSatellites];
        for(int i = 0; i<totalSatellites; i++){

            if(level==1){
                float radius = (float) (this.radius*0.2);
                float distance =  window.random(150,300);
                float orbitSpeed = window.random(0.01f,0.07f);
                planets[i] = new Planet(radius, distance, window, orbitSpeed, "Planet");
            }else{
                float radius = (float) (this.radius*0.5);
                float distance =  window.random(this.radius+radius, (this.radius+radius)*2);
                float orbitSpeed = window.random(0.01f,0.05f);
                planets[i] = new Planet(radius, distance, window, orbitSpeed, "Moon");
            }

            if(level<2){
                planets[i].spawnSatellites((int)window.random(0f,2f),level+1);
            }
        }
    }

    void orbit(){
        angle+=orbitSpeed;
        if(planets!=null){
            for(int i = 0; i< planets.length; i++){
                planets[i].orbit();
            }
        }
    }
}
