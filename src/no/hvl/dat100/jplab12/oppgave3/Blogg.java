package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;
import no.hvl.dat100.jplab12.oppgave2.Tekst;
import no.hvl.dat100.jplab12.oppgave2.Bilde;

public class Blogg {

	private Innlegg[] tabell;
	private int antall;

	public Blogg() {
		tabell = new Innlegg[20];
		this.antall = 0;
		
	}

	public Blogg(int lengde) {
		tabell = new Innlegg [lengde];
		this.antall= 0;
		
	}

	public int getAntall() {
		return antall;
	}
	
	public Innlegg[] getSamling() {
		return tabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {

		int pos = -1;
		//boolean funnet = false;
		
		for (int i = 0; i <antall && pos ==-1; i++) {
			if (tabell[i] != null && innlegg.erLik(tabell[i])) {
				
				pos = i;
			}
		}
		return pos;
		
	}

	public boolean finnes(Innlegg innlegg) {
		
		boolean finnes = false;
		
		for (int i = 0; i < antall; i++) {
			if (tabell[i] != null && innlegg.getId() == tabell[i].getId()) {
				finnes = true;
				
			}
		}
		return finnes; 
		
	}
		
	

	public boolean ledigPlass() {
		return (antall < tabell.length);
	}
	
	public boolean leggTil(Innlegg innlegg) {
				if (!finnes(innlegg) && ledigPlass()) {
			tabell [antall] = innlegg;
			antall++;
			return true;
		}
		
		else return false;

	}
	
	public String toString() {
		String str = antall + "\n";
		for (int i = 0; i < antall; i++) {
		if (tabell[i] instanceof Bilde) {
			Bilde bildeObj = (Bilde) tabell[i];
			str += bildeObj.toString();
		} else {
			Tekst tekstObj = (Tekst) tabell[i];
			str += tekstObj.toString();
			
		}
		}
		return str;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}