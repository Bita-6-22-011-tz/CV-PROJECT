package Cv.Creation.Cv_project.service;

import Cv.Creation.Cv_project.model.Register;

import java.util.List;

public interface CvRegisterServices {
    Register saveRegister(Register register);

    List<Register> getAllRegister();

    Register UpdateRegister(Register register);

    void delete(Long id);
}
