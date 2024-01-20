package fr.chatelain.mapartdegateau.controller;

import fr.chatelain.mapartdegateau.dto.GateauDto;
import fr.chatelain.mapartdegateau.services.gateau.IGateauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GateauController {

    @Autowired
    private IGateauService gateauService;

    @PostMapping("/gateau")
    public GateauDto saveGateau(@RequestBody GateauDto gateauDto){
        return gateauService.saveOrUpdateGateau(gateauDto);
    }

    @GetMapping("/gateaux/{id}")
    public GateauDto getGateau(@PathVariable("id") String id){
        return gateauService.getGateauById(id);
    }

    @PutMapping("/gateau")
    public GateauDto updateGateau(@RequestBody GateauDto gateauDto){
        return gateauService.saveOrUpdateGateau(gateauDto);
    }

    @DeleteMapping("/gateaux/{id}")
    public void deleteGateau(@PathVariable("id") String id){
        gateauService.deleteById(id);
    }
}
