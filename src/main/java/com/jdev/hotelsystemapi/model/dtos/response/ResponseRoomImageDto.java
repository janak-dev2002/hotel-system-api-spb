package com.jdev.hotelsystemapi.model.dtos.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseRoomImageDto {
    private Long id;
    private String directory;
    private String fileName;
    private String hash;
    private String resourceUrl;
    private String roomId;
}
