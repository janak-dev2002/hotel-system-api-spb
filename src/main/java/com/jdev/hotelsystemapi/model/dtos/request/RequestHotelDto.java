package com.jdev.hotelsystemapi.model.dtos.request;

import lombok.*;

import java.math.BigDecimal;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestHotelDto {
    private String description;
    private String hotelName;
    private int starRating;
    private BigDecimal startingFrom;
}
