/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/**
 *
 * @author 
 * NAMA  : Naufal Asha
 * KELAS : IF-2
 * NIM   : 10118063
 */
public class WaktuSaatIni {

    /**
     * @param args
     */
      public static void main(String[] args){
         SimpleDateFormat df = new SimpleDateFormat("EEEE, dd MMMM"
                 + " YYYY HH:mm:ss");
         System.out.println(df.format(new Date()));
      
    }
}
