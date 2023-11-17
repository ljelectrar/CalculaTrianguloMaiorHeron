package application;

public class MaiorAreaTriangulo {

    public double A;
    public double B;
    public double C;

    public double area(double a, double b, double c) {

        double p = (a + b + c)/2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
