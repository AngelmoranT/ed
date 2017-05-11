using System;
using System.Collections.Generic;
using Gtk;

namespace CGtk
{
	public class Panel
	{
		private const int NUMERO_BOLAS = 90;
			private IList<Button> Buttons = new List<Button> (); 
			private static readonly Gdk.Color COLOR_GREEN = new Gdk.Color (0, 255, 0);
			private Table table = new Table (9, 10, true);
			public Panel (){
			for (int index = 0; index < 90; index++) {
				Button button = new Button ();
				int numero = index + 1;
				button.Label = numero.ToString ();
				Unit row = index / 10;
				Unit column = (Unit)index % 10;
				table.Attach (button, column, column + 1, row, row + 1);
				buttons.Add (button);
			}
			table.Visible = true;
		}
		public void MarcarNumero(int numero);{
			Buttons[numero -1].ModifyBg(StateType.Normal, COLOR_GREEN);

	}
		public Table Table {
			get { return table;
			}
}

}
