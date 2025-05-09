package Problem11;

import java.util.ArrayList;

public class HospitalFinder {
    public static void main(String[] args) {
    	HospitalService hs=new HospitalService();
    	ArrayList<String> treatmentListOfH1=new ArrayList<String>();
    	treatmentListOfH1.add("khujli bhagana");
    	treatmentListOfH1.add("pet ka ilaj");
    	treatmentListOfH1.add("haddiyo ka ilaj");
    	treatmentListOfH1.add("fever care");
    	ArrayList<String> treatmentListOfH2=new ArrayList<String>();
    	treatmentListOfH2.add("kan ka ilaj");
    	treatmentListOfH2.add("dil ka ilaj");
    	treatmentListOfH2.add("lever infection");
    	treatmentListOfH2.add("eye donation");
    	hs.addHospital("rajendra hospital", treatmentListOfH1, "rajendra yadav", "4554656","jabalpur");
    	hs.addHospital("aashsish ka hospital", treatmentListOfH2, "Aashish prajapati", "3445645756","gaziabad");
    	hs.getHospitalDetails(100);
    	hs.getHospitalDetails(101);
    	hs.getHospitals();
    	
       
    }
}