import java.lang.reflect.Array;

public class SimpleAgenda {

    static String[] listName = new String[2]; // Store the names
    static int index=0;
    static int c=0;
    String name;

    public static void main(String[] args) {

        int option=0;

        do {

            // Show Menu
            System.out.println("1.Show records");
            System.out.println("2.Add a person");
            System.out.println("3.Delete a record");
            System.out.println("4.Modify a record");



            //selectare optiune
            option=SkeletonJava.readIntConsole("Option:");

            switch (option) {
                case 1: print(listName);break;
                case 2: add(listName);break;
                case 3: del(listName); break;
                case 4: modify(listName);
                case 5: exit();
            }


        }
        while(option!=5);

    }

    static void print(String[] L) {
        for(int i=0; i<L.length; i++) {
            System.out.println(L[i]);
        }

    }

    static void add(String [] L) {

        if (index < L.length) {
            String name = SkeletonJava.readStringConsole("Input the name: ");
            L[index] = name;
            index++;
            System.out.println("Ati introdus " + "'" + name + "'" + " Mai aveti " + (L.length - index) + " pozitii libere");
           ;
        }
        else

            System.out.println("Memory is full");

        }







    static void del(String [] L) {

        for (int i = 0; i < L.length; i++) {
            if (L[i] == null)
                System.out.println("Position " + i + " empty");

        }

        String namedel = SkeletonJava.readStringConsole("Input a name ");
        boolean verif = false;
        for (int i = 0; i < L.length; i++) {
            if (L[i] != null && L[i].equals(namedel)) {
                L[i] = null;
                index = i;
            }
            else

                verif = true;
        }
        if (verif == true) System.out.println(namedel + " not recorded");



    }
    static void modify(String[] L) {

        String namemod = SkeletonJava.readStringConsole("Input a name you want to modify ");
        for (int i = 0; i < L.length; i++) {
            if (L[i].equals(namemod)) {
                String newname = SkeletonJava.readStringConsole("Input the new name: ");
                L[i] = newname;
            }
            else break;
        }

    }


    static void exit() {}


}
