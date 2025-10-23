package com.jdev.hotelsystemapi.model.dtos.response;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseRoomDto {
    private String roomId;
    private int bedCount;
    private boolean isAvailable;
    private BigDecimal price;
    private String roomNumber;
    private String roomType;
    private String branchId;
    // facilities
    private List<ResponseFacilityDto>  facilities;
    // room images
    private List<ResponseRoomImageDto>  images;
}
