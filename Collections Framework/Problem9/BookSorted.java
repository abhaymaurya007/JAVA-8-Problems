package Problem9;

import java.util.TreeSet;

public class BookSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeSet<Book> blist=new TreeSet<Book>((p1,p2)->p1.name().compareTo(p2.name()));
        blist.add(new Book("java", "aashsih"));
        blist.add(new Book("c Sharp", "prayush"));
        blist.add(new Book("html", "rajendra"));
        blist.add(new Book("react", "abhay"));
        blist.add(new Book("advance java", "avaneesh"));
        blist.forEach(System.out::println);
		
		
	}

}
