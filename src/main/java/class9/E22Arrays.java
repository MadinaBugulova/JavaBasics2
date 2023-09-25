package class9;

import java.util.Arrays;

public class E22Arrays {

    public static void main(String[] args) {

        String [] [] names=

                {          {"Hind","Michael","Ismael", "Ahmed"},
                           {"John","Bob","Adam", "Tamim"},
                           {"Joke","Laugh","John Ahmed", "Mohammad"},
                           {"Gui","Backend","Front", "API"},

                };

        String  [] row =names [2];
        for(String name: row) {
            System.out.println(name);
        }
    }
}
