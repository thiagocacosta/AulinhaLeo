package org.example;//package org.example;
//import java.util.Scanner;
//public class Main {
//    String nome, cidade;
//    int idade;
//    public static void main(String[] args) {
//
////        criei o scanner
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Digite seu nome: ");
//        nome = scanner.nextLine();
//
//        System.out.print("Digite sua idade: ");
////        convertendo string para int
//        idade = Integer.parseInt(scanner.nextLine());
//
//        System.out.print("Digite sua cidade: ");
//        cidade = scanner.nextLine();
//
//
//    }
//}

//public class Main {
//
//    public static void main(String[] args) {
//        int num1 = 9;
//        int num2 = 2;
//
//        System.out.println(num1+num2);
//        System.out.println(num1-num2);
//        System.out.println(num1*num2);
//        System.out.println(num1/num2);
//
//    }
//
//}

//public class Main {
//
//    public static void main(String[] args) {
//        double raiz;
//        raiz = Math.sqrt(4);
//        System.out.print(raiz);
//    }
//
//}


/*CELSIUS PARA F
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double celsius;
        double calculo;
        //Scanner scanner;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        celsius = Double.parseDouble(scanner.nextLine());

        calculo = (celsius * 1.8) + 32;

        System.out.println("O resultado é" + " " + calculo);

    }

}
 */
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double fr;
        double calculo;
        //Scanner scanner;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        fr = Double.parseDouble(scanner.nextLine());

        calculo = (fr - 32) / 1.8;

        System.out.println("O resultado é" + " " + calculo);

    }

}
 */
//
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        int peso;
//        float altura;
//        double calculo;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Digite o seu peso: ");
//        peso = Integer.parseInt(scanner.nextLine());
//
//        System.out.print("Digite sua altura: ");
//        altura = scanner.nextFloat();
//
//        calculo = peso / (altura * altura);
//
//        System.out.println("O resultado é" + " " + calculo);
//
//    }
//
//}

/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int valor;
        double calculo1, calculo2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        valor = Integer.parseInt(scanner.nextLine());

        calculo1 = Math.pow(valor,2);
        calculo2 = Math.pow(valor, 3);

        System.out.println("O resultado ao quadrado é" + " " + calculo1);
        System.out.println("O resultado ao cubo é" + " " + calculo2);
    }
}
 */

/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int base, altura;
        double calculo;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da base: ");
        base = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o valor da altura: ");
        altura = Integer.parseInt(scanner.nextLine());

        calculo = (base * altura) / 2;

        System.out.println("O resultado ao quadrado é" + " " + calculo);
    }
}
 */

// equações de segundo grau (ax2 + bx + c = 0 ) utilizando a formula de bhaskara ex: a = 1, b=2 e c = 13. Encontre o delta


/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        double x1, x2, a, b, c, delta;
        Scanner scanner = new Scanner(System.in);

        System.out.println("FORMULA DE BASKARA");
        System.out.print("Insira o valior de a: ");
        a = scanner.nextDouble();
        System.out.print("Insira o valior de b: ");
        b = scanner.nextDouble();
        System.out.print("Insira o valior de c: ");
        c = scanner.nextDouble();

        delta = (b * b) + (-4 * (a * c));
        System.out.printf("Delta: %.2f\n", delta);

        if (delta >= 0) {
            x1 = ((-(b) + Math.sqrt(delta)) / 2 * a);
            x2 = ((-(b) - Math.sqrt(delta)) / 2 * b);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

            else {
                System.out.println("Delta não possui raiz!");
            }

            }
    }
 */

//DESAFIO
/*
public class Main {
    public static void main(String[] args) {
        double conta;

        conta = Math.pow((((3 * Math.pow(-3.0 / 4.0, -2)) + (6 * (Math.pow(3.0, -1) / 4.0) - 4)) / (7 * Math.pow(-3.0 / 4.0, -1) + 2)), -1.0) + 4;

        System.out.println(conta);
    }
}
 */