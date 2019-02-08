import org.springframework.web.client.RestTemplate;

public class Main {

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	private void run() throws Exception {
		System.err.println(
				new RestTemplate().getForObject("http://google.com", String.class));
	}

}