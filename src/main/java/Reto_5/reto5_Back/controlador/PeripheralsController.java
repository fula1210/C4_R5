package Reto_5.reto5_Back.controlador;

import Reto_5.reto5_Back.servicio.PeripheralsService;
import Reto_5.reto5_Back.modelo.Peripherals;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/peripherals")
@CrossOrigin("*")
public class PeripheralsController {
        @Autowired
    private PeripheralsService accessoryService;
       
     @GetMapping("/all")
    public List<Peripherals> getAll() {
        return accessoryService.getAll();
    }
    
    @GetMapping("/{reference}")
    public Optional<Peripherals> getClothe(@PathVariable("reference") String reference) {
        return accessoryService.getClothe(reference);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Peripherals create(@RequestBody Peripherals gadget) {
        return accessoryService.create(gadget);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Peripherals update(@RequestBody Peripherals gadget) {
        return accessoryService.update(gadget);
    }

    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference") String reference) {
        return accessoryService.delete(reference);
    } 
    
    
//    @GetMapping("/price/{price}")
//    public List<Peripherals> productByPrice( double precio){
//        return accessoryService.productByPrice(precio);
//    }
    
    @GetMapping("/price/{price}")
    public List<Peripherals> productByPrice(@PathVariable("price") double precio){
        return accessoryService.productByPrice(precio);
    }
    
    @GetMapping("/description/{description}")
    public List<Peripherals> findByDescriptionLike(@PathVariable("description") String description){
        return accessoryService.findByDescriptionLike(description);
    }
}
