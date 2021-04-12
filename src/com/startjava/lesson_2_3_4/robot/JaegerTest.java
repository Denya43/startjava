package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {   
    public static void main(String[] args) {
        Jaeger hunterVertigo = new Jaeger();
        hunterVertigo.setModelName("Hunter Vertigo");
        hunterVertigo.setMark("unknown Mark classification");
        hunterVertigo.setOrigin("China");
        hunterVertigo.setHeight(50.4f);
        hunterVertigo.setWeight(2.2f);
        hunterVertigo.setArmor(8);
        hunterVertigo.move();

        Jaeger atlasDestroyer = new Jaeger();
        atlasDestroyer.setModelName("Atlas Destroyer");
        atlasDestroyer.setMark("Mark-3");
        atlasDestroyer.setOrigin("USA");
        atlasDestroyer.setHeight(55.4f);
        atlasDestroyer.setWeight(2.0f);
        atlasDestroyer.setArmor(10);
        atlasDestroyer.scanKaiju();
    }
}