package fr.chatelain.mapartdegateau.services.prix;

import fr.chatelain.mapartdegateau.dto.PrixDto;
import fr.chatelain.mapartdegateau.entities.Prix;
import fr.chatelain.mapartdegateau.mappers.MapperPrix;
import fr.chatelain.mapartdegateau.repositories.IPrixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrixServiceImpl implements IPrixService{

    @Autowired
    private IPrixRepository prixRepository;

    private MapperPrix mapperPrix;

    public PrixServiceImpl() {
        this.mapperPrix = new MapperPrix();
    }

    @Override
    public PrixDto saveOrUpdatePrix(PrixDto prixDto) {
        Prix prixToSave = mapperPrix.mapToEntity(prixDto);
        Prix prixSave = prixRepository.save(prixToSave);
        return mapperPrix.mapToDto(prixSave);
    }

    @Override
    public PrixDto findPrixById(String id) {
        Prix prixFind = prixRepository.findPrixById(id);
        return mapperPrix.mapToDto(prixFind);
    }

    @Override
    public void deleteById(String id) {
        prixRepository.deleteById(id);
    }
}
