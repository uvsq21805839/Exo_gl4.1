package uvsq.Exo_gl4;




public final class Personnel implements Annu{

	 
	private final String  nom;
	public String getNom(){return nom;}
	
	private final String prenom;
	 public String getPrenom() {
	        return prenom;   }
		
	private final java.time.LocalDate dateNaissance;
	 public java.time.LocalDate getDateNaissance() {
	        return dateNaissance;
	    }
	    
	private final String numTelephone;
//	@SuppressWarnings("unchecked")
	public String getNumTelephone() {
        return  numTelephone;
    }

	private final String  fonction;
	public String getFonction() {
		return fonction;
	}

	public static class Builder {
		private final String  nom;
		private final String prenom;
		private final java.time.LocalDate dateNaissance;
		private String numTelephone;
		private final String fonction;
		
		public Builder(final String nom, final String prenom, final java.time.LocalDate dateNaissance,final String numTelephone,final String fonction) {
			this.nom = nom;
			this.prenom = prenom; 
			this.dateNaissance = dateNaissance;
			this.numTelephone = numTelephone;
		    this.fonction = fonction;
	
		}
		
		public Personnel build() {
			return new Personnel(this);
		}
	}
	
	private Personnel(final Builder builder) {
		nom = builder.nom;
		prenom = builder.prenom;
		dateNaissance = builder.dateNaissance;
		numTelephone = builder.numTelephone;
		fonction = builder.fonction;

	}
	public void print() {
		
		System.out.print(prenom + " " + nom	+" , naissance : " + dateNaissance + ", Numero de Telephone : " +  numTelephone + ", fonction : " +  fonction );
	
		
		
	}
	public void printAnnuaireName() {
		// TODO Auto-generated method stub
		
	}
	
}

