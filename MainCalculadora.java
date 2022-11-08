package orientadoObjetos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainCalculadora {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Calculadora calculadora1 = new Calculadora();
        byte op;
        do {


        System.out.println("escribe numero a");
        calculadora1.a = Integer.parseInt(br.readLine());
        System.out.println("escribe numero b");
        calculadora1.b = Integer.parseInt(br.readLine());

            System.out.println("que calculo quieres hacer?");
            System.out.println("opcion 1 sumar");
            System.out.println("opcion 2 restar");
            System.out.println("opcion 3 multiplicacion");
            System.out.println("opcion 4 dividir");
            op = (byte) Integer.parseInt(br.readLine());


            switch (op) {
                case 1:
                    System.out.println("la suma es ");
                    calculadora1.sumar();
                    break;
                case 2:
                    System.out.println("la resta es: ");
                    calculadora1.restar();
                    break;
                case 3:

                    System.out.println("la multiplicacion es: ");
                    calculadora1.multiplicar();
                    break;
                case 4:
                    System.out.println("la division es: ");
                    calculadora1.dividir();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } while (op >= 0 && op <= 4);


    }
}