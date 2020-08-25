package day26passbyvalueinheritanse;

public class PassByValue {
/*
 * java bir metoda bir variable ait deger yollarken o degerin
 * kopyasini olusturur ve kopyayi methodun icine yollar
 * method kendisine yollanan degeri degistirirken kopya degeri degistirmis
 *olur java bu sayede orjinal variableyi korumus olur 
 *
 * Pass By Reference da reference kopyalanip methoda yollanirama 
 * orjinal referencede kopya referensede aynisini objeyi gosterdiginden 
 * orjinal obje degismis olur java orjinal objenin degismesini istemediginden 
 * pass  by refeenceyi kullanmaz
 * primitivde de non primitivdede pass by value yi kullanir 
 */
	public static void main(String[] args) {
         int  gomlek = 100;
        System.out.println(indOgr(gomlek));
        System.out.println(gomlek);
        System.out.println(askInd(gomlek));
        
        String hazine="Altin";
        hazineCal(hazine);
        System.out.println(hazine);
        
	}
  public static int indOgr(int gomlek) {
	return gomlek-20;
}
  public static int askInd(int gomlek) {
	return gomlek-5;
}
  
  public static String hazineCal(String hazine) {
	  return hazine+"calindi";
  }
  
  
  
  
  
  
  
}
