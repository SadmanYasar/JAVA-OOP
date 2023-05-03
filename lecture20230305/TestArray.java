class TestArray {
    public static void main(String[] args) { 
        // example 1
        int[] numList = {1, 2, 3, 4, 5} ; // list of int numbers: 1, 2, 3, 4, 5

        for (int item : numList) {
            System.out.print(item + " ");
        }

        System.out.println();

        // example 2
        int[] numList2 = new int[5];

        for (int i = 0; i < 5; i++) {
            numList2[i] = i * 3;
        }

        for (int i = 0; i < numList2.length; i++) {
            System.out.print(numList2[i]  + " ");
        }

        System.out.println();

        // create & print out anonymous array
        printArray(new int[] {2, 4, 6, 8});
        System.out.println("");

        // create abd return array
        String[] persons = createArray();

        for (int i = 0; i < persons.length; i++ ) {
            System.out.println(persons[i]);
        }

        changePerson(persons);

        for (String item : persons) {
            System.out.println(item);
        }

    }

    public static void printArray(int[] list) {
        for (int item : list) {
            System.out.print(item  + " ");
        }
    }

    public static String[] createArray() {
        String[] strArray = {"Alice", "Fatin", "Brady"};
        return strArray;
    }

    public static void changePerson(String[] p) {
        p[1] = "Razak";
    }
}