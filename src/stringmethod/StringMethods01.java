package stringmethod;

public class StringMethods01 {

	public static void main(String[] args) {
		
		String s = "Java ah Java!";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(6));
    // char At() metodunda var olmayan bir index kullanýrsanýz Run Týme Error mesajýný görürüz
		
		String t = "Ah hayat Ah";
		System.out.println(t.contains("yat"));
		System.out.println(t.contains("h"));
		
		String u = "Guzel Gunler" ;
		System.out.println(u.endsWith("x"));
		
		String v = "Hey gidi gunler";
		System.out.println(v.length());
		
		String y = "Maske takýnýz.";
		System.out.println(y.toUpperCase());
		
		String z = "Evde Kal";
		System.out.println(z.toLowerCase());
		
		String a = "Bir seyler oldu";
		System.out.println(a.replace("Bir", "Cok"));
		System.out.println(a.replace("oldu", "olmadý"));
		
		String b = "Java 1257 ?!@$_";
		System.out.println(b.replaceAll("\\d", "*"));
		System.out.println(b.replaceAll("\\D", "*"));
		System.out.println(b.replaceAll("\\w", "*"));
		
		
		
		
		
		
		
		
		
		
		
	}

}
