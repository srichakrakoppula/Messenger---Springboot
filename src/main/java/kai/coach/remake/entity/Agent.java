package kai.coach.remake.entity;

import javax.persistence.*;

@Entity
@Table(name="AGENTS")
public class Agent {
    @Column(name="ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "FIRSTNAME")
    private String firstName;

    @Column(name = "LASTNAME", nullable = true)
    private String lastName;

}
