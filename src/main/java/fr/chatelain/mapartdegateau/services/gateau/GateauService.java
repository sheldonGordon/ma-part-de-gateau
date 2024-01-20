package fr.chatelain.mapartdegateau.services.gateau;

import fr.chatelain.mapartdegateau.dto.GateauDto;
import fr.chatelain.mapartdegateau.entities.Gateau;
import fr.chatelain.mapartdegateau.mappers.MapperGateau;
import fr.chatelain.mapartdegateau.repositories.IGateauRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GateauService implements IGateauService{

    @Autowired
    private IGateauRepository gateauRepository;

    private final MapperGateau mapperGateau;

    public GateauService() {
        this.mapperGateau = new MapperGateau();
    }

    @Override
    public GateauDto saveOrUpdateGateau(GateauDto gateauDto) {
        Gateau gateauToSave = mapperGateau.mapToEntity(gateauDto);
        Gateau gateauSave = gateauRepository.save(gateauToSave);
        return mapperGateau.mapToDto(gateauSave);
    }

    @Override
    public GateauDto getGateauById(String id) {
        Gateau gateauFind = gateauRepository.getGateauById(id);
        return mapperGateau.mapToDto(gateauFind);
    }

    @Override
    public void deleteById(String id) {
        gateauRepository.deleteById(id);
    }
}
