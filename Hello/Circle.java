public class Circle {
    String name;
    double radius;
    double height;
    static double pi = 3.14;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public Circle(String name, double radius, double height) {
        this.name = name;
        this.radius = radius;
        this.height = height;
    }

    public String getName()
    {
        return name;
    }
    public double printArea(){

        return pi * radius * radius;
    }
    public double printCircumference(){
        return 2 * pi * radius;
    }
    public double printVolume(){
        return pi * radius * radius * height;
    }
}
