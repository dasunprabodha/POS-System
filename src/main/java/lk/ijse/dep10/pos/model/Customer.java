package lk.ijse.dep10.pos.model;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "customer")
@ToString(exclude = "orderList")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "Name can't be empty or null")
    @Pattern(regexp = "[A-Za-z ]+", message = "Invalid name")
    private String name;
    @NotBlank(message = "Address can't be empty or null")
    @Length(min = 3, message = "Invalid address")
    private String address;
    @NotBlank(message = "Contact number can't be empty or null")
    @Pattern(regexp = "^\\d{3}-\\d{7}$", message = "Invalid contact number")
    private String contact;
    public Customer(String name, String address, String contact) {
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

}
