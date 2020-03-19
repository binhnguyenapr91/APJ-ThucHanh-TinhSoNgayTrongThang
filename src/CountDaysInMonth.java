import java.util.Scanner;

public class CountDaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month:");
        int month = scanner.nextInt();
        String result;
        switch (month){
            case 2:
                result = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = "30";
                break;
            default:
                result="";
        }
        if(result!=""){
            System.out.printf("Month '%d' have '%s' days.",month,result);
        }else System.out.println("Input is not available.");
    }
}
