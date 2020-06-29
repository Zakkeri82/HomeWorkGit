package Test;

import java.util.ArrayList;
import java.util.List;

public class Bugfix {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add((int)(Math.random() * Integer.MAX_VALUE));
        }
        int billionare =0;
        int regular = 0;
        int defaults = 0;
        for(Integer persons : list) {
            persons += (int)(Math.random() * Integer.MAX_VALUE);
            if(persons > 1_000_000_000) {
                billionare++;
            }
            else if(persons > 0) {
                regular++;
            }
            else if(persons < 0) {
                defaults++;
            }
        }
        System.out.println("billionare = " + billionare);
        System.out.println("regular = " + regular);
        System.out.println("defaults = " + defaults);
        System.out.println("defaults + billionare + regular = " + (defaults + billionare + regular));
    }
}
