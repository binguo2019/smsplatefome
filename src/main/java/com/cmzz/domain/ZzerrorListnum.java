package com.cmzz.domain;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class ZzerrorListnum implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "ACTIVITY_ID")
    private Long activityId;
    @Column(name = "NUM_CODE")
    private String numCode;
    @Column(name = "COUNTY")
    private String county;
    @Column(name = "COMMUNTIY")
    private String communtiy;
    @Column(name = "CREATEDATE")
    private String createDate;
    @Column(name = "CREATOR")
    private String creator;
    @Column(name = "CONTENT")
    private String content;



}

