package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Rabia";
		String ogrenci2 = "Mahmut";
		String ogrenci3 = "Nevin";
		String ogrenci4 = "Demet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("-------------------------");
		//bu kodun daha pratik hali için arrayler devreye girer.
		
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Rabia";
		ogrenciler[1]="Mahmut";
		ogrenciler[2]="Nevin";
		ogrenciler[3]="Demet";
		
		for(int i=0 ; i<ogrenciler.length;i++)
		{
			System.out.println(ogrenciler[i]);
		}
		System.out.println("-------------------------");
		//üstteki kodu asagıdaki gibi de yazabiliriz.
		for(String ogrenci: ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
