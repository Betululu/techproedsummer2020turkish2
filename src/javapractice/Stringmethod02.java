package javapractice;

public class Stringmethod02 {

	public static void main(String[] args) {
		// name1 ve name2 seklinde 2 string tanimlayalim
		//name1 karekteri cift ise name1 ii name2 nin ortasina yazsin
		//tek ise eklenmiyor desin
		
		
		
		String name1 ="MEHMET";
		String name2 ="ahmet";
		boolean namecift=name1.length()%2==0;
		String ilkkisim=name1.substring(0,name1.length()/2);
        String ikincikisim=name1.substring(name1.length()/2);
        if(namecift) {
        	System.out.println(ilkkisim+name2+ikincikisim);
        }else{
        	System.out.println("name1  karakter sayisi tektir");
        }
	}

}
