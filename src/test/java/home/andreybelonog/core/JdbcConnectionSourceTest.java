package home.andreybelonog.core;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class JdbcConnectionSourceTest {
    private String url;

    private String username;

    private String password;

    private String validationQuery;

    @Before
    public void seyUp() {
        url = "jdbc:postgresql://localhost/GookBookDB";
        username = "postgres";
        password = "pass";
        validationQuery = "SELECT 1";
    }
}
