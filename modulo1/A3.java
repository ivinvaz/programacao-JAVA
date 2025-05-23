package modulo1;

public class A3 {
    public static void main(String[] args) {
        String A = "C";
        if (A == "L") {
            System.out.println("A é L.");
        } else {
            System.out.println("A não é L.");
        }
        switch (A) {
            case "B":
                System.out.println("A é B");
            case "C":
                System.out.println("A é C");
            default:
                break;
        }
    }
}
