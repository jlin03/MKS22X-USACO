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
		char[][] pasture;
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
			pasture = new char[rows][cols];
			for(int r = 0; r < rows; r++) {
				line = scan.nextLine();
				for(int c = 0; c < cols; c++) {
					pasture[r][c] = line.charAt(c);
				}
			}
			line = scan.nextLine();
			dataS = line.split(" ");
			int[] coords = new int[4];
			for(int i = 0; i < dataS.length; i++) {
				coords[i] = Integer.parseInt(dataS[i]);
			}
			int[][] currentB = new int[rows][cols];
			int[][] nextB = new int[rows][cols];
			
			currentB[coords[0]][coords[1]] = 1;
			
			for(int i = 0; i < moves; i++) {
				for(int r = 0; r < rows; r++) {
					for(int c = 0; c < cols; c++) {
						if(pasture[r][c] != '*') {
							for(int m = 0; m < pos.length; m++) {
								nextB[r][c] += currentB[pos[m][0]][pos[m][1]];
							}
						}
					}
				}
				currentB = nextB;
				nextB = new int[rows][cols];
			}
			return currentB[coords[2]][coords[3]];
			
			
			
			
			
		}
		catch(Exception x) {
			System.out.println(x);
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		
		
	}





}
