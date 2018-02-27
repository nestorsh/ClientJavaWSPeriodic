/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientjavawsperiodic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author entrar
 */
public class ClientJavaWSPeriodic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        //Pendiente por hacer
        
        System.out.println("Introduzca un elemento de la tabla periódica en inglés: ");
        BufferedReader in1 =  new BufferedReader(new InputStreamReader(System.in)); 
        String element=in1.readLine();
        
        System.out.println("Introduzca 1 para ver su símbolo, 2 para ver su número atómico, 3 para ver su masa atómica, 4 para ver el nombre de los átomos: ");
        BufferedReader in2 =  new BufferedReader(new InputStreamReader(System.in)); 
        String valor=in2.readLine();
        
        if(valor.equals("")){
            getData(getElementSymbol(element),"Symbol");
            getData(getAtomicNumber(element),"AtomicNumber");
            getData(getAtomicWeight(element),"AtomicWeight");
            getData(getAtoms(),"ElementName");
        }else{
            if(Integer.parseInt(valor)==1){
                getData(getElementSymbol(element),"Symbol");
            }
        
            if(Integer.parseInt(valor)==2){
                getData(getAtomicNumber(element),"AtomicNumber");
            }
        
            if(Integer.parseInt(valor)==3){
                getData(getAtomicWeight(element),"AtomicWeight");
            }
        
            if(Integer.parseInt(valor)==4){
                getData(getAtoms(),"ElementName");
            }
        }
 
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
    
    public static void getData(String xmlRecords, String tag) throws ParserConfigurationException, SAXException, IOException{
        
        DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        InputSource is = new InputSource();
        is.setCharacterStream(new StringReader(xmlRecords));

        Document doc = db.parse(is);
        NodeList nodes = doc.getElementsByTagName("Table");
        
        for (int i = 0; i < nodes.getLength(); i++) {
            Element element = (Element) nodes.item(i);

            NodeList number = element.getElementsByTagName(tag);
            Element line = (Element) number.item(0);
            System.out.println(tag+": "+ getCharacterDataFromElement(line));
        }
    }
    
    private static String getCharacterDataFromElement(Element e) {
        Node child = e.getFirstChild();
        if (child instanceof CharacterData) {
            CharacterData cd = (CharacterData) child;
            return cd.getData();
        }
        return "";

    }

}
