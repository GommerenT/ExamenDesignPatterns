package domotica.command;

import domotica.*;
import domotica.model.*;

public class SetAllDoorsClosed implements Command {

	House house;	
	
	//Constructor
	public SetAllDoorsClosed(House house) {
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