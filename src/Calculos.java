import java.util.*;
public class Calculos {
    static void prt(String s) {
           System.out.println(s);
    }

    static void pInt(String s, int i ) {
           prt(s + " = " + i);
    }

    static void pFlt(String s, float f ) {
           prt(s + " = " + f);
    }


	public static void main(String args[]) {
        Random rand = new Random();

        int i, j, k;
        j = rand.nextInt() % 100;
        k = rand.nextInt() % 100;
        pInt("j",j);pInt("k",k);
        i = j + k; pInt("j + k ",i);
        i = j - k; pInt("j - k ",i);
        i = k / j; pInt("k / j ",i);
        i = k * j; pInt("k * j ",i);
        i = k % j; pInt("k % j ",i);

        float u, v, w;
        v = rand.nextInt() % 100;
        w = rand.nextInt() % 100;
        pFlt("v",v);pFlt("w",w);
        u = v + w; pFlt("v + w ",u);
        u = v - w; pFlt("v - w ",u);
        u = v / w; pFlt("v / w ",u);
        u = v * w; pFlt("v * w ",u);

        u += v; pFlt("u += v",u);
        u -= v; pFlt("u -= v",u);
        u *= v; pFlt("u *= v",u);
        u /= v; pFlt("u /= v",u);

        }
}
