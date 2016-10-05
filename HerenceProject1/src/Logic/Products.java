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
public abstract class Products {
    
    public String dateExpyre;
    public int LoteNumber;

    public abstract String getDateExpyre();
    public abstract void setDateExpyre(String dateExpyre);
    
    public abstract int getLoteNumber();
    public abstract void setLoteNumber(int LoteNumber);
    
    
    
}
