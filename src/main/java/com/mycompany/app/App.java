package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       List<Kisi> kisiList = new ArrayList<>();
       RehberIslemleri rehberIs = new RehberIslemleri(kisiList);
       int programiCalistir = 1;
       
       while(programiCalistir == 1) {
    	   Scanner input = new Scanner(System.in);
           System.out.println("-----ne yapmak istediğinizi seçiniz----- \n'1 kişi ekle', \n"
           		+ "'2 tüm rehberi listele',\n"
           		+ "'3 kişi sil', \n"
           		+ "'4 Rehber Arama',\n"
           		+ "'5 Çıkış' \n");
    	   int request = input.nextInt();
    	   input.nextLine();
    	   if(request == 1) {
    		   int veriAlmaDurumu = 1;
    		   while(veriAlmaDurumu == 1) {
    			  
    			   System.out.print("Lütfen Kişinin adını giriniz: ");
                   String adi = input.nextLine();
                   
                   System.out.print("Lütfen Kişinin soyadını giriniz: ");
                   String soyadi = input.nextLine();
                   
    			   System.out.print("Lütfen Kişinin tel'ini giriniz: ");
                   long tel = input.nextLong();
    			   
                   
                   Kisi kisi1 = new Kisi(adi,soyadi,tel);  
                   rehberIs.rehbereEkle(kisi1);
             
                   System.out.println("Başka kişi eklemek istiyorsanız 1'e, istemiyorsanız 0'a basınız... ");
                   veriAlmaDurumu=input.nextInt();
        		   input.nextLine(); 
    		   }
    		   
    	   }
    	   else if (request == 2) {
    		   rehberIs.tumRehberListele();
			   
		   }
    	   else if (request == 3) {
    		   rehberIs.tumRehberListele();
    		   System.out.print("Lütfen Kişinin id'sini giriniz: ");
               int id = input.nextInt();
               rehberIs.rehberdenSil(id);
    	   }
    	   else if(request == 4) {
    		   System.out.print("Lütfen aramak istediğiniz başlangıç harflerini giriniz: ");
               String arama = input.nextLine();
    		   rehberIs.arama(arama);
    	   }
    	   else if (request == 5) {
    		    programiCalistir = 0;
    		    input.close();
    	   }
    	   
            
       }
       
      
      
       
       
       
       
       
    }
}
