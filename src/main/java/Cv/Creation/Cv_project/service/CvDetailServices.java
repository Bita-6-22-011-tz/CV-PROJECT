package Cv.Creation.Cv_project.service;

import Cv.Creation.Cv_project.model.CVDetails;
import Cv.Creation.Cv_project.repository.CVDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CvDetailServices implements CvDetailsServices{

    @Autowired
    private CVDetailsRepository cvDetailsRepository;
    @Override
    public CVDetails saveCVDetails(CVDetails cvDetails){
        return cvDetailsRepository.save(cvDetails);
    }
    @Override
    public List<CVDetails> getAllCVDetails(){
        return cvDetailsRepository.findAll();
    }
    @Override
    public CVDetails UpdateCVDetails(CVDetails cvDetails){
        return cvDetailsRepository.save(cvDetails);
    }

    @Override
    public void delete(Long id) {
        cvDetailsRepository.deleteById(id);
    }

}

