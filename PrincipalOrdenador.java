package OrdenadorPago;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrincipalOrdenador {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Ordenador ordenador1 = new Ordenador();

        System.out.println("indique marca del ordenador");
        ordenador1.marcaOrdenador = (br.readLine());
        System.out.println("indique precio inicial del ordenador");
        ordenador1.precioInicial = (Integer.parseInt(br.readLine()));
        System.out.println("indique forma de pago");
        System.out.println("""
                1- AL CONTADO
                2- MENSUALIDAD DE 6 MESES
                3- MENSUALIDAD DE 12 MESES
                """);
        ordenador1.formaPago = (byte) Integer.parseInt(br.readLine());


        ordenador1.calculo();
        }

    }

