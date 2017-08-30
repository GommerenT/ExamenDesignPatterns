package domotica.command;

import domotica.model.House;
import domotica.model.Kitchen;

public class SetAllDoorsOpen implements Command {

	House house;	
	
	//Constructor
	public SetAllDoorsOpen(House house) {
		super();
		this.house = house;
	}
	
	// Execute
	@Override
	public void execute() {
		Kitchen living = house.getKitchen();
		living.isDoorClosed();
	}

}
