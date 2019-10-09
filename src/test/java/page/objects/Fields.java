package page.objects;

public enum Fields{
    wprowadzania, wyboru, daty;

    public static Fields of(String input) {
        if (input.equals("Pole wprowadzania")) {
            return wprowadzania;
        } else if (input.equals("Pole wyboru")){
            return wyboru;
        }
        else return daty;
    }

}


