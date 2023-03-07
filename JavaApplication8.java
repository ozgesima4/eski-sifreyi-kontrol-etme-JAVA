package javaapplication8;

import java.util.Scanner;

public class JavaApplication8 {

    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        String kAdi,sifre,yenisifre;
        int secim;
        System.out.println("kullanıcı adınız:");   kAdi=giris.nextLine();
        System.out.println("şifreniz:");   sifre=giris.nextLine();
        
        if(kAdi.equals("sima")){
            if(sifre.equals("sima4")){
                System.out.println("GİRİS BASARİLİ");
            }
            else{
                System.out.println("ŞİFRE YANLİS SIFIRLAMAK İSTER MİSİNİZ?");
                System.out.println("sifirlamak icin 1'e basin.");
                secim=giris.nextInt();
                if(secim==1){
                    System.out.println("yeni sifreyi yaziniz:");
                    yenisifre=giris.nextLine();
                
                    if(yenisifre.equals(sifre)){
                        System.out.println("eskı sıfreyle aynı olamaz!!");
                }
                    else if(yenisifre.equals("sima4")){
                        System.out.println("eskı sıfreden farklı olmalıdır..");
                    }
                }
                }
                
            }
        }
        
    }
    

