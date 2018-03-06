package tiny.controller;

import tiny.view.PopupDisplay;

public class TinyController
{
	private PopupDisplay display;
	
	public TinyController()
	{
		display = new PopupDisplay();
	}
	
	public void start()
	{
		recursivePop("Display sample");
	}
	
	private void recursivePop(String message)
	{
		if(message.length() == 1)
		{
			display.displayText(message);
		}
		else
		{
			recursivePop(message.substring(1, message.length()));
			display.displayText(message);
		}
	}
}
