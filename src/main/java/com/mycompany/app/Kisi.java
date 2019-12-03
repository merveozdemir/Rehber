package com.mycompany.app;

public class Kisi {
	private static int idCounter=0;
	String adi;
	String soyadi;
	long tel;
	int id;
	
	public Kisi(String ad, String soyad, long tel) {
		this.adi = ad;
		this.soyadi = soyad;
		this.tel = tel;
		idCounter++;
		this.id = idCounter;
	}

	public int getId() {
		return id;
	}
	

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
}
