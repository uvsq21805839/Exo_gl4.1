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
	  

	public static class Builder {
		private final String  nom;
		private final String prenom;
		private final java.time.LocalDate dateNaissance;
		private String numTelephone;
		
		
		public Builder(final String nom, final String prenom, final java.time.LocalDate dateNaissance,final String numTelephone) {
			this.nom = nom;
			this.prenom = prenom; 
			this.dateNaissance = dateNaissance;
			this.numTelephone = numTelephone;
		
	
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
		
	 
	}
	public void print() {
		
		System.out.print(prenom + " " + nom	+" , naissance : " + dateNaissance + ", Numero de Telephone : " +  numTelephone );
	
		
		
	}
	public void printAnnuaireName() {
		// TODO Auto-generated method stub
		
	}
	
}

