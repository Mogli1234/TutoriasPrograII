/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author Mogli
 */
public class freshProducts extends Products  {
    private String countryOrigin;
    private String enpaquetDate;
    

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    public String getEnpaquetDate() {
        return enpaquetDate;
    }

    public void setEnpaquetDate(String enpaquetDate) {
        this.enpaquetDate = enpaquetDate;
    }
    
    
    
    @Override
    public String getDateExpyre() {
     return this.dateExpyre;
    }

    @Override
    public void setDateExpyre(String dateExpyre) {
        this.dateExpyre = dateExpyre;
    }

    @Override
    public int getLoteNumber() {
       return this.LoteNumber;
    }

    @Override
    public void setLoteNumber(int LoteNumber) {
        this.LoteNumber = LoteNumber;
    }

    @Override
    public String toString() {
        String mensege = "";
        
        return mensege;
    }
    
    
    
}
