package Cv.Creation.Cv_project.repository;


import Cv.Creation.Cv_project.model.CVWork;
import Cv.Creation.Cv_project.model.Register;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CVWorkRepository extends JpaRepository<CVWork,Long> {
    static CVWork Save (CVWork cvWork) {
        throw new
                UnsupportedOperationException("Unimplemented method 'save'");
    }

}
