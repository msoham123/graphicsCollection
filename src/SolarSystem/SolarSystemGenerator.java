package SolarSystem;

import peasy.PeasyCam;

import processing.core.PApplet;
import processing.core.PImage;

public class SolarSystemGenerator extends PApplet {

    Planet sun;
    PeasyCam cam;
    static PImage sunImage;


    public void settings(){
        size(600,600, P3D);
    }

    public void setup(){
        cam = new PeasyCam(this,600);

        sun = new Planet(70,0, this, 0.01f, "Star");
        sun.spawnSatellites(5, 1);

        sunImage = loadImage("/solarSystemAssets/sunmap.jpg");
    }

    public void draw(){
        background(0);
        lights();
        sun.show();
        sun.orbit();
    }

    public static void main(String[] args) {
        PApplet.main("SolarSystem.SolarSystemGenerator");
    }

    public static PImage getImage(String image){
        if(image.equalsIgnoreCase("sun")){
            return sunImage;
        }else{
            return sunImage;
        }
    }

}
