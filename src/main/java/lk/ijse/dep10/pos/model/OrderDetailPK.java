package lk.ijse.dep10.pos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class OrderDetailPK implements Serializable {
  @Column(name = "id")
    private Integer orderId;
  @Column(name = "code")
    private String itemCode;


}
