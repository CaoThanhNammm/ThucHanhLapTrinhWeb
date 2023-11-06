package Lab5_1;

import java.util.HashMap;
import java.util.Map;

public class UserService {
	private User user;
	private Map<String, String> data = new HashMap<>();

	public UserService(User user) {
		super();
		this.user = user;
		createData();
	}

	private void createData() {
		data.put("ty20122003", "123456789");
		data.put("teo120121996", "987654321");
	}

	public boolean check(String name, String password) {
		if (!data.containsKey(name))
			return false;

		if (data.get(name).equals(password))
			return true;

		return false;
	}
}
