package com.enigma.wms_api.Model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BranchRequest {

    @NotBlank
    private String branchName;
    @NotBlank
    private Integer branchCode;
    @NotBlank
    private String address;
    @NotBlank
    private Integer phoneNumber;

}
