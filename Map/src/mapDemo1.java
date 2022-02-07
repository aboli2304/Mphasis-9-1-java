import java.util.*;

public class mapDemo1 {

	public static void main(String[] args) {
				
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Aarohi");    
	      hm.put(2,"Akshata");    
	      hm.put(3,"Apeksha");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	    
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Asha");  
	      ht.put(5,"Usha");  
	      ht.put(6,"Lata");  
	      ht.put(7,"Sita");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	     
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Supriya");    
	      map.put(9,"Geeta");    
	      map.put(10,"Seeta");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}




