package Cv.Creation.Cv_project.controller;


import Cv.Creation.Cv_project.model.CVWork;
import Cv.Creation.Cv_project.service.CvWorkServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cvwork")
public class CVWorkController {

    @Autowired
    private CvWorkServices cvWorkServices;

    @PostMapping("/register/get")
    private String saveWor(@RequestBody CVWork cvWork) {
        cvWorkServices.saveCVWork(new CVWork());
        return "added";
    }

    @GetMapping("/register/id1")
    public List<CVWork> getWor(){
        return cvWorkServices.getAllCVWork();
    }

    @PutMapping("/register/put/{id}")
    public CVWork updateWor(@PathVariable Long id,@RequestBody CVWork cvWork){
        cvWork.setId(id);
        return cvWorkServices.UpdateCVWork(cvWork);
    }

    @DeleteMapping("/register/delete")
    public void deleteWor(@RequestParam Long id){
        cvWorkServices.delete(id);
    }



}