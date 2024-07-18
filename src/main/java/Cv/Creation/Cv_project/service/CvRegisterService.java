package Cv.Creation.Cv_project.service;

import Cv.Creation.Cv_project.model.Register;
import Cv.Creation.Cv_project.repository.CvRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CvRegisterService implements CvRegisterServices{

        @Autowired
        private CvRegisterRepository cvRegisterRepository;

        @Override
        public Register saveRegister(Register register){
            return cvRegisterRepository.save(register);
        }
        @Override
        public List<Register> getAllRegister(){
            return cvRegisterRepository.findAll();
        }
        @Override
        public Register UpdateRegister(Register register){
            return cvRegisterRepository.save(register);
        }

        @Override
        public void delete(Long id) {
            cvRegisterRepository.deleteById(id);
        }
}
