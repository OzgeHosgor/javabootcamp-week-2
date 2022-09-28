public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 6;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		
		String mesaj ="";
		if(varMi) {
			mesaj ="Sayı mevcuttur:" +aranacak;
			mesajVer(mesaj);
		} else {
				mesajVer("Sayı mevcut değildir:" +aranacak);
			}
		}
	
	
	// parametreli method:fonsiyonu çalıştıracağın mesajı int olarak
	// belirt.Belirtmezsen fonksiyon "aranaca" ifadesini bulamaz.
	//	public static void mesajVer(boş olursa yukarıdaki komutu alamaz)

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
