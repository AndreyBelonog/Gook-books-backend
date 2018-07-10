package home.andreybelonog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GookBooksApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GookBooksApplicationTest {

    @Test
    public void whenApplicationsMainMethodInvokedThenApplicationStartsSuccessfully(){
        GookBooksApplication.main(new String[]{});

    }
}
