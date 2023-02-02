package ru.volokitin.domain;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.time.Year;

import static java.util.Objects.isNull;

@Converter(autoApply = true)
public class YearAttributeConverter implements AttributeConverter<Year, Short> {
    @Override
    public Short convertToDatabaseColumn(Year year) {
        if (!isNull(year)) {
            return (short) year.getValue();
        }
        return null;
    }

    @Override
    public Year convertToEntityAttribute(Short aShort) {
        if (!isNull(aShort)) {
            return Year.of(aShort);
        }
        return null;
    }
}
