package org.system;

public class Desktop extends Computer //create class desktop and inherit using single inheritance
{

	public static void main(String[] args) 
	{
		Desktop desktop = new Desktop();
		desktop.computerModel();
		desktop.desktopSize();

	}
	public void desktopSize() //create method desktopsize
	{ 
		System.out.println("Desktop size is:" + "24 inches");
	}

}
