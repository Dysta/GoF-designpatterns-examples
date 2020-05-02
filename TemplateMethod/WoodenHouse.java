package TemplateMethod;

public class WoodenHouse extends HouseTemplate {
    @Override
    void buildPillars() {
        System.out.println("Building wooden pillars");
    }

    @Override
    void buildWalls() {
        System.out.println("Building wooden walls");
    }
}
