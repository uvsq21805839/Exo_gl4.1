package uvsq.Exo_gl4;

import java.time.LocalDate;



public final class Main {
	
	private Main() {
	}
	 
    public static void main(final String[] args) {
    	PersonnelCompsitePattern c1 = new PersonnelCompsitePattern();
    	PersonnelCompsitePattern c2 = new PersonnelCompsitePattern();
    	PersonnelCompsitePattern c3 = new PersonnelCompsitePattern();
    	PersonnelCompsitePattern c4 = new PersonnelCompsitePattern();
    	PersonnelCompsitePattern c5 = new PersonnelCompsitePattern();
    	PersonnelCompsitePattern c6 = new PersonnelCompsitePattern();
    	PersonnelCompsitePattern c7 = new PersonnelCompsitePattern();
    	
   	 @SuppressWarnings("unused")
		Personnel p = new Personnel.Builder("Sekou", "Diawara", LocalDate.of(1991, 9, 12),"07 51 07 80 00, " ).build();
   	 @SuppressWarnings("unused")
		Personnel p1 = new Personnel.Builder("Mamby", "Diawara", LocalDate.of(1989, 11, 14),"09 51 07 80 00, " ).build();
     c2.add(p1);   
   	 c7.add(p);
        c4.add(c6);
        c4.add(c7); 
        c3.add(c4);
        c3.add(c5);
        c1.add(c2); 
        c1.add(c3);
        System.out.println("Parcours en largeur : ");
        AffichageIterator apg = new AffichageIterator();
        apg.parcoursLargeur(c1);
        apg.print();
        System.out.println("\n\nParcours en profondeur : ");
        c1.print();
    }
}
