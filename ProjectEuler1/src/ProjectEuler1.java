/**
 * Created by justin on 16-2-16.
 */
public class ProjectEuler1 {
    public static void main(String args[])  {
        int som=0;
        for(int i=0; i<1000; i++) {
            if((i%3 == 0) || (i%5 == 0)){
                som += i;
            }
        }
        System.out.println(som);
    }
}