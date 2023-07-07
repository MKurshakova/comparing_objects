package com.pjatk.objects;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Main {

     public static void main(String[] args){

         Person jan = new Person(1, "jan", LocalDate.of(1990,01,01));
         Person jan_kopia =jan.copy();

         Address adresJana = new Address(1, "Gdansk", "80-001");
         adresJana.getAddressLines().add("Brzegi 55");
         Address adresKopiiJana = new Address(1, "Gdynia", "80-002");
         adresKopiiJana.getAddressLines().add("Brzegi 55");

         jan.getAddresses().add(adresJana);
         jan_kopia.getAddresses().add(adresKopiiJana);


         if(jan.equals(jan_kopia)){
             System.out.println("metod equals does not work in a proper way");
             return;
         }
         adresJana.getAddressLines().add("dziekanat szkoly");
         System.out.println(jan);
     }
}
