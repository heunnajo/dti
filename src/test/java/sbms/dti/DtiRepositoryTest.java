package sbms.dti;

//import static org.junit.Assert.*;
//import org.junit.Assert.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DtiRepositoryTest {

    @Autowired DtiRepository dtiRepository;

    @Test
    @Transactional
    public void testDti() throws Exception{
        //given
        Dti dti = new Dti();
        dti.setConversationID("tmpConversationId");

        //when
        String savedId = dtiRepository.save(dti);
        Dti findDti = dtiRepository.find(savedId);

        //then
        Assertions.assertThat(findDti.getConversationID()).isEqualTo(dti.getConversationID());
    }
//    @Test
//    void contextLoads(){
//        Assertions.assertThat("hi").isEqualTo("hi");
//    }
}