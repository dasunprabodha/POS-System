package lk.ijse.dep10.pos.model;

import lk.ijse.dep10.pos.model.Item;
import lk.ijse.dep10.pos.model.Order;
import lk.ijse.dep10.pos.model.OrderDetailPK;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_detail")
@Entity
public class OrderDetail {
    @EmbeddedId
    private OrderDetailPK orderDetailPK;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    private Integer qty;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Order order;

    @ManyToOne
    @JoinColumn(name = "item_code", referencedColumnName = "code", insertable = false, updatable = false)
    private Item item;

    public OrderDetail(OrderDetailPK orderDetailPK, BigDecimal unitPrice, Integer qty) {
        this.orderDetailPK = orderDetailPK;
        this.unitPrice = unitPrice;
        this.qty = qty;
    }
}
