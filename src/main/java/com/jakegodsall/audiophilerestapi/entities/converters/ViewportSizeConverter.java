package com.jakegodsall.audiophilerestapi.entities.converters;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class ViewportSizeConverter implements AttributeConverter {
    @Override
    public Object convertToDatabaseColumn(Object attribute) {
        return null;
    }

    @Override
    public Object convertToEntityAttribute(Object dbData) {
        return null;
    }
}
