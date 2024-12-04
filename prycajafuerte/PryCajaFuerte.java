
package com.mycompany.prycajafuerte;

public class PryCajaFuerte {
    
    public static void main(String[] args){
        CajaFuerte caja_fuerte=new CajaFuerte(100);
    System.out.println(caja_fuerte.getSaldoActual());
    caja_fuerte.setSaldoActual(1000000);
    System.out.println(caja_fuerte.getSaldoActual());
    }
}
