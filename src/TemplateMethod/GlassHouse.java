package TemplateMethod;

public class GlassHouse extends HouseTemplate {

    @Override
    void buildPillars() {
        System.out.println("Building glass pillars");
    }

    @Override
    void buildWalls() {
        System.out.println("Building glass walls");
    }
}
