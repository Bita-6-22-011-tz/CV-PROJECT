package Cv.Creation.Cv_project.service;

import Cv.Creation.Cv_project.model.CVWork;

import java.util.List;

public interface CvWorkServices {


    CVWork saveCVWork(CVWork cvWork);

    List<CVWork> getAllCVWork();

    CVWork UpdateCVWork(CVWork cvWork);

    void delete(Long id);
}
