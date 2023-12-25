package ma.emsi.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.model.User;
import ma.emsi.repository.UserRepository;
import ma.emsi.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void create(User u) {
		userRepository.save(u);
		
	}

	@Override
	public void update(User u) {
		
		User newUser = findById(u.getId());
		if (newUser != null) {
			newUser.setNom(u.getNom());
			newUser.setPrenom(u.getPrenom());
			newUser.setEmail(u.getEmail());
			newUser.setPassword(u.getPassword());
			newUser.setTelephone(u.getTelephone());
			userRepository.save(newUser);
		}
	}		
	

	@Override
	public void delete(int id) {
		userRepository.deleteById(id);
		
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User findById(int id) {
		return userRepository.findById(id);
	}

}
