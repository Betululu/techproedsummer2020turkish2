package day9practice;

public class Ogrenci {
   
	private String isim;
	private int ogrenciNo;
	
	public Ogrenci() {
		
	}
	
	
	public String toString() {
		return"Ogrenci isim="+isim+"\nogrenciNo="+ogrenciNo;
	}


	public String getIsim() {
		return isim;
	}


	public void setIsim(String isim) {
		this.isim = isim;
	}


	public int getOgrenciNo() {
		return ogrenciNo;
	}


	public void setOgrenciNo(int ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}
	
	
	
	
	
}
