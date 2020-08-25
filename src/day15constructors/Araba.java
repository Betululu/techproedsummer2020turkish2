package day15constructors;

public class Araba {
	
	int yýl =2019;
	String marka ="Toyota";
	String model ="Rav4";
	int fiyat = 20000;
	
	Araba(){
		
	}

	public static void main(String[] args) {
		
		Araba a1 = new Araba();
		System.out.println("Fiyat:" + a1.fiyat);
		System.out.println("Marka:"+ a1.marka);
        System.out.println("Model:"+a1.model);
        
	}
     public  void hizlanma() {
    	 System.out.println("7 sn yede 100 km ye ulasýr");
		
	}
     public void tuketim("km de 1 dolar yakar") {
    	 
		
	}
}


