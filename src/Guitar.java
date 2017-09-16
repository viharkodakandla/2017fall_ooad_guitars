/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 1
 * Student: divya
 */

/**
 * This class describes Guitar
 * @author divya
 *
 */
public class Guitar {

  private String serialNumber, builder, model, type, backWood, topWood;
  private double price;
 /**
  * Creates new Guitar
  * 
  * @param serialNumber
  * @param price
  * @param builder
  * @param model
  * @param type
  * @param backWood
  * @param topWood
  */
 public Guitar(String serialNumber, double price,
                String builder, String model, String type,
                String backWood, String topWood) {
    this.serialNumber = serialNumber;
    this.price = price;
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.backWood = backWood;
    this.topWood = topWood;
  }

/**
 * 
 * @return serialNumber
 */
 public String getSerialNumber() {
    return serialNumber;
  }

 
 /**
  * 
  * @return price
  */
  public double getPrice() {
    return price;
  }
  
  /**
   * 
   * @param newPrice
   */
  public void setPrice(float newPrice) {
    this.price = newPrice;
  }
  /**
   * 
   * @return builder
   */
  public String getBuilder() {
    return builder;
  }
  
  /**
   * 
   * @return model
   */
  public String getModel() {
    return model;
  }
  
  /**
   * 
   * @return type
   */
  public String getType() {
    return type;
  }
  
  /**
   * 
   * @return backwood
   */
  public String getBackWood() {
    return backWood;
  }
  
  /**
   * 
   * @return topWood
   */
  public String getTopWood() {
    return topWood;
  }
}
