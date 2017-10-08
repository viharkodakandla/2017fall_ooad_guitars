/**
 * Class: Object Oriented Analysis and Design 
 * Professor: Orlando Montalvo
 * Assignment 1   
 * Student: vihar Kodakandla 
 * ID: @01392814
 */
package test;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * Inventory class implements the function such as add, get and search function of Guitar class .
 *
 */

public class Inventory {
	private List<Guitar> guitars;

	/**
	 * constructor - creates new guitar inventory
	 */
	public Inventory() {
		guitars = new LinkedList<Guitar>();
	}

	/**
	 * Adds a new guitar to the guitars list with the following arguments
	 * 
	 * @param serialNumber -  Guitar Serial number
	 * @param price -  Guitar price     
	 * @param builder -  Guitar builder
	 * @param model - Guitar model
	 * @param type - Guitar type        
	 * @param backWood - Guitar backwood    
	 * @param topWood - Guitar topwood      
	 */
	public void addGuitar(String serialNumber, double price, String builder, String model, String type, String backWood,
			String topWood) {
		Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
		guitars.add(guitar);
	}

	/**
	 * Gets the guitar with the provided serialnumber
	 * @return serialNumber Guitar serial number
	 * @return guitar object
	 */
	public Guitar getGuitar(String serialNumber) {
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;

	}

	/**
	 *  Searches the guitar with provided searchGuitar
	 *  
	 * @param searchGuitar Guitar object        
	 * @return guitar object or null
	 */
	public Guitar search(Guitar searchGuitar) {

		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			// Ignore serial number since that's unique
			// Ignore price since that's unique
			String builder = searchGuitar.getBuilder();
			if ((builder != null) && (!builder.equals("")) && (!builder.equals(guitar.getBuilder())))
				continue;
			String model = searchGuitar.getModel();
			if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel())))
				continue;
			String type = searchGuitar.getType();
			if ((type != null) && (!searchGuitar.equals("")) && (!type.equals(guitar.getType())))
				continue;
			String backWood = searchGuitar.getBackWood();
			if ((backWood != null) && (!backWood.equals("")) && (!backWood.equals(guitar.getBackWood())))
				continue;
			String topWood = searchGuitar.getTopWood();
			if ((topWood != null) && (!topWood.equals("")) && (!topWood.equals(guitar.getTopWood())))
				continue;
			return guitar;
		}
		return null;
	}
}
