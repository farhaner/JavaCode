package com.enigma.wms_api.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BranchResponse {

    private Long id;

    private String branchName;

    private Integer branchCode;

    private String address;

    private Integer phoneNumber;
}
