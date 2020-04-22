package edu.miu.validator;

import edu.miu.domain.Calc;

import java.util.ArrayList;
import java.util.List;

public class CalcValidatorImpl implements CalcValidator {

    @Override
    public List<String> validate(Object object) {
        List<String> errors = new ArrayList<String>();
        Calc calc = (Calc) object;
        Integer num1 = calc.getNum1();
        if (num1 == null)
            errors.add("Num1 is missing");

        Integer num2 = calc.getNum2();
        if (num2 == null)
            errors.add("Num2 is missing");

        Integer num3 = calc.getNum3();
        if (num3 == null)
            errors.add("Num3 is missing");

        Integer num4 = calc.getNum4();
        if (num4 == null)
            errors.add("Num4 is missing");

        return errors;
    }
}
