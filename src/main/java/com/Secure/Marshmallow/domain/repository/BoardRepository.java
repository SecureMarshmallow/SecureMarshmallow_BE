package com.Secure.Marshmallow.domain.repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.Secure.Marshmallow.domain.Board;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class BoardRepository {
    @PersistenceContext
    private EntityManager em;

    public Board writePost(String title, String writer, String content, String password) {
        Board board = new Board(title, writer, content, password);
        board.setTitle(title);
        board.setWriter(writer);
        board.setContent(content);
        board.setPassword(password);
        em.persist(board);
        return board;
    }

    public Board viewPost(int idx) {
        return em.find(Board.class, idx);
    }
}
