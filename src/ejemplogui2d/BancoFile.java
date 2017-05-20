/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogui2d;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 20126293
 */
public class BancoFile {
    private RandomAccessFile archivoBanco;
    private final int RECORD_SIZE = 38;

    public BancoFile(String nombreArchivo){
        try {
            archivoBanco = new RandomAccessFile(nombreArchivo, "rw");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BancoFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrar(int numRegistro)
    {
        try {
            Cuenta c = leer(numeroDeRegistros()-1);

            grabar(c, numRegistro);

            archivoBanco.setLength(archivoBanco.length()-RECORD_SIZE);

        } catch (IOException ex) {
            Logger.getLogger(BancoFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Cuenta> buscarSaldo(float saldo){

            ArrayList<Cuenta> resultado = new ArrayList();

            for(int i = 0; i < numeroDeRegistros(); i++)
            {
               Cuenta c = leer(i);
               c.setNumRegistro(i);
               if(c.getSaldo() < saldo);
               resultado.add(c);
            }
            return resultado;

    }

    public ArrayList<Cuenta> leerTodos(){
        try
        {
            ArrayList<Cuenta> todos = new ArrayList();
            for(int i = 0; i < archivoBanco.length()/RECORD_SIZE; i++){
               Cuenta c = leer(i);
               c.setNumRegistro(i);
               todos.add(c);
            }
            return todos;
        }
        catch (IOException ex)
        {
            Logger.getLogger(BancoFile.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
    public Cuenta leer(int numRegistro){

        try {
            int pos = RECORD_SIZE * numRegistro;

            archivoBanco.seek(pos);

            byte[] b = new byte[30];
            archivoBanco.read(b);
            String s = getFixedString(b);

            return new Cuenta(s, archivoBanco.readInt(), archivoBanco.readFloat());

        } catch (IOException ex) {
            Logger.getLogger(BancoFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void grabar(Cuenta cuenta, int numReg){
        try
        {

            long pos = archivoBanco.length();

            if(numReg > -1){
                pos = RECORD_SIZE * numReg;
            }
            archivoBanco.seek(pos);

            archivoBanco.writeBytes(getFixedString(cuenta.getNombre(), 30));

            archivoBanco.writeInt(cuenta.getNumeroCuenta());

            archivoBanco.writeFloat(cuenta.getSaldo());

        }
        catch (IOException ex) {
            Logger.getLogger(BancoFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int numeroDeRegistros(){
        try
        {
            return (int) (archivoBanco.length()/RECORD_SIZE);

        } catch (IOException ex)
        {
            Logger.getLogger(BancoFile.class.getName()).log(Level.SEVERE, null, ex);
        }

        return -1;
    }

    public String getFixedString(String s, int len){
        StringBuilder sb = new StringBuilder(s);
        sb.setLength(len);

        return sb.toString();
    }

    public String getFixedString(byte b[]){
        String s = new String(b);
        // int pos = s.indexof('\0');
        return s.substring(0, s.indexOf('\0'));
    }
}
