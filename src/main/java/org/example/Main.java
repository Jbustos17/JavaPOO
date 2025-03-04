package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Bustos", 50.6000, 1234567);
        CuentaBancaria cuenta2 = new CuentaBancaria("JUAN CAPURRO", 10.000, 12345678);

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Mostrar información de una cuenta");
            System.out.println("4. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            System.out.print("Ingrese el número de cuenta: ");
            int numeroCuenta = scanner.nextInt();
            scanner.nextLine();

            CuentaBancaria cuentaSeleccionada = null;
            if (numeroCuenta == cuenta1.getNumeroDeCuenta()) {
                cuentaSeleccionada = cuenta1;
            } else if (numeroCuenta == cuenta2.getNumeroDeCuenta()) {
                cuentaSeleccionada = cuenta2;
            } else {
                System.out.println("Número de cuenta inválido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double deposito = scanner.nextDouble();
                    scanner.nextLine();
                    cuentaSeleccionada.depositar(deposito);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retiro = scanner.nextDouble();
                    scanner.nextLine();
                    cuentaSeleccionada.retirar(retiro);
                    break;
                case 3:
                    cuentaSeleccionada.mostrarInformacion();
                    break;

            }
        } while (opcion != 3);

        scanner.close();
    }
}
