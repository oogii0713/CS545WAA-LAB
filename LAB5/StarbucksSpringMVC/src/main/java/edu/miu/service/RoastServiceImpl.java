package edu.miu.service;

import java.util.List;

import edu.miu.repository.DataFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoastServiceImpl implements RoastService {
    @Autowired
    private DataFacade dataFacade;

    @Override
    public List<String> getAdvice(String roast) {
        return dataFacade.getAdvice(roast);
    }

}