package com.drippserver.controller;

import com.drippserver.entity.Target;
import com.drippserver.repo.TargetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Controller
@RequestMapping("/configs")
class MainController {
    @Autowired
    TargetsRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Target> getConfig(){
        List<Target> result = new ArrayList<>();
        repository.findAll().iterator().forEachRemaining(result::add);

        Collections.shuffle(result);
        result.sort(Comparator.comparingInt(Target::getPriority).reversed());

        return result;
    }
}
