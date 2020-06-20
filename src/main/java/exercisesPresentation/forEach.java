package exercisesPresentation;

public class forEach {

        public static void ex1(String[] tableOfNames) {
        for (String name : tableOfNames) {
            System.out.println("Hello " + name);
        }
    }
        private static String ex2(String[] arrayOfThings){
             {
                String list = "";
                 for (String product: arrayOfThings) {
                     list+=product + ", ";
                 }
                 return list;
             }
    }

    public static void main(String[] args){
        String names [] ={"Ania", "Hania", "Marek", "Tadeusz", "Mirek"};
        String products[]= {"szynka", "masło", "ser", "jabłko"};
        ex1(names);
      String result = ex2(products);
        System.out.println(result);
        String pesel = "94010504672";

    }


    }


