package org.example;

import java.util.Scanner;

public class SquareService{
    public static void makeSquare(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Input width and height");
            System.out.println("width height (eg: 9 11)");

            int width = scanner.nextInt();
            int height = scanner.nextInt();

            if(!isOdd(height) && !isOdd(width)){
                System.out.println("Both Height and Width must be odd number");
            }else if(!isOdd(height)){
                System.out.println("Height must be odd number");
            }else if(!isOdd(width)){
                System.out.println("Width must be odd number");
            } else{
                build(width, height);
                break;
            }
            System.out.println();
            System.out.println();
        }
    }

    public static boolean isOdd(int value){
        return value%2!=0;
    }
    public static void build(int width, int height){
        int median = (height+1)/2;

        for(int i = 0; i < height; i++){
            for(int j =0; j<width;j++){
                if(j == width-1 || j ==0 || i==median-1){
                    System.out.print("* ");
                }else{
                    System.out.print("= ");
                }
            }
            System.out.println();
        }
    }
}
