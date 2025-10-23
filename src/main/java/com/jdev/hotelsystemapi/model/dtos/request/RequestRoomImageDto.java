package com.jdev.hotelsystemapi.model.dtos.request;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestRoomImageDto {
    private MultipartFile file;
    private String roomId;
}
