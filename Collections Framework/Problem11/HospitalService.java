package Problem11;

import java.util.ArrayList;

import java.util.List;


public class HospitalService {
    private List<Hospital> hospitals = new ArrayList<>();

    public HospitalService() {
		super();
	}

	public int addHospital(String hospitalName, List<String> listOfTreatments, String contactPerson, String contactNumber, String location) {
        Hospital hospital = new Hospital(hospitalName, listOfTreatments, contactPerson, contactNumber, location);
        hospitals.add(hospital);
        return hospital.getHospitalCode();
    }

    public void getHospitals() {
        for(Hospital h:hospitals) {
        	System.out.println(h);
        }
    }

    public void getHospitalDetails(int hospitalCode) {
        for (Hospital h : hospitals) {
            if (h.getHospitalCode() == hospitalCode) {
                System.out.println(h);
            }
         
        }
       
    }
}