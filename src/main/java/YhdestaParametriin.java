
import java.util.Scanner;

public class YhdestaParametriin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        tulostaLukuunAsti(7);
    }

    public static void tulostaLukuunAsti(int annettuLuku) {
        int lkm = 0;
        int alku = 1;
        int loppu = annettuLuku;
        while (lkm < loppu) {
            System.out.println(alku + lkm);
            lkm++;
        }
    }
}
