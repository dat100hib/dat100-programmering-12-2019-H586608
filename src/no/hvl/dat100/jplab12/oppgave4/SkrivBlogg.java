package no.hvl.dat100.jplab12.oppgave4;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

import no.hvl.dat100.jplab12.oppgave3.*;
import no.hvl.dat100.jplab12.common.TODO;

public class SkrivBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";

	public static boolean skriv(Blogg samling, String filnavn) {

		boolean funnet = false;

		do {
			try {

				//filnavn = JOptionPane.showInputDialog("Filnavn i mappen " + MAPPE);
				
				filnavn = "blogg.dat";

				File file = new File(MAPPE + filnavn);
				Scanner reader = new Scanner(file);

				int linenumber = 1;

				while (reader.hasNextLine()) {
					String line = reader.nextLine();
					System.out.println(linenumber + " " + line);

				}

				reader.close();

				funnet = true;

			}

			catch (FileNotFoundException e) {

				JOptionPane.showMessageDialog(null, "Feil); Input er ikke en fil");

			}
		} while (!funnet);
		return funnet;

	}
}
