/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;


import java.util.ArrayList;

/**
 *
 * @author Mogli
 */
public class Methods {
    public ArrayList<freshProducts> fresProductList;
    public ArrayList<RefrigerateProducts> refriedProductsList;

    public Methods() {
     this.fresProductList = new ArrayList<freshProducts>();
     this.refriedProductsList = new ArrayList<RefrigerateProducts>();
    }
    
    public void createNewFreshProduct(freshProducts newProduct){
        this.fresProductList.add(newProduct);
    }
    
    public void createNewRefriedProduct(RefrigerateProducts newProduct){
        this.refriedProductsList.add(newProduct);
    }
    
    public String printFreshProducts(){
        String message="";
        for(freshProducts product : this.fresProductList){
            message += "Fresh product original Country: "+product.getCountryOrigin()
                    +"/n"+"Expyre Date: "+product.getDateExpyre()+"/n"+
                    "Lote Number: "+product.getLoteNumber()
                    +" and finally Empaquet Date: "+product.getEnpaquetDate()+"/n";
        }
        return message;
    }
    
    
}
