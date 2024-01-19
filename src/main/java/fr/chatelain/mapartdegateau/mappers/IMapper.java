package fr.chatelain.mapartdegateau.mappers;

import java.util.List;

public interface IMapper<T, D> {

    D mapToDto(T entity);

    T mapToEntity(D dto);

    List<D> mapToListDto(List<T> listeEntity);

    List<T> mapToListEntity(List<D> listeDto);
}
