package com.example.wallet.converters;

import java.util.List;

public interface BaseConverter<E, D> {

    E convertDto(D d);

    D ConvertEntity(E e);

    List<E> convertDto(List<D> d);

    List<D> convertEntity(List<E> e);
}
