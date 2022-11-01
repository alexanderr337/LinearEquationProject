import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome!\nPlease input all coordinates in (x,y) format!\n");


        // -- INPUTTING COORDINATES --
        System.out.print("Enter coordinate 1: ");

        String coord1 = sc.nextLine();
        int comma = coord1.indexOf(",");

        // System.out.println(coord1.substring(1,comma));
        // System.out.println(coord1.substring(comma+1, coord1.length() - 1));

        int x1 = Integer.parseInt(coord1.substring(1,comma));
        int y1 = Integer.parseInt(coord1.substring(comma+1, coord1.length() - 1));

        System.out.print("Enter coordinate 2: ");

        String coord2 = sc.nextLine();
        comma = coord2.indexOf(",");

        int x2 = Integer.parseInt(coord2.substring(1,comma));
        int y2 = Integer.parseInt(coord2.substring(comma+1, coord2.length() - 1));


        // PRINTING INFORMATION

        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
        System.out.println("----- Line info -----");
        System.out.println(equation.lineInfo());
        System.out.println();

        System.out.print("Input a x value to receive the y value for this equation > ");
        double testX = sc.nextDouble();
        sc.nextLine();
        System.out.println("Coordinate for x = " + testX + ": " + equation.coordinateForX(testX));


    }
}