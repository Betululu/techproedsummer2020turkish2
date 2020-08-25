package day25encapsulation;

public class En01 {
	/*
	 * encaptilion data saklamak*(hiding)
	 * encaptulation yapmak icin varableleri private yapariz
	 */
    private int sifre = 1234;
    private String isim="Ali";
    private char ch ='A';
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int getSifre(){
    	return sifre;
    }
    public String getIsim(){
    	return isim;
    }
    public char getCh(){
    	return ch;
    }
    public void setSifre(int sifre) {
    	this.sifre=sifre;
    }
    public void setCh(char ch) {
    	this.ch=ch;
    }
    public void setIsim(String isim) {
    	this.isim=isim;
    	
    }
}
