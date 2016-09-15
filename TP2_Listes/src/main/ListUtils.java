package main;
import java.util.*;

public class ListUtils{
	public List<Integer> genereRdmIntList(){
		List<Integer> liste = new ArrayList<Integer>();

		Random r = new Random();
		int n = r.nextInt(30);

		for(int i=0;i<n;i++){
			liste.add(r.nextInt(100));
		}
		return liste;
	}

	public void affiche(List<Integer> list){
		ListIterator<Integer> itr = list.listIterator();
		String s="";
		while(itr.hasNext()){
			s+=itr.next();
			if(itr.hasNext()){
				s+=" -> ";
			}
		}
		System.out.println(s);
	}

	public void afficheInverse(List<Integer> l) {
		// TODO Auto-generated method stub
		
	}
	/*public void afficheInverse(List<Integer> l) {
		ListIterator<Integer> itr = l.listIterator();
		while(itr.hasPrevious()){
			System.out.print(itr.previous());
		}
	}*/

	public int somme(List<Integer> l) {
		ListIterator<Integer> itr = l.listIterator();
		int somme = 0;
		while (itr.hasNext()) {
			somme += itr.next();
		}
		return somme;
	}

	public int moyenne(List<Integer> l) {
		return somme(l)/l.size();
		
	}

	public Object positions(List<Integer> l, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object min(List<Integer> l) {
		ListIterator<Integer> itr = l.listIterator();
		int min = l.get(0);
		while(itr.hasNext()){
			if(itr.next()<min){
				min = itr.next();
			}
		}
		return min;
	}

	public int max(List<Integer> l) {
		ListIterator<Integer> itr = l.listIterator();
		int max = l.get(0);
		while(itr.hasNext()){
			if(itr.next()>max){
				max = itr.next();
			}
		}
		return max;
	}

	public boolean estTrie(List<Integer> l) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object trie(List<Integer> l) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Integer> paire(List<Integer> l) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}