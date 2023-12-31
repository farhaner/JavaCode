package com.enigma.wms_api.Controller;

import com.enigma.wms_api.Model.BranchRequest;
import com.enigma.wms_api.Model.BranchResponse;
import com.enigma.wms_api.Service.BranchService;
import com.enigma.wms_api.WebResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BranchController {
    @Autowired
    private BranchService branchService;
    @PostMapping(
            path = "api/branch",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<BranchResponse> Create(@RequestBody BranchRequest request){
        BranchResponse branchResponse = branchService.create(request);
//        System.out.println(branchResponse);
        return WebResponse.<BranchResponse>builder()
                .data(branchResponse)
                .build();
    }
}
