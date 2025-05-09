package Problem8;

public record Product(Integer pid,String pname) {
        public  Product {
        	if(pid==0) {
        		try {
        			throw new IllegalArgumentException();
        		}
        		catch(IllegalArgumentException j){
        			j.printStackTrace();
        		}
        	}
        }
}
