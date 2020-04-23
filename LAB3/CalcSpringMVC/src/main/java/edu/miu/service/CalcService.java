package edu.miu.service;

import edu.miu.domain.Calc;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public interface CalcService {
    public List<String> validate(Calc calc);

}
