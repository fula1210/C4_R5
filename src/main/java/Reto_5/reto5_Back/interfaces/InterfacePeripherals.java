package Reto_5.reto5_Back.interfaces;

import Reto_5.reto5_Back.modelo.Peripherals;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface InterfacePeripherals extends MongoRepository<Peripherals, String> {
    
    public List<Peripherals> findByPriceLessThanEqual(double precio);
    
    @Query("{'description':{'@regex': '?0','$options':'i'}   }")
    public List<Peripherals> findByDescriptionLike(String description);
    
    
}
