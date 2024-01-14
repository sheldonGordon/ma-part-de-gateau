package fr.chatelain.mapartdegateau.controller;

import fr.chatelain.mapartdegateau.entities.Gateau;
import fr.chatelain.mapartdegateau.entities.Ingredient;
import fr.chatelain.mapartdegateau.services.gateau.IGateauService;
import fr.chatelain.mapartdegateau.services.ingredient.IIngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GateauController {

    @Autowired
    private IGateauService gateauService;

    @PostMapping("/gateau")
    public Gateau saveGateau(@RequestBody Gateau gateau){
        return gateauService.saveOrUpdateGateau(gateau);
    }

    @GetMapping("/gateaux/{id}")
    public Gateau getGateau(@PathVariable("id") String id){
        return gateauService.getGateauById(id);
    }

    @PutMapping("/gateau")
    public Gateau updateGateau(@RequestBody Gateau gateau){
        return gateauService.saveOrUpdateGateau(gateau);
    }

    @GetMapping("/gateaux/{id}")
    public void deleteGateau(@PathVariable("id") String id){
        gateauService.deleteById(id);
    }
}
