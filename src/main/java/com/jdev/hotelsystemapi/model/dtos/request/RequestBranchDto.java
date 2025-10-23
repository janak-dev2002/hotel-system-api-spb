package com.jdev.hotelsystemapi.model.dtos.request;

import com.jdev.hotelsystemapi.enums.BranchType;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestBranchDto {
    private String branchName;
    private BranchType branchType;
    private int roomCount;
    private String hotelId;

}
