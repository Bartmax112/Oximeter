package com.bart.affirmations;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import java.util.List;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;

@ExecuteOn(TaskExecutors.BLOCKING)  
@Controller("/affirmations")
public class AffirmationRestController {

    private final AffirmationRepository affirmationRepository;

    public AffirmationRestController(AffirmationRepository affirmationRepository){
        this.affirmationRepository = affirmationRepository;
    }

    @Get
    public List<AffirmationEntity> listAffirmations(){
        return (List<AffirmationEntity>) affirmationRepository.findAll();
    }

}
