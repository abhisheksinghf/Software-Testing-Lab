//import java.util.*;
//
//public class OTP_Generation {
//	public static void main(String[] args)
//	{
//		int length = 4;
//		System.out.println(OTP(length));
//	}
//	public static char[] OTP(int len)
//	{
//		Random r = new Random();
//		String numbers = "0123456789";
//		char[] otp = new char[len];
//		
//		for(int i=0;i<len;i++)
//		{
//			otp[i] = numbers.charAt(r.nextInt(numbers.length()));
//		}
//		return otp;
//	}
//}
import java.util.*;

public class OTP_Generation{
	public static void main(String[] args)
	{
		int length = 4;
		System.out.println(Otpwala(length));
	}
	public static char[] Otpwala(int len)
	{
//		Random r = new Random();
//		String numbers = "0123456789";
//		char[] otp = new char[len];
//		
//		for(int i=0;i<len;i++)
//		{
//			otp[i] = numbers.charAt(r.nextInt(numbers.length()));
//		}
//		return otp;
		Random r = new Random();
		String numbers = "0123456789";
		char[] otp = new char[len];
		
		for(int i=0;i<len;i++)
		{
			otp[i] = numbers.charAt(r.nextInt(numbers.length()));
		}
		return otp;
	}
}





