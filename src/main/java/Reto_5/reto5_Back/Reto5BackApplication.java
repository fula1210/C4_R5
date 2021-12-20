package Reto_5.reto5_Back;

import Reto_5.reto5_Back.interfaces.InterfaceOrder;
import Reto_5.reto5_Back.interfaces.InterfacePeripherals;
import Reto_5.reto5_Back.interfaces.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Reto5BackApplication implements CommandLineRunner{

@Autowired
    private InterfacePeripherals  crudRepository;
    @Autowired
    private InterfaceUser userCrudRepository;
    @Autowired
    private InterfaceOrder orderCrudRepository;

	public static void main(String[] args) {
		SpringApplication.run(Reto5BackApplication.class, args);
	}
@Override
    public void run(String... args) throws Exception {
        
//      SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        crudRepository.deleteAll();
        userCrudRepository.deleteAll();
        orderCrudRepository.deleteAll();
    }
}
