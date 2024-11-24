package patterns;

public class pattern1 {
    public static void main(String[] args) {
        int x = 1;
        int y = 5;

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            x++;
            System.out.println();
        }
    }

}


/*
Expected pattern
*
**
***
****
*****

*/
