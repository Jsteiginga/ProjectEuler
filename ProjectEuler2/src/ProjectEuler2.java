/**
 * 1  +  2   =  3
 * ^    ^
 * e +  t    =   3
 *
 * 2  +  3     = 5
 * t
 */
public class ProjectEuler2 {
    static int max=6000000;

    public static void main(String args[]){
        int a=0;
        int b=1;
        int som=0;
        int antwoord = 0;
        for (int i=1;som<=max;i++) {
            System.out.println(a+b);
            som=a+b;
            a=b;
            b=som;
            if ((som%2 ==0)) {
                antwoord += som;

            }
        }
            System.out.print("Antwoord " + antwoord);
    }
}
