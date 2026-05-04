package Test;

class Swiss{
	float getRateOfInterest() {
		return 0;
	}
}

class SBI extends Swiss{
	float getRateOfIntwerest() {
		return 7.0f;
	}
}

class Axis extends Swiss{
	float getRateOfIntwerest() {
		return 8.0f;
	}
}

class ICICI extends Swiss{
	float getRateOfIntwerest() {
		return 9.0f;
	}
}

public class DMD {

	public static void main(String[] args) {
		Swiss ob;
		
		ob = new SBI();
		System.out.println("SBI getRateOFInterest:"+ ob.getRateOfInterest());
		
		ob = new Axis();
		System.out.println("Axis getRateOFInterest:"+ ob.getRateOfInterest());
		
		ob = new ICICI();
		System.out.println("ICICI getRateOFInterest:"+ ob.getRateOfInterest());

	}

}
