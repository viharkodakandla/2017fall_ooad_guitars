/**
 * Class: Object Oriented Analysis and Design 
 * Professor: Orlando Montalvo
 * Assignment 1   
 * Student: vihar Kodakandla 
 * ID: @01392814
 */

/**
 * Contains the properties and functions of guitar.
 */

public class Guitar {

	private String serialNumber, builder, model, type, backWood, topWood;
	private double price;

	/**
	 * Constructor with the following arguments
	 * @param serialNumber Guitar Serial number
	 * @param price Guitar price
	 * @param builder Guitar builder
	 * @param model Guitar model
	 * @param type Guitar type
	 * @param backWood Guitar backwood
	 * @param topWood Guitar topwood
	 */
	public Guitar(String serialNumber, double price, String builder, String model, String type, String backWood,
			String topWood) {
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
	 * @return string Guitar serialNumber 
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * 
	 * @return double Guitar price 	
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * 
	 * @param newPrice Guitar price
	 */
	public void setPrice(float newPrice) {
		this.price = newPrice;
	}

	/**
	 * 
	 * @return String Guitar builder 
	 */
	public String getBuilder() {
		return builder;
	}

	/**
	 * 
	 * @return string Guitar model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * 
	 * @return String Guitar type
	 */
	public String getType() {
		return type;
	}

	/**
	 * 
	 * @return String Guitarbackwood
	 */
	public String getBackWood() {
		return backWood;
	}

	/**
	 * 
	 * @return String Guitar topwood
	 */
	public String getTopWood() {
		return topWood;
	}
}
