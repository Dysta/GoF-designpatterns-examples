package TemplateMethod;

public abstract class HouseTemplate {

    final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built.");
    }

    private void buildFoundation(){
        System.out.println("Building foundation");
    }

    abstract void buildPillars();
    abstract void buildWalls();

    private void buildWindows(){
        System.out.println("Building windows");
    }
}
