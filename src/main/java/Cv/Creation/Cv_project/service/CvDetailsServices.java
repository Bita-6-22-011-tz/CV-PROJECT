package Cv.Creation.Cv_project.service;

import Cv.Creation.Cv_project.model.CVDetails;

import java.util.List;

public interface CvDetailsServices {
    public CVDetails saveCVDetails(CVDetails cvDetails);

    public List<CVDetails> getAllCVDetails();

    public CVDetails UpdateCVDetails(CVDetails cvDetails);

    public void delete(Long id);
}
