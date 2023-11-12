package Lab5_2;

import java.util.List;
import java.util.stream.Collectors;

public class UserService {
	private User user;

	public UserService(User user) {
		super();
		this.user = user;
	}

	public boolean checkLogin(String email, String password) {
		List<User> user = JDBIConnector.getConnection()
				.withHandle(h -> h.createQuery("SELECT email, password FROM user WHERE email = ?")
						.bind(0, this.user.getEmail()).mapToBean(User.class).stream().collect(Collectors.toList()));

		
		for (User u : user) {
			if(u.getEmail().equals(email) && u.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

}