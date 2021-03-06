package com.teso.AnaTransferserver.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="promoteCodes")
public class PromoteCode {
    @Id
    private Long promoteCodeId;

    private String promoteCodeName;
    private double promoteCodeDiscount;
    private Date expectDate;
}
