package com.algaworks.algafood.core.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.math.BigDecimal;

public class MultiploValidator implements ConstraintValidator<Multiplo, Number> {

    private int numeroMultiplo;

    @Override
    public void initialize(Multiplo constraintAnnotation) {
        numeroMultiplo = constraintAnnotation.numero();
    }

    @Override
    public boolean isValid(Number value, ConstraintValidatorContext constraintValidatorContext) {
        boolean valido = true;
        if (value != null) {
            var valorBigDecimal = BigDecimal.valueOf(value.doubleValue());
            var multiploBigDecimal = BigDecimal.valueOf(numeroMultiplo);
            var resto = valorBigDecimal.remainder(multiploBigDecimal);

            valido = BigDecimal.ZERO.compareTo(resto) == 0;
        }

        return valido;
    }
}
