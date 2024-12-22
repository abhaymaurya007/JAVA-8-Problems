package prob1.abhay.predicate1;
import java.util.function.Predicate;
public class PredicateDemo1 {
     public static void main(String[] args) {
		Predicate< Integer>  num=(l)->
                               l%2==0;
			
		System.out.println("is "+45 +" is even :"+num.test(45));
		
		
		Predicate<Integer>  p1=(Integer l1)->{
			if(l1==1)
			{System.out.println("nor prime nor composite ");
			return false;
			}
			else {
	    	 int count =0;
	    	 for(int i=1;i<=l1;i++) {
	    		 if(l1%i==0)count++;
	    	 }
	    	 if(count==2)return true;
	    	 else return false;}
	     };
	     System.out.println("is "+45 +" is prime :"+p1.test(1));
	}
     
     
    
     
    
}
