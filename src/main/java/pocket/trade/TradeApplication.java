package pocket.trade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pocket.trade.services.CustomerService;

@SpringBootApplication
public class TradeApplication implements CommandLineRunner {
    @Autowired
    CustomerService customerService;

    public static void main(String[] args) {
        SpringApplication.run(TradeApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println(customerService
                .getCustomerByEmail("john.doe@example.com"));
    }
}
