package day9practice;

public class Ogretmen {

		
     private String isim,brans,telefon;
     
     public Ogretmen() {
    	 
     }
     
     
     public String toString() {
    	 return"Ogretmen isim="+isim+"/nbrans="+brans+"/ntelefon="+telefon;
    	 
     }
     public Ogretmen(String isim,String brans,String tel) {
    	 this.isim=isim;
    	 this.brans=brans;
    	 this.telefon=tel;
     }
     
     
     public String getIsim() {
    	 return isim;
	}
    public void setIsim(String isim) {
    	this.isim=isim;
		
	}


	public String getBrans() {
		return brans;
	}


	public void setBrans(String brans) {
		this.brans = brans;
	}


	public String getTelefon() {
		return telefon;
	}


	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
     
     
}
