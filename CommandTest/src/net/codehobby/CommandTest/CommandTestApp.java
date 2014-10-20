package net.codehobby.CommandTest;

import java.util.ArrayList;
import java.util.List;

public class CommandTestApp {

	public static void main(String[] args) {
		List<Command> testCommands = new ArrayList<Command>();
		testCommands.add( new PrintCommand("Command 1") );
		testCommands.add( new PrintCommand("Command 2") );
		testCommands.add( new PrintCommand("Command 3") );
		testCommands.add( new CommandRecord("ADD", 1) );
		testCommands.add( new CommandRecord("REMOVE", 1) );

		for( Command c : testCommands )
		{
			c.execute();
		}
	}

}
