package conditional.switchdemo;

public class SwitchEx1 {
    public static void main(String[] args) {
        int switchValue =3;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3 or 4 or 5");
                System.out.println("Value was actual: "+ switchValue);
                break;
            default:
                System.out.println("Value was not in 1 or 2 or 3 or 4 or 5");
                break;
        }
    }
}
