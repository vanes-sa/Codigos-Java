public class Calculate {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        switch (args[0]) {
            case "soma" -> sum(x, y);
            case "subtrair" -> minus(x, y);
            case "multiplique" -> mult(x, y);
            case "divida" -> div(x, y);
            default -> System.out.println("Nenhuma instrução definida.");
        }
    }

    static void sum(int x, int y) {
        System.out.println(x + y);
    }
    static void minus(int x, int y) {
        System.out.println(x - y);
    }
    static void mult(int x, int y) {
        System.out.println(x * y);
    }
    static void div(int x, int y) {
        System.out.println(x / y);
    }
}


