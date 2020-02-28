package com.juniorAssociate.RSI.lifeJacket.Controllers;

import com.juniorAssociate.RSI.lifeJacket.Entities.Step;
import com.juniorAssociate.RSI.lifeJacket.Services.StepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

//todo: Look up update endpoints

@RestController
@RequestMapping("/step")
public class StepController {
    @Autowired
    private StepService stepService;

    @RequestMapping("/")
    public String Helloworld (){
        return "Tommie is amazing in his steps!!!";
    }

    @RequestMapping(value = "/getAll")
    public List<Step> getAllSteps() {
        return stepService.getAllSteps();
    }

    @PatchMapping(value = "/saveAll")
    public void saveAllSteps() {
        stepService.saveAllSteps();
    }

    @RequestMapping(value = "/findAll")
    public void findAllSteps(){
        stepService.findAllSteps();
    }
    //todo figure out what info i will have
//    @RequestMapping("/findByID")
//    public Optional<Step> findById(Long id){
//        Optional<Step> foundStep = stepService.findByID();
//        return foundStep;
//    }
    //todo figure out what info i will have
    @DeleteMapping ("/delete")
    public void delete(){
        //  stepService.deleteStep(Step);
    }
    //todo figure out what info i will have
    @PatchMapping("/save")
    public void saveStep(){
        //  stepService.saveStep(Step);
    }


    //todo:this endpoint after basic endpoints
    @PatchMapping(value = "/admin/change/{title}")
    public void changeStep(@PathVariable String title){
        //check step repo so we can find by the step name
    }

    //todo:this endpoint after basic endpoints
    @PutMapping(value = "/admin/insert/{title}")
    public void insertStep(@PathVariable String title){

    }
}