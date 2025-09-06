package Week3.day2;

public class JavaConnection1 implements DatabaseConnection {


	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connect");
		
	}


	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnect");
	}


	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Executeupdate");
	}
	
	public static void main(String[] args) {
		
		JavaConnection1 JC = new JavaConnection1();
		JC.connect();
		JC.disconnect();
		JC.executeUpdate();
		
	}

}
