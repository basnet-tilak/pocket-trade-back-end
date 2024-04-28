package pocket.trade.model.customer;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String firstName;

    @Column
    private String middleName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String contact;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String birthCountryName;

    @Column(nullable = false)
    private String birthCountryAddress;

    @Column(nullable = false)
    private String birthCountryStreet;

    @Column(nullable = false)
    private String birthCountryPostalCode;

    @Column
    private String residenceCountryName;

    @Column
    private String residenceCountryAddress;

    @Column
    private String residenceCountryStreet;

    @Column
    private String residenceCountryPostalCode;

}
