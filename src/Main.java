import application.MaiorAreaTriangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Instanciação
        MaiorAreaTriangulo triangA = new MaiorAreaTriangulo();
        MaiorAreaTriangulo triangB = new MaiorAreaTriangulo();

        // Pega os dados informados pelo usuário através do consoloe
        System.out.println("Insira os valores do PRIMEIRO triângulo: ");
        double triangA_A = sc.nextDouble();
        double triangA_B = sc.nextDouble();
        double triangA_C = sc.nextDouble();

        System.out.println("Insira os valores do SEGUNDO triângulo: ");
        double triangB_A = sc.nextDouble();
        double triangB_B = sc.nextDouble();
        double triangB_C = sc.nextDouble();

        // Faz o cálculo das áreas dos triângulos
        double areaPrimeiro = triangA.area(triangA_A, triangA_B, triangA_C);
        double areaSegundo = triangB.area(triangB_A, triangB_B, triangB_C);

        System.out.printf("Área do Primeiro triângulo %.2f%n", areaPrimeiro);
        System.out.printf("Área do SEGUNDO triângulo %.2f%n", areaSegundo);

        System.out.println();
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