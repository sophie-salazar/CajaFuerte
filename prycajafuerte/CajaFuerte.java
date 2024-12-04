package com.mycompany.prycajafuerte;

public class CajaFuerte {
    private double saldoActual;

    // Constructor
    public CajaFuerte(double saldoInicio) {
        if (saldoInicio > 0) {
            saldoActual = saldoInicio;
            System.out.println("SALDO: " + saldoActual);
        } else {
            System.out.println("SaldoInicial no puede ser negativo: " + saldoInicio);
        }
    }

    // Getter para obtener el saldo actual
    public double getSaldoActual() {
        return saldoActual;
    }

    // Setter para modificar el saldo
    public void setSaldoActual(double saldoInicio) {
        if (saldoInicio > 0) {
            saldoActual += saldoInicio;
            System.out.println("Saldo: " + saldoActual);
        } else {
            System.out.println("Saldo inicial no puede ser negativo: " + saldoInicio);
        }
    }

    // Método para agregar dinero
    public void agregarDinero(double cantidad) {
        if (cantidad > 0) {
            saldoActual += cantidad;
            System.out.println("Saldo actualizado: " + saldoActual);
        } else {
            System.out.println("Cantidad inválida para agregar.");
        }
    }

    // Método para retirar dinero
    public void retirarDinero(double cantidad) {
        if (cantidad > 0 && cantidad <= saldoActual) {
            saldoActual -= cantidad;
            System.out.println("Saldo actualizado: " + saldoActual);
        } else {
            System.out.println("Cantidad inválida o saldo insuficiente.");
        }
    }
}
