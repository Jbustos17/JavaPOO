package org.example;

public class CuentaBancaria {

        private String titular;
        private Double saldo;
        private int numeroDeCuenta;

        public CuentaBancaria() {
        }

        public CuentaBancaria(String titular, Double saldo, int numeroDeCuenta) {
            this.titular = titular;
            this.saldo = saldo;
            this.numeroDeCuenta = numeroDeCuenta;
        }

        public String getTitular() {
            return titular;
        }

        public void setTitular(String titular) {
            this.titular = titular;
        }

        public Double getSaldo() {
            return saldo;
        }

        public void setSaldo(Double saldo) {
            this.saldo = saldo;
        }

        public int getNumeroDeCuenta() {
            return numeroDeCuenta;
        }

        public void setNumeroDeCuenta(int numeroDeCuenta) {
            this.numeroDeCuenta = numeroDeCuenta;
        }

        @Override
        public String toString() {
            return "CuentaBancaria{" +
                    "titular='" + titular + '\'' +
                    ", saldo=" + saldo +
                    ", numeroDeCuenta=" + numeroDeCuenta +
                    '}';
        }

        public void depositar(double cantidad) {
            if (cantidad > 0) {
                saldo += cantidad;
                System.out.println("Deposito Exitoso " + saldo);
            } else {
                System.out.println("Cantidad Invalida");
            }
        }

        public void retirar(double cantidad) {
            if (cantidad > 0 && cantidad <= saldo) {
                saldo -= cantidad;
                System.out.println("Retiro Exitoso " + saldo);
            } else {
                System.out.println("Cantidad Invalida");
            }
        }

        public void mostrarInformacion(){

            System.out.println("titular:" +titular);
            System.out.println("saldo:" + saldo);
            System.out.println("numeroDeCuenta:" + numeroDeCuenta);
        }

    }


