package fr.chatelain.mapartdegateau.controller;

import fr.chatelain.mapartdegateau.dto.PrixDto;
import fr.chatelain.mapartdegateau.services.prix.IPrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PrixController {

    @Autowired
    private IPrixService prixService;

    @PostMapping("/prix")
    public PrixDto savePrix(@RequestBody PrixDto prixDto){
        return prixService.saveOrUpdatePrix(prixDto);
    }

    @GetMapping("/prix/{id}")
    public PrixDto getPrix(@PathVariable("id") String id){
        return prixService.findPrixById(id);
    }

    @PutMapping("/prix")
    public PrixDto updatePrix(@RequestBody PrixDto prixDto){
        return prixService.saveOrUpdatePrix(prixDto);
    }

    @DeleteMapping("/prix/{id}")
    public void deletePrix(@PathVariable("id") String id){
        prixService.deleteById(id);
    }
}
