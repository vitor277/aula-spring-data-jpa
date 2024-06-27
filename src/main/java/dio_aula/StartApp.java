package dio_aula;

import dio_aula.model.User;
import dio_aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user  = new User();
        user.setName("Joao");
        user.setUsername("jp");
        user.setPassword("Teste");
        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }

    }
}
