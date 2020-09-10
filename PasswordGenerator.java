package projects;
import java.util.*;
public class PasswordGenerator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of password required");
		int length = sc.nextInt();
		System.out.println(pass_generator(length));
            sc.close();
      }
	
	static char[] pass_generator(int len) {
		String Capital_char = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String Small_char = "abcdefghijklmnopqrstuvwxyz";
            String numbers = "0123456789";
            String symbols = "!@#$&";
            String values = Capital_char + Small_char + numbers + symbols;
            Random random = new Random();
            char[] password = new char[len];
            for (int i = 0; i < len; i++) {
                  password[i] = values.charAt(random.nextInt(values.length()));
            }
            System.out.println("Generated Password is:");
            return password;
      }

}
