package Problem15;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class RetrieveObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       try {
    	   
		var fis=new FileInputStream("D:\\ARRAY\\student2.txt");
		var ois=new ObjectInputStream(fis);
		List<Student> l= new ArrayList<>((ArrayList)ois.readObject());
		System.out.println(l);
		
		
		
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
		
		
		
	}

}
