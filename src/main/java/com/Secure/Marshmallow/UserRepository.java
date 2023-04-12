package com.Secure.Marshmallow;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserRepository {
    @PersistenceContext
    private EntityManager em;

    public User register(String username, String id, String password, String gmail) {
        User user = new User();
        user.setUsername(username);
        user.setId(id);
        String encodedPassword = new BCryptPasswordEncoder().encode(password);
        user.setPassword(encodedPassword);
        user.setGmail(gmail);
        em.persist(user);
        return user;
    }

    public User login(String username, String password) {
        User user = em.createQuery("SELECT u FROM User u WHERE u.username = :username AND u.password = :password", User.class)
                .setParameter("username", username)
                .setParameter("password", password)
                .getSingleResult();
        boolean passwordMatch = new BCryptPasswordEncoder().matches(password, user.getPassword());
        if (passwordMatch) {
            return user;
        } else {
            return null;
        }
    }
}
