package conditional.switchdemo;

public class SwitchEx3 {
    public static void main(String[] args) {
        int switchValue =2;
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Value was 3 or 4 or 5");
                System.out.println("Value was actual: " + switchValue);
            }
            default -> System.out.println("Value was not in 1 or 2 or 3 or 4 or 5");
        }
    }
}
