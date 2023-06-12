package sbms.dti;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class DtiRepository {

    @PersistenceContext
    private EntityManager em;

    public String save(Dti dti){
        em.persist(dti);
        return dti.getConversationID();
    }

    public Dti find(String conversationId){
        return em.find(Dti.class,conversationId);
    }
}
