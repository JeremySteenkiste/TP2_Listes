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

	public String toString(List<Integer> list){
		String s="";
		s+=list.get(0);
		for(int i=1;i<list.size();i++){
			s+=" -> " + list.get(i);
		}
		return s;
	}
	
	public void affiche(List<Integer> list){
		System.out.println(toString(list));
	}

	public void afficheInverse(List<Integer> l) {
		
		
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