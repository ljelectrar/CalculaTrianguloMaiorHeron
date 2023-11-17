import application.MaiorAreaTriangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Instanciação
        MaiorAreaTriangulo TringA = new MaiorAreaTriangulo();
        MaiorAreaTriangulo TriangB = new MaiorAreaTriangulo();

        // Pega os dados informados pelo usuário através do consoloe
        System.out.println("Insira os valores do PRIMEIRO triângulo: ");
        TringA.A = sc.nextDouble();
        TringA.B = sc.nextDouble();
        TringA.C = sc.nextDouble();

        System.out.println("Insira os valores do SEGUNDO triângulo: ");
        TriangB.A = sc.nextDouble();
        TriangB.B = sc.nextDouble();
        TriangB.C = sc.nextDouble();

        // Faz o cálculo das áreas dos triângulos
        double p = (TringA.A + TringA.B + TringA.C) / 2.0;
        double areaPrimeiro = Math.sqrt(p * (p - TringA.A) * (p - TringA.B) * (p - TringA.C));

        p = (TriangB.A + TriangB.B + TriangB.C) / 2.0;
        double areaSegundo = Math.sqrt(p * (p - TringA.A) * (p - TringA.B) * (p - TringA.C));

        System.out.printf("Área do Primeiro triângulo %.2f%n", areaPrimeiro);
        System.out.printf("Área do SEGUNDO triângulo %.2f%n", areaSegundo);

        // Testa qual área é maior ou se são iguais.
        if (areaPrimeiro == areaSegundo) {
            System.out.println("Os triângulos tem áreas iguais!");
        } else if (areaPrimeiro > areaSegundo){
            System.out.println("O Primeiro triângulo é maior!");
        } else {
            System.out.println("O Segundo triângulo é maior");
        }
        sc.close();
    }
}