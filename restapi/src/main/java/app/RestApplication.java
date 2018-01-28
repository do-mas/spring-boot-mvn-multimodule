package app;

import org.springframework.beans.factory.annotation.Autowired;
import repo.User;
import repo.UserRepository;
import service.ServiceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Import({ServiceConfig.class})
public class RestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }

    @Autowired
    private UserRepository repo;
    @PostConstruct
    private void postConstruct() {
        repo.save(new User().setUserId(1).setName("username"));
    }

}
