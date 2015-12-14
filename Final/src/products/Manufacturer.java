
package products;


/**
 *
 * @author Karen Springford
 * @date 10/08/15
 * @version 1.4
 */
public class Manufacturer{
    
    private String manufacturerName;
    private int manufacturerID;
    private String typeOfProduct;
    
    public Manufacturer(){
        
    }
    
    public Manufacturer( String manufacturer, 
            int manufacturerID, String typeOfProduct){

    
    this.manufacturerName = manufacturerName;
    this.manufacturerID = manufacturerID;
    this.typeOfProduct = typeOfProduct;

    }
    
    public void setManufacturerName(){
    this.manufacturerName = manufacturerName;
    }
    
    public void setManufacturerID(int manufacturerID){
    this.manufacturerID = manufacturerID;
    }
    
    public void setTypeOfProduct(){
        this.typeOfProduct = typeOfProduct;
    }
    
    public String getManufacturerName(){
        return manufacturerName;
    }
    
    public int getManufacturerID(){
        return manufacturerID;
    }
    
    public String getTypeOfProduct(){
        return typeOfProduct;
    }
    
    @Override
    public String toString(){
        String manufacturerInfo ="";
        
        manufacturerInfo += "\nManufacturer Name:\t\t"+ manufacturerName;
        manufacturerInfo += "\nManufacturer ID:\t\t"+ getManufacturerID();
        manufacturerInfo += "\nType of Product:\t\t"+ getTypeOfProduct();
        
        return manufacturerInfo;
    }
}
