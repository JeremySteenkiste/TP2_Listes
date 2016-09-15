package main;
import java.util.*;

public class ListUtils {
	public List<Integer> genereRdmIntList(){
		List<Integer> liste = new ArrayList<Integer>();
		
		Random r = new Random();
		int n = r.nextInt(30);
		
		for(int i=0;i<n;i++){
			liste.add(r.nextInt(100));
		}
		return liste;
	}
}
