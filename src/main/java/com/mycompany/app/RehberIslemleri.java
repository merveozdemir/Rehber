package com.mycompany.app;

import java.util.List;

public class RehberIslemleri {
	List<Kisi> rehberListesi;
	
	public RehberIslemleri(List<Kisi> liste) {
		this.rehberListesi = liste;
	}

	void rehbereEkle(Kisi kullanici) {
		rehberListesi.add(kullanici);
		
	}
	
	void rehberdenSil(int id) {
		for (Kisi kisi : rehberListesi) {
			if(kisi.id == id) {
				rehberListesi.remove(kisi);
				System.out.println("***"+ kisi.adi+ " "+ kisi.soyadi + " Kişisi silindi");
				break;
			}
			
		}
		
	}
	
	void adaGorelistele(String ad){
	   for (Kisi kisi : rehberListesi) {
		 if(kisi.adi == ad) {
			 System.out.println(kisi.id +" "+ kisi.adi +" " + kisi.soyadi+ " " + kisi.tel);	 
			 
		 }
		 System.out.println();
	}
	      
	}
	
	 void tumRehberListele() {
		 for (Kisi kisi : rehberListesi) {
			 System.out.println(kisi.id +" "+ kisi.adi +" " + kisi.soyadi + " " + kisi.tel);	
			 

		 }
		 System.out.println();
		 
	 }
	 
	void arama(String baslangic) {
		for (Kisi kisi : rehberListesi) {
			if(kisi.adi.startsWith(baslangic)) {
				 System.out.println(kisi.id +" "+ kisi.adi +" " + kisi.soyadi + " " + kisi.tel);	
				
			}
			
		}
		
	}
}
