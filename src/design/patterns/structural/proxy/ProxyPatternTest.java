package design.patterns.structural.proxy;
public class ProxyPatternTest {

	public static void main(String[] args){
		CommandExecutor executor = new CommandExecutorProxy("Rahul", "wrong_pwd");
		try {
			executor.runCommand("ls -ltr");
			String path = "C:\\Users\\hp\\OneDrive\\Documents\\abc.pdf";
			executor.runCommand(" rm -rf "+path);
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
		
	}

}