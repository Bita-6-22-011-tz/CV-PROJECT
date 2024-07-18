package Cv.Creation.Cv_project.service;

import Cv.Creation.Cv_project.model.CVWork;
import Cv.Creation.Cv_project.repository.CVWorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CvWorkService implements CvWorkServices{
    @Autowired
    private CVWorkRepository CVWorkRepository;

    @Override
    public CVWork saveCVWork(CVWork cvWork){
        return CVWorkRepository.save(cvWork);
    }

    @Override
    public List<CVWork> getAllCVWork(){
        return CVWorkRepository.findAll();
    }
    @Override
    public CVWork UpdateCVWork(CVWork cvWork){
        return CVWorkRepository.save(cvWork);
    }

    @Override
    public void delete(Long id) {
        CVWorkRepository.deleteById(id);
    }
}

