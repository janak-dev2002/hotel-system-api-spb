package com.jdev.hotelsystemapi.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name="room_image")
public class RoomImage {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

  /*  @Lob
    @Column(name="file_name")
    private byte[] fileName;

    @Column(name="resource_url")
    private byte[] resourceUrl;

    @Column(name="directory")
    private byte[] directory;

    @Column(name="hash")
    private byte[] hash;  ------ ** Dont need to repeat this, you can embed this*/

    @Embedded
    private FileFormatter fileFormatter;

    @ManyToOne()
    @JoinColumn(name="room_id")
    private Room room;

}
