package edu.miu.serviceimpl;

import edu.miu.domain.Calc;
import edu.miu.service.CalcService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalcServiceImpl implements CalcService {

    @Override
    public List<String> validate(Calc calc) {
        List<String> errors = new ArrayList<String>();
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
