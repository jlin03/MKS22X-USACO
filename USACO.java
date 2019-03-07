import java.util.*;
import java.io.*;

public class USACO {

  private static int[][] round = {{1,0},{1,1},{1,-1},{0,1},{0,-1},{-1,-1},{-1,0},{-1,1},{0,0}};
  private static int[][] pos = {{1,0},{-1,0},{0,1},{0,-1}};

   public static int bronze(String filename) {
     int[][] pasture;
     int e;
     int n;
     int volume = 0;
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
       data = new int[dataS.length];
       for(int i = 0; i < dataS.length; i++) {
         data[i] = Integer.parseInt(dataS[i]);
       }
       int r_s = data[0];
       int c_s = data[1];
       int d_s = data[2];
       for(int d = 0; d < d_s;d++) {
         ArrayList<Integer> blocks = new ArrayList<Integer>();
         for(int i = 0; i < 9;i++) {
           blocks.add(pasture[r_s + round[i][0]][c_s + round[i][1]]);
         }
         Collections.sort(blocks);
         for(int i = 0; i < 9;i++) {
           if(pasture[r_s + round[i][0]][c_s + round[i][1]] == blocks.get(8)) {
             pasture[r_s + round[i][0]][c_s + round[i][1]]--;
           }
         }
      }
      System.out.println(Arrays.deepToString(pasture));
     }

     for(int r = 0; r < pasture.length; r++) {
       for(int c = 0; c < pasture[r].length; c++) {
         if(pasture[r][c] < e) {
           pasture[r][c] = e - pasture[r][c];
           volume += pasture[r][c] * 72 * 72;
         }
       }
     }
     return volume;



    }
    catch(Exception x) {
      System.out.println(x);
    }

    return -1;

   }

	public static int silver(String filename) {
		int[][] pasture;
		try {
			File f = new File(filename);
			Scanner scan = new Scanner(f);
			String line = scan.nextLine();
			String[] dataS = line.split(" ");
			int[] data = new int[dataS.length];
			for(int i = 0; i < dataS.length; i++) {
				data[i] = Integer.parseInt(dataS[i]);
			}
			int rows = data[0];
			int cols = data[1];
			int moves = data[2];
			pasture = new int[rows][cols];
			
			
			
			
		}
		
	}





}
