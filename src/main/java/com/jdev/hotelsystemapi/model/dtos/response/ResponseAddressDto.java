package com.jdev.hotelsystemapi.model.dtos.response;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseAddressDto {
    private String addressLine;
    private String city;
    private String country;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String branchId;
}
