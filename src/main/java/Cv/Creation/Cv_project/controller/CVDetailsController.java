package Cv.Creation.Cv_project.controller;


import Cv.Creation.Cv_project.model.CVDetails;
import Cv.Creation.Cv_project.service.CvDetailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")

public class CVDetailsController {

    @Autowired
    private CvDetailServices cvdetailservices ;

    @PostMapping("/cvDetail/get")
    private String saveDet(@RequestBody CVDetails cvDetails) {
       cvdetailservices.saveCVDetails(cvDetails);
        return "added";
    }

    @GetMapping("/cvDetails/id1")
        public List<CVDetails> getDet(){
            return cvdetailservices.getAllCVDetails();
        }

        @PutMapping("/cvDetails/put/{id}")
        public CVDetails updateDet(@PathVariable Long id,@RequestBody CVDetails cvDetails){
            cvDetails.setId(id);
            return cvdetailservices.UpdateCVDetails(cvDetails );
        }

        @DeleteMapping("/cvDetails/delete/{id}")
        public void deleteDet(@RequestParam Long id){
            cvdetailservices.delete(id);
        }


}
