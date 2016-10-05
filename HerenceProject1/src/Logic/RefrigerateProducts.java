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
public class RefrigerateProducts extends Products{
    private String envasedDate;
    private String orgCode;
    private double recomendTemp;
    private String originCountry;

    public String getEnvasedDate() {
        return envasedDate;
    }

    public void setEnvasedDate(String envasedDate) {
        this.envasedDate = envasedDate;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public double getRecomendTemp() {
        return recomendTemp;
    }

    public void setRecomendTemp(double recomendTemp) {
        this.recomendTemp = recomendTemp;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
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
        return "RefrigerateProducts{" + "envasedDate=" + envasedDate + ", orgCode=" + orgCode + ", recomendTemp=" + recomendTemp + ", originCountry=" + originCountry + '}';
    }
    
    
    
}
