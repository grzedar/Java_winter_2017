package pl.waw.sgh;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Witam!!!");

        int a = 5;
        Integer aa = 10;

        Double d;
        d = 5d;

        d = d + a + aa;
        // a = d +a ;  nie zadziała
        System.out.println("d=" + d);

        String s1 = "abc";
        String s2 = "ala";

        String s3 = s1.concat(s2);

        System.out.println(s3);

        // typ logiczny

        boolean b = false;
        boolean c = true;
        // and &&, or ||, xor ^ (dwa argumenty muszą być rozne od siebie aby dać true)

        // BLOK - wenaterz bloku zmienna zdefiniowana w bloku, nalezy tylko do tego bloku (lokalna), poza blokiem jej
        // "nie ma"
        int j = 6;
        {
            int i = 8;
            System.out.println(i);
            System.out.println(j);
        }
        // System.out.println(i);
        // System.out.println(j);
        boolean r = false;
        if (r){
            System.out.println("r jest prawdą");
        } else
            System.out.println("r jest fałszem");

        String s = "AB";
        switch (s) {
            case "AC":
                System.out.println("AC");
                break;
            case "EF":
                System.out.println("EF");
                break;
            default:
                System.out.println("def");
        }



        int jj = 5;
        // warunek ? prawda ? falsz
        int ii = jj>4 ? 10 : 20;
        System.out.println(ii);
///////////////////////
        String ss1 = "abc";
       String ss2 = "abc";
        // String ss2 = new String("abc");
        /// uwaga na te ify bo tak naprawde sa różne wartosci ss1, ss2 a ss3 ( ale nie umiem zrobic ss3)
        if (ss1 == ss2){
            System.out.println("ss1 taki jak ss2");
        }else {
            System.out.println("ss1 różne od ss2");
        }

        if (ss1.equals(ss2)){
            System.out.println("ss1 taki jak ss2");
        } else    {
        System.out.println("ss1 różne od ss2");
    }

//////////////
        String ss = "abcdefgha";

        System.out.println(ss.length());
        System.out.println(ss.charAt(2));
        System.out.println(ss.indexOf("f"));
        System.out.println(ss.indexOf(a));

        //System.out.println(ss.substring( 2, ));  // sprawdz konstrukcje substringa











    }

}


