package task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws NumberFormatException {
        try {
            if (args.length > 1) {
                String sNum = args[0];
                int i = Integer.parseInt(sNum);
                String sNu = args[1];
                int q = Integer.parseInt(sNu);
                System.out.println("" + i + " " + Integer.toString(i, q));
            }
        }
        catch(NumberFormatException i){
            System.out.println("usage");
        }
    }
}

