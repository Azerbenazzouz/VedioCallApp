package azerbenazzouz.vediocall;

import azerbenazzouz.vediocall.user.User;
import azerbenazzouz.vediocall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VedioCallApplication {

    public static void main(String[] args) {
        SpringApplication.run(VedioCallApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(UserService userService) {
        return args -> {
            userService.register(User.builder()
                    .name("Azer")
                    .email("benazzouzazer@gmail.com")
                    .password("azerazer")
                    .build());

            userService.register(User.builder()
                    .name("Adem")
                    .email("benazzouzadem@gmail.com")
                    .password("ademadem")
                    .build());

            userService.register(User.builder()
                    .name("Adyen")
                    .email("benazzouzadyen@gmail.com")
                    .password("adyenadyen")
                    .build());
        };
    }
}
