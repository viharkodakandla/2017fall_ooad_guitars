/**
 * Inventory.java
 * 09/10/17
 */
package test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Class: Object Oriented Analysis and Design Assignment 1 Student: vihar
 * Kodakandla ID: @01392814
 */

public class Inventory {
	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<Guitar>();
	}

	/**
	 * 
	 * @param serialNumber
	 * @param price
	 * @param builder
	 * @param model
	 * @param type
	 * @param backWood
	 * @param topWood
	 */
	public void addGuitar(String serialNumber, double price, String builder, String model, String type, String backWood,
			String topWood) {
		Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
		guitars.add(guitar);
	}

	/**
	 * 
	 * @param serialNumber
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
	 * 
	 * @param searchGuitar
	 * @return guitar object
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
