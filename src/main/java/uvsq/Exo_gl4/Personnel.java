package uvsq.Exo_gl4;

import java.util.ArrayList;

public final class Personnel {
	private final String  nom;
	private final String prenom;
	private final java.time.LocalDate dateNaissance;
	private final ArrayList<Integer> numTelephone;

	public static class Builder {
		private final String  nom;
		private final String prenom;
		private final java.time.LocalDate dateNaissance;
		private ArrayList<Integer> numTelephone;
		
		public Builder(final String nom, final String prenom, final java.time.LocalDate dateNaissance) {
			this.nom = nom;
			this.prenom = prenom;
			this.dateNaissance = dateNaissance;
			
			numTelephone = new ArrayList<Integer>();
		}
		
		
	}
}
