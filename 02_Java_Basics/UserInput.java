import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int inp = Integer.parseInt(input.nextLine());

        System.out.println(inp+1);

        input.close();
    }
}
