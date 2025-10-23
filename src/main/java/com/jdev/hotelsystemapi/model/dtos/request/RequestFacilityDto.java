package com.jdev.hotelsystemapi.model.dtos.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestFacilityDto {
    private String name;
    private String roomId;
}
