package nestedLoop;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i=0; i<=5; i++)
            System.out.print("+ "+ i) ;
        for (int j=10; j<=12; j++){
            System.out.print(" " + "+"+j);
        }
        System.out.println();
    }
}
