package com.enigma.wms_api.Service;

import com.enigma.wms_api.Entity.Branch;
import com.enigma.wms_api.Model.BranchRequest;
import com.enigma.wms_api.Model.BranchResponse;
import com.enigma.wms_api.Repository.BranchRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BranchService {
    @Autowired
    private BranchRepository branchRepository;
    @Transactional
    public  BranchResponse create(@RequestBody BranchRequest request){

        Branch branch = new Branch();
        branch.setBranchName(request.getBranchName());
        branch.setBranchCode(request.getBranchCode());
        branch.setAddress(request.getAddress());
        branch.setPhoneNumber(request.getPhoneNumber());

        branchRepository.save(branch);
        return BranchResponse.builder()
                .branchName(branch.getBranchName())
                .branchCode(branch.getBranchCode())
                .address(branch.getAddress())
                .phoneNumber(branch.getPhoneNumber())
                .build();
    }
}
