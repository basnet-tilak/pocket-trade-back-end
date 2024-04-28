package pocket.trade.model.employee;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Employee {
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
    private String address;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private String postalCode;

    /**
     *  Residence country address
     */
    @Column
    private String residenceCountryName;

    @Column(nullable = false)
    private String residenceAddress;

    @Column
    private String residentStreet;

    @Column
    private String residentPostalCode;

    @OneToMany(fetch = FetchType.EAGER)
    protected List<Role> roleList;
}
