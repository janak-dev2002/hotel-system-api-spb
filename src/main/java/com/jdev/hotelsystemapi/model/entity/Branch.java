package com.jdev.hotelsystemapi.model.entity;


import com.jdev.hotelsystemapi.enums.BranchType;
import jakarta.persistence.*;

@Entity
@Table(name="branch")
public class Branch {

    @Id
    @Column(name = "branch_id", length=80)
    private String branchId;

    @Column(name = "room_count")
    private int roomCount;

    @Enumerated(EnumType.STRING)
    @Column(name = "branch_type", nullable = false)
    private BranchType branchType;

    @Column(name = "branch_name", nullable = false)
    private String branchName;

}
