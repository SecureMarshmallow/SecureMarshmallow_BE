package com.Secure.Marshmallow.domain.repository;

import com.Secure.Marshmallow.domain.Secret;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class SecretRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public Secret setSecret(String title, String contents, String category) {
        Secret secret = new Secret();
        secret.setTitle(title);
        secret.setContents(contents);
        secret.setCategory(category);
        entityManager.persist(secret);
        return secret;
    }
}
