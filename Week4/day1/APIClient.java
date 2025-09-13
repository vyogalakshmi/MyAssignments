package Week4.day1;

public class APIClient {
	
	public void sendRequest(String endpoint)
	{
		System.out.println(endpoint);
	}

	public void sendRequest(String endpoint,String requestBody,boolean requestStatus)
	{
		System.out.println(endpoint);
		System.out.println(requestBody);
		System.out.println(requestStatus);
	}
	
	public static void main(String[] args) {
		
		APIClient api = new APIClient();
		api.sendRequest("Endpoint printed");
		api.sendRequest("Endpoint","Hello world", false);
	}
}
