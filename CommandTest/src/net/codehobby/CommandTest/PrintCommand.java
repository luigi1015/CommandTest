package net.codehobby.CommandTest;

public class PrintCommand implements Command {

	private String message = null;

	PrintCommand( String newMessage )
	{
		message = newMessage;
	}

	public void setMessage( String newMessage )
	{
		message = newMessage;
	}

	public String getMessage()
	{
		return message;
	}

	@Override
	public void execute() {
		if( message != null )
		{
			System.out.println( message );
		}
		else
		{
			throw new IllegalStateException( "Message not initialized." );
		}
	}

}
