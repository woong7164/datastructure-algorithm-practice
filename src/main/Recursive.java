package main;
import java.util.*;

public class recursive {
	 static String perm[];
	    static String numarr[];
	    static int sortedarr[];
	    static boolean visited[];
	    static int position = 0;
	    static int count = 0;
	    static ArrayList<Integer> list = new ArrayList<>();
	    
	    public String solution(String number, int k) {
	        String answer = "";
	        visited = new boolean[k+10];
	        perm = new String[number.length()];
	        numarr = new String[number.length()];
	        
	        for(int i=0; i<number.length(); i++){
	            numarr[i] = number.charAt(i)+"";
	            //System.out.print(numarr[i]+" ");
	        }
	        
	        getPerm(0,number.length()-k);
	        sortedarr = new int[list.size()];
	        for(int i=0;i<list.size();i++){
	            sortedarr[i] = list.get(i);
	            System.out.print(sortedarr[i]+" ");
	        }
	        
	        Arrays.sort(sortedarr);
	        for(int i=0;i<list.size();i++){
	            System.out.print(sortedarr[i]+" ");
	        }
	        return Integer.toString(sortedarr[sortedarr.length-1]);
	    }
	    
	    public static void getPerm(int count,int k){
	        if(count>=k){
	            //System.out.println(" simulation ");
	            simulation(k);
	            return;
	        }
	        
	        for(int i=position;i<perm.length;i++){
	            if(visited[i]){
	                continue;
	            }
	            
	            visited[i] = true;
	            perm[count] = numarr[i];
	            position = i;
	            getPerm(count+1, k);
	            visited[i] = false;
	        }
	    }
	    
	    public static void simulation(int k){
	        String sum = "";
	        for(int i=0; i<k; i++){
	            System.out.print(perm[i]+" ");
	            sum+=perm[i];
	        }
	        //System.out.println(" sum "+sum);
	        list.add(Integer.parseInt(sum));
	       // System.out.println(" list "+list);
	        
	        System.out.println("--------------------------------------");
	    }
}