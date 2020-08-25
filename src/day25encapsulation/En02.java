package day25encapsulation;

public class En02 {

	public static void main(String[] args) {
	  En01 obj =new En01();
	  System.out.println( obj.getSifre());
	  System.out.println( obj.getIsim());
	  System.out.println( obj.getCh());
	  
	  obj.setSifre(98765);
      System.out.println(obj.getSifre());
      
      obj.setCh('Z');
      System.out.println(obj.getCh());
      
      obj.setIsim("Veli");
      System.out.println(obj.getIsim());
      
      En03 ob = new En03();
     System.out.println(ob.getIsim());
      System.out.println(ob.getYas());
      
      ob.setBorc(2300.24f);
      ob.setYas((byte) 25);
      System.out.println(ob.getYas());
      
      
      
      
      
      
	}
	

}
