/**
 * Created by GypsyWizard on 31.07.2016.
 */
import java.io.*;
public class Test {
    public static void main(String[] args) throws IOException {
        File f = new File("1.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
        String line;
        int n = 0 ;
        while (( br.readLine()) != null) {
            n++;

        }
        int[][] a = new int[n][2];
        BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
        int l=0;
        int h=0;
        while (( line = br2.readLine()) != null) {
                    String[] st = line.split(" ");
                    a[h][l] = Integer.parseInt(st[l]);
                    a[h][l+1] = Integer.parseInt(st[l + 1]);
                    h++;
            }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
       }
        int j;
        for (int i = 0; i<n; i++)
        {
            j = i;
            while ( j < n) {
                if ((a[i][0] == a[j][1]) && (a[i][1] == a[j][0]))
                    System.out.println(a[i][0] + " " + a[i][1] + " " + a[j][1]);
                j++;
            }
        }
    }
}


