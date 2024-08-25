package triangles;

public class triangles{
    public static void main(String[] args) {

        int i, j, k;

        for (i = 1; i <= 10; i++) {

            for (k = 1; k <= i; k++) {
                System.out.print("*");

            }
            System.out.print("\n");

        }

        System.out.print("\n\n");

        for (i = 10; i >= 1; i--) {

            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.print("\n");

        }

        System.out.print("\n\n");

        for (i = 10, j = 1; i >= 1; i--, j++) {
            for (k = 1; k < i; k++) {
                System.out.print(" ");
            }

            for (k = 1; k <= j; k++) {
                System.out.print("*");
            }

            System.out.print("\n");

        }

        System.out.print("\n\n");

        for (i = 10, j = 0; i >= 1; i--, j++) {

            for (k = 1; k <= j; k++) {
                System.out.print(" ");
            }

            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.print("\n");

        }

    }
}
