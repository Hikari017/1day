public class IfSwitch {
    public static void main(String[] args) {
        int b = 5;
        int a = 15;

        if(!(a >= 10 && a <= 20) || a == 9)
            System.out.println("A jest w przedziale");
        else
            System.out.println("A nie jest w przedziale");

        System.out.println("asd");


        int c = 10;

        switch(c){
            case 1: {
                System.out.println("jeden");
                break;
            }
            case 2: {
                System.out.println("dwa");
                break;
            }
            default: {
                System.out.println("Zadne z powzyszych");
            }
        }

    }
}
