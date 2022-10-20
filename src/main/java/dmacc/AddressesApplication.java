package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.Addresses;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.AddressRepository;

@SpringBootApplication
public class AddressesApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AddressesApplication.class, args);
		
		
	}

	@Autowired
	AddressRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Addresses a = appContext.getBean("addresses", Addresses.class);
		
		a.setCity("Des Moines");
		
		repo.save(a);
		
		Addresses b = new Addresses("Bob Smith", "123 Main Road", "Des Moines", 12345);
		
		repo.save(b);
		
		List<Addresses> allAddresses = repo.findAll();
		
		for(Addresses homes: allAddresses) {
			System.out.println(homes.toString());
		}
		
	}
}
