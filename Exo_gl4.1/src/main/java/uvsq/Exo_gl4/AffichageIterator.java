
package uvsq.Exo_gl4;

import java.util.ArrayDeque;
import java.util.Iterator;


public class AffichageIterator implements Iterable<Annu> {
	
	private ArrayDeque<Annu> c
	= new ArrayDeque<Annu>();
	
	public void parcoursLargeur(final Annu ip) {
		if (ip.getClass() == PersonnelCompsitePattern.class) {
			Annu y, z;
			PersonnelCompsitePattern tmp;
			c = new ArrayDeque<Annu>();
			ArrayDeque<Annu> d =
				new ArrayDeque<Annu>();
			d.add(ip);
			while (!d.isEmpty()) {
				y = d.pollFirst();
				c.add(y);
				if (y.getClass() == PersonnelCompsitePattern.class) {
					tmp = (PersonnelCompsitePattern) y;
					Iterator<Annu> ite =
						tmp.iterator();
					while (ite.hasNext()) {
						z = ite.next();
						if (!d.contains(z) && !c.contains(z)) {
							d.add(z);
						}
					}
				}
			}
		}
	}
	
	public Iterator<Annu> iterator() {
		return c.iterator();
	}
	
	public void print() {
		PersonnelCompsitePattern tmp;
		
		for (Annu c2 : c) {
			if (c2.getClass() == PersonnelCompsitePattern.class) {
				tmp = (PersonnelCompsitePattern) c2;
				System.out.println(tmp.getId());
			} else {
				c2.print();
			}
		}
	}
}
