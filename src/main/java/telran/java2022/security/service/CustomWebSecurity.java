package telran.java2022.security.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import telran.java2022.accounting.dao.UserAccountRepository;
import telran.java2022.accounting.model.UserAccount;
import telran.java2022.post.dao.PostRepository;
import telran.java2022.post.model.Post;

@Service("customSecurity")
@RequiredArgsConstructor
public class CustomWebSecurity {
	
	final PostRepository postRepository;
    final UserAccountRepository repository;
	
	public boolean checkPostAuthor(String postId, String userName) {
		Post post = postRepository.findById(postId).orElse(null);
		return post != null && userName.equalsIgnoreCase(post.getAuthor());
	}

    public boolean checkPassword(String username) {
        UserAccount userAccount = repository.findById(username).orElseThrow();
        return userAccount.getDateExpiredPassword().isBefore(LocalDate.now());
    }

}