package page.objects;

public enum Types {
        Tekst, Liczba, Maska;
        public static Types of(String input) {
            if (input.equals("Tekst")) {
                return Tekst;
            } else if (input.equals("Liczba")){
                return Liczba;
            }
            else return Maska;
        }
    }


