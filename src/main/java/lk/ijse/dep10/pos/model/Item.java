package lk.ijse.dep10.pos.model;

import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "item")
@Entity

public class Item {
    @Id
    @Column(
            name = "code"
    )
    private String code;
    @Column(
            name = "description"
    )
    private String description;
    @Column(
            name = "qty"
    )
    private Integer qty;
    @Column(
            name = "unitPrice"
    )
    private BigDecimal unitPrice;

}
