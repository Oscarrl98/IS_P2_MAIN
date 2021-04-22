package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.menu_principal;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.menu_principal.service.service.mainService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class MenuPrincipalApplication {

	public static void main(String[] args) {
		SpringApplication.run(MenuPrincipalApplication.class, args);
		mainService maService= mainService.getInstance();
		maService.principalMain();

	}

}