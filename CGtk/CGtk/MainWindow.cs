using System;
using System.Diagnostics;
using Gtk;
using System.Collections.Generic;
using CGtk;

abstract<
public partial class MainWindow: Gtk.Window
{    
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();
		Bombo bombo = new Bombo ();
		Panel panel = new Panel ();


		vBoxMain.Add (panel.Table);

		Random random = new Random ();


			Process.Start("espeak", " -v es " + EspeakHelper.ToEspeak(bola));
			
		};

	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}
}











