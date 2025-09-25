public class CountFalseBooleans {
        public static void main(String[] args) {
        // Main-Methode zum Testen ...
        boolean[] test1 = {true, false, false, true, true};
        countFalseBooleans(test1);
    }

    // Ihre Methode hier ...
    public static int countFalseBooleans(boolean[] booleans) {
        int erg = 0;
        
        for(int i = 0; i < booleans.length; i++) {
            boolean index = booleans[i];
            if (index == false) {
                erg++;
            }
        }
        System.out.println(erg);
        return erg;
    }
}