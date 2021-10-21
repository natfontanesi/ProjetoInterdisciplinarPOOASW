package com.switchmarket;

import com.switchmarket.Entities.Usuario;
import com.switchmarket.Repositories.UsuarioRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwitchMarketApplication implements CommandLineRunner {
    private UsuarioRepo usuarioRepo;

    public SwitchMarketApplication(UsuarioRepo usuarioRepo) {
            this.usuarioRepo= usuarioRepo;
        }
        public static void main(String[] args) {
        SpringApplication.run(SwitchMarketApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //Usuario user = new Usuario("Natascha", "natfontanesi@gmail.com", "dkcn09242627", "35883269877","Vinhedo", "São Paulo");
        //this.usuarioRepo.save(user);
    }
}
