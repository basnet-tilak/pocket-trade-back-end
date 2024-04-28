package pocket.trade.model.employee;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Employee {
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

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role = Role.User;

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
