package service.impl;

import org.springframework.stereotype.Service;
import service.SandwichService;

import java.util.Arrays;
import java.util.Optional;

@Service
public class SandwichServiceImpl implements SandwichService {


    @Override
    public String save(String[] condiment) {
        return Arrays.toString(condiment);
    }
}
