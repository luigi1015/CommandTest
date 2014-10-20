package net.codehobby.CommandTest;

public class CommandRecord implements Command {

	private String type = null;
	private long id = 0;

	CommandRecord( String newType, long newID )
	{
		type = newType;
		id = newID;
	}

	@Override
	public void execute() {
		if( type == null )
		{
			throw new IllegalStateException( "Type not initialized." );
		}
		else if( id == 0 )
		{
			throw new IllegalStateException( "ID not initialized." );
		}
		else
		{
			if( type.equals("ADD") )
			{
				System.out.println( "INSERT record " + id );
			}
			else if( type.equals("REMOVE") )
			{
				System.out.println( "DELETE record " + id );
			}
			else
			{
				System.out.println( "Unrecognized command." );
			}
		}
	}

}
