import java.util.Random;
public class mobile_otp {
	static char[] otp(int len)
	{
		System.out.println("Generating OTP using Random()");
		System.out.println("\nOTP is : ");
		String numbers = "0123456789";
		Random r = new Random();
		char[] otp = new char[len];
		for (int i = 0; i < len; i++) {
			otp[i] = numbers.charAt(r.nextInt(numbers.length()));
		}
		return otp;
	}
	public static void main(String[] args)
	{
		int length = 6;
		System.out.println(otp(length));
	}
}
