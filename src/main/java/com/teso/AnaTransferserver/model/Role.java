package com.teso.AnaTransferserver.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="roles")
public class Role {
    @Id
    private Long roleId;
    @Indexed(unique = true, direction = IndexDirection.DESCENDING, dropDups = true)
    private String role;
}
