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
        boolean duplicat = false;
        String name = null;

        if (index < L.length) {
            name = SkeletonJava.readStringConsole("Input the name: ");
            L[index] = name;
            index++;
            System.out.println("You entered" + "'" + name + "'" + (L.length - index) + " empty spots left");
        } else
            System.out.println("Memory is full");
    }
    static void FindDuplicates(){
        for (int i=0; i<listName.length; i++) {
            if (listName[i].equals())
        }
    }


    static void del(String [] L) {
        String namedel = SkeletonJava.readStringConsole("Input a name ");
        int pozitie=-1;
        pozitie=search(namedel);
        if (pozitie!=-1) {
            L[pozitie] = null;
            index = pozitie;
        }
        else System.out.println("Record " + namedel + " not recorded");
    }

    static int search(String name) {
        for (int i=0; i<listName.length; i++) {
            if(name.equals(listName[i]))
                return i;
        }
        return -1;
    }



    static void modify(String[] L) {

        String namemod = SkeletonJava.readStringConsole("Input a name you want to modify ");
        for (int i = 0; i < L.length; i++) {
            if (L[i].equals(namemod)) {
                String newname = SkeletonJava.readStringConsole("Input the new name: ");
                L[i] = newname;
            }
            else System.out.println(namemod+" not registered");
        }

    }


    static void exit() {}


}
