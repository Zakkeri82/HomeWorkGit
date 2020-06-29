package Test;

import java.util.ArrayList;
import java.util.List;

public class Bugfix {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(getMet());
        }
        //Комент
        int billionare =0;
        int regular = 0;
        int defaults = 0;
        for(Integer persons : list) {
            persons += getMet();
            if(persons > 1_000_000_000 || persons < 0) {
                billionare++;
            }
            else if(persons > 0) {
                regular++;
            }
        }
        System.out.println("billionare = " + billionare);
        System.out.println("regular = " + regular);
        System.out.println("defaults = " + defaults);
        System.out.println("defaults + billionare + regular = " + (defaults + billionare + regular));
    }

    private static int getMet() {
        return (int) (Math.random() * Integer.MAX_VALUE);
    }
}
