/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientjavawsperiodic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

/**
 *
 * @author entrar
 */
public class ClientJavaWSPeriodic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //Pendiente por hacer
        Serializer serializar=new Persister();
        
        System.out.println("Introduzca un elemento de la tabla periódica en inglés: ");
        BufferedReader in1 =  new BufferedReader(new InputStreamReader(System.in)); 
        String element=in1.readLine();
        System.out.println("El símbolo del elemento es: "+getElementSymbol(element));
        System.out.println("El número atómico del elemento es: "+getAtomicNumber(element));
        System.out.println("La masa atómica del elemento es: "+getAtomicWeight(element));
        System.out.println("Los átomos son: "+getAtoms());
        
    }

    private static String getElementSymbol(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getElementSymbol(elementName);
    }

    private static String getAtomicNumber(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicNumber(elementName);
    }

    private static String getAtoms() {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtoms();
    }

    private static String getAtomicWeight(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicWeight(elementName);
    }

}
