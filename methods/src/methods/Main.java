package methods;

public class Main {
	public static void main(String[] args) {
		String mesaj ="Bugün hava çokzel.";	
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = eksilt(10,29);
		System.out.println(sayi);
		int toplam = topla(2,3,4,5,6,7);
		System.out.println(toplam);
		
		}
	public static void ekle() {
		System.out.println("Eklendi");
	}
	public static void sil() {
		System.out.println("Silindi");
	}
	public static void guncelle() {
		System.out.println("Güncellendi");
	}
	
	public static int eksilt(int sayi1,int sayi2) {
		return sayi1 - sayi2;
	}
	
	public static int topla(int... sayilar) {
		int toplam =0;
		for (int sayi:sayilar) {
			toplam=toplam+sayi;
		}
		return toplam;
		
		
	}
	
	public static String sehirVer() {
		return "Ankara";
	}
	
	

}
