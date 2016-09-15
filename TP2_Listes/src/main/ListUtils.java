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
		ListIterator<Integer> itr = l.listIterator();
		String s="";
		while(itr.hasPrevious()){
			Integer tmp = itr.previous();
			s+=tmp+"->";
		}
		System.out.println(s);
		
	}

	public Object somme(List<Integer> l) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object moyenne(List<Integer> l) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object positions(List<Integer> l, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object min(List<Integer> l) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object max(List<Integer> l) {
		// TODO Auto-generated method stub
		return null;
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