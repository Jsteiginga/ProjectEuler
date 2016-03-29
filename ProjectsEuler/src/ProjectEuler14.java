/**
 * Created by justin on 29-3-16.
 */
public class ProjectEuler14 {
    public static void main(String args[]){
        int getal = 13;
        int teller = 0;
        do {
            System.out.print(getal + "-> ");
            if (getal % 2 ==0){
                getal = getal/2;
            } else  {
                getal = 3*getal+1;
            }teller++;
        }while (getal!=1);
        System.out.println(getal);
        System.out.println("Aantal :" + (teller+1));
        }

}
