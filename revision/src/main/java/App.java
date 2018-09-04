import java.util.Scanner;

public class App {
    //  키보드 입력을 처리할 객체 준비.
    static Scanner keyIn = new Scanner(System.in);
    
    //  배열을 이용하여 회원 정보 저장.
    static String[] names = new String[100];
    static String[] emails = new String[100];
    static String[] passwords = new String[100];
    
    static int index = 0;
    
    static void inputMembers() {
        //  반복문을 이용해서 사용자로부터 회원정보 입력 받기.
        while(true) {            
            System.out.print("Name : ");
            names[index] = keyIn.nextLine();
            
            System.out.print("eMail : ");
            emails[index] = keyIn.nextLine();
            
            System.out.print("Password : ");
            passwords[index] = keyIn.nextLine();
            
            index++;
            
            //  탈출 조건
            System.out.print("Continue? (Y/n)");
            String answer = keyIn.nextLine();
            if(answer.toLowerCase().equals("n")) {
                break;
            }
        }
    }
    
    static void printMembers() {
        //  looping printf로 출력.
        for(int i = 0; i < index; i ++) {
            System.out.printf("%s, %s, %s\n", names[i], emails[i], passwords[i]);
        }
    }
    
    public static void main(String[] args) {
            inputMembers();
            keyIn.close();
            printMembers();
    }
}
