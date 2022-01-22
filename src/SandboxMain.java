import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SandboxMain {
	public static void main(String[] args) throws Exception {
		String newLine = "—————————————————————————————————————"
				+ "————————————————————————————————————————————"
				+ "————————————————————————————————————————————"
				+ "————————————————————————————————————————————"
				+ "————————————————————————————————————————————"
				+ "————————————————————————————————————————————"
				+ "————————————————\n";
		System.out.println("Hello Sandbox!");
		System.out.println(newLine);
		
		//RegEx Sandbox
		String data = "" 
				+ "User Name	: "
				+ "Geraldus Dylan Alvandi</br>"
				+ ",Password	: "
				+ "123abcDEF</br>";
		String data2 = "Dear	 first_name_t010_13 last_name_t010_13,<br/><br/>A new user account has been created for you on the LibreClinica system.  Your login information follows:\r\n"
				+ "<br/><br/>User Name	: user_t010_13<br/>Password	: h4tDXDrg<br/><br/>Please test your login information and let us know if you have any problems by going to the following URL:<br/><br/>";
		
		String testData = data2;
		
		System.out.println(testData);
		System.out.println(newLine);
		//	
		Pattern pattern = Pattern.compile("(User Name|Password)	: ([^<]*)");
		Matcher matcher = pattern.matcher(testData);
		
		String username = null, password = null;
		
		while(matcher.find()) {
			System.out.println(matcher.group(1)+":"+matcher.group(2));
			switch(matcher.group(1)) {
			case "User Name":
				username = matcher.group(2);
				break;
			case "Password":
				password = matcher.group(2);
				break;
			}
		}
		if(username == null || password == null) {
			throw new Exception("Could not find username and/or password in text");
		}
		//
		System.out.printf(newLine);
		Primary primary = new Primary();
		primary.greet();
		
	}
}
