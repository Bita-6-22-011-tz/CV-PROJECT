package Cv.Creation.Cv_project.controller;
import Cv.Creation.Cv_project.model.Register;
import Cv.Creation.Cv_project.service.CvRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class CvRegisterController {

    @Autowired
    private CvRegisterService registerServices;

    @PostMapping("/register/get")
    private String saveReg(@RequestBody Register register) {
        registerServices.saveRegister(register);
        return "added";
    }

    @GetMapping("/register/id1")
    public List<Register> getReg(){
        return registerServices.getAllRegister();
    }

    @PutMapping("/register/put/{id}")
    public Register updateReg(@PathVariable Long id,@RequestBody Register register){
        register.setId(id);
        return registerServices.UpdateRegister(register);
    }

    @DeleteMapping("/register/delete")
    public void deleteReg(@RequestParam Long id){
    registerServices.delete(id);
    }
}