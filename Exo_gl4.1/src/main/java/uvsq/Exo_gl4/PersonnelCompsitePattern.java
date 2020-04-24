package uvsq.Exo_gl4;

iimport java.util.ArrayList;
import java.util.Iterator;

public class PersonnelCompsitePattern
implements Annu, Iterable<Annu> {
	
	private ArrayList<Annu> personnels;
	
	private final int id;
	
	private static int idNext = 1;
	
	public PersonnelCompsitePattern() {
		id = idNext++;
		personnels = new ArrayList<Annu>();
	}
	
	public void print() {
		System.out.println("Id : " + id);
		for (Annu ip : personnels) {
			ip.print();
		}
	}
		
	public PersonnelCompsitePattern add(final Annu ip) {
		if (!personnels.contains(ip)) {
			personnels.add(ip);
		}
		return this;
	}
	
	public PersonnelCompsitePattern remove(final Annu ip) {
		if (personnels.contains(ip)) {
			personnels.remove(ip);
		}
		return this;
	}
	
	public Iterator<Annu> iterator() {
		return personnels.iterator();
	}
	
	public final int getId() {
		return id;
	}
	public void printAnnuaireName() {
		// TODO Auto-generated method stub
		
	}
}
