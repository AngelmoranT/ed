using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{	
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();
		labelSaludo.Text = "Hola. Pon tu nombre y pulsa Adelante.";

		for (int vez = 0; vez < 5; vez++) {
			Button button = new Button ();
			button.Label = "" + vez;
			button.Visible = true;
			vBoxMain.Add (button);
			button.Clicked += OnButtonGoForwardClicked;
		}

	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Console.WriteLine ("OnDeleteEvent");
		Application.Quit ();
		a.RetVal = true;
	}


	protected void OnButtonGoForwardClicked (object sender, EventArgs e)
	{
		Button button = (Button)sender;
		labelSaludo.Text = "Hola " + entryNombre.Text + "pulsado" + button.Label;	
	}
}


//Console.WriteLine("27<</10 = " + 27/10 + "resto = " + 20%7);












