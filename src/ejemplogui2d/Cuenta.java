
package ejemplogui2d;

import java.util.logging.Logger;


public class Cuenta {
    
    private String nombre;
    private int numeroCuenta;
    private float saldo;
    private int numRegistro;

    public Cuenta(String nombre, String numeroCuenta, String saldo) {
        this.nombre = nombre;
        this.numeroCuenta = Integer.valueOf(numeroCuenta);
        this.saldo = Float.valueOf(saldo);
    }
        
    public Cuenta(String nombre, int numeroCuenta, float saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + nombre + "Saldo: $" + saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }
    
    
}
