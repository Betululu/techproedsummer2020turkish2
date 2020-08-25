package day11stringmetodsforloop;

public class StringMetod01 {

	public static void main(String[] args) {
		String a = "Hadi gidelim ya";
		System.out.println(a.startsWith("H"));
		System.out.println(a.indexOf("i"));
        System.out.println(a.indexOf("a",9));
        String b = "Java ah Java";
        System.out.println(b.lastIndexOf("v"));
        System.out.println(b.lastIndexOf("av"));
        
        String c = "Karakartal";
        System.out.println(c.substring(4));
        System.out.println(c.substring(1));
        System.out.println(c.substring(4, 7));
        String d = "Java";
        System.out.println(d.trim());
        System.out.println(d.length());
        
	}

}
