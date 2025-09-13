package Week3.day2;

public class JavaConnection2 extends MySqlConnection {

	
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("CONNECTED");
	}

	
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnected");
		
	}

	
	public void executeupdate() {
		// TODO Auto-generated method stub
		System.out.println("Executed");
		
	}

	
	public void executeQuery() {
		// TODO Auto-generated method stub
		System.out.println("ExecuteQuery");
		
	}
	
	public static void main(String[] args) {
		
		JavaConnection2 JC = new JavaConnection2();
		JC.executeupdate();
		JC.executeQuery();
		
		
	}

}
