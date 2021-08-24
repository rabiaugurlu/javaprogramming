package stringDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj="Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman sayısı: " + mesaj.length());
		System.out.println("5. eleman: " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler= new char[5];
		int srcBegin = 0;
		int srcEnd = 5;
		int dstBegin = 0;
		mesaj.getChars(srcBegin , srcEnd ,  karakterler, dstBegin );
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a'));
		
		String str;
		System.out.println(mesaj.lastIndexOf("e"));
		System.out.println("-------------------");
		
		char oldChar= ' ';
		char newChar= '-';
		String yeniMesaj = mesaj.replace(oldChar, newChar );
		System.out.println(yeniMesaj );
		System.out.println(mesaj.substring(2)); //(2,4)deseydik 2den basla 4e kadar parcala 4ü dahil etme.
		
		
		String regex= " ";
		for(String kelime: mesaj.split(regex)) {
			System.out.println(kelime);
		
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim()); //fazla boslukları siler.
		

	}

}
