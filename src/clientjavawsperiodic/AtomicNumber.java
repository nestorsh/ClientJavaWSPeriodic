/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientjavawsperiodic;

import org.simpleframework.xml.Element;

/**
 *
 * @author entrar
 */
public class AtomicNumber {
    @Element
    private String atomicNumber;
    
    @Element
    private String elementName;
    
    @Element
    private String symbol;
    
    @Element
    private String atomicWeight;
    
    @Element 
    private String boilingPoint;
    
    @Element
    private String ionisationPotential;
    
    @Element
    private String electroNegativity;
    
    @Element
    private String atomicRadius;
    
    @Element 
    String meltingPoint;
    
    @Element
    String density;
    
     public String getAtomicNumber() {
        return atomicNumber;
    }

    public String getElementName() {
        return elementName;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getAtomicWeight() {
        return atomicWeight;
    }

    public String getBoilingPoint() {
        return boilingPoint;
    }

    public String getIonisationPotential() {
        return ionisationPotential;
    }

    public String getElectroNegativity() {
        return electroNegativity;
    }

    public String getAtomicRadius() {
        return atomicRadius;
    }

    public String getMeltingPoint() {
        return meltingPoint;
    }

    public String getDensity() {
        return density;
    }

    public void setAtomicNumber(String atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setAtomicWeight(String atomicWeight) {
        this.atomicWeight = atomicWeight;
    }

    public void setBoilingPoint(String boilingPoint) {
        this.boilingPoint = boilingPoint;
    }

    public void setIonisationPotential(String ionisationPotential) {
        this.ionisationPotential = ionisationPotential;
    }

    public void setElectroNegativity(String electroNegativity) {
        this.electroNegativity = electroNegativity;
    }

    public void setAtomicRadius(String atomicRadius) {
        this.atomicRadius = atomicRadius;
    }

    public void setMeltingPoint(String meltingPoint) {
        this.meltingPoint = meltingPoint;
    }

    public void setDensity(String density) {
        this.density = density;
    }
    
    
    
    
}
