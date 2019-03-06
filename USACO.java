import java.util.*;
import java.io.*;

public class USACO {

   public static void bronze(String filename) {
     int[][] pasture;
     int e;
     int n;
     try {
     File f = new File(filename);
     Scanner scan = new Scanner(f);
     String line = scan.nextLine();
     String[] dataS = line.split(" ");
     int[] data = new int[dataS.length];
     for(int i = 0; i < dataS.length; i++) {
       data[i] = Integer.parseInt(dataS[i]);
     }
     e = data[2];
     n = data[3];
     pasture = new int[data[0]][data[1]];
     for(int r = 0; r < pasture.length; r++) {
       line = scan.nextLine();
       dataS = line.split(" ");
       data = new int[dataS.length];
       for(int i = 0; i < dataS.length; i++) {
         data[i] = Integer.parseInt(dataS[i]);
       }
       for(int c = 0; c < pasture[r].length; c++) {
         pasture[r][c] = data[c];
       }
     }
     for(int m = 0; m < n; m++) {
       line = scan.nextLine();
       dataS = line.split(" ");
       int[] data = new int[dataS.length];
       for(int i = 0; i < dataS.length; i++) {
         data[i] = Integer.parseInt(dataS[i]);
       }
       int r_s = data[0];
       int c_s = data[1];
       int d_s = data[3];

     }



    }
    catch(Exception x) {
      System.out.println(x);
    }

   }

   public static void main(String[] args) {
     bronze(args[0]);

   }





}
