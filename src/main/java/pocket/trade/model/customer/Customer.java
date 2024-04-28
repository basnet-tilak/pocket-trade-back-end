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
    @GeneratedValue
    @Column(nullable = false)
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

    /**
     *  Birth country address
     */
    @Column(nullable = false)
    private String birthCountryName;

    @Column(nullable = false)
    private String birthCountCityAddress;

    @Column(nullable = false)
    private String birthCountryStreet;

    @Column(nullable = false)
    private String birthCountryPostalCode;

    /**
     *  Residence country address
     */
    @Column
    private String residenceCountryName;

    @Column
    private String residenceCountryCityAddress;

    @Column
    private String residentStreet;

    @Column
    private String residentPostalCode;
}
