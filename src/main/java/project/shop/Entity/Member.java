package project.shop.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="member")
public class Member {

    @Id
    @Column(name = "memberId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String account;

    @Column
    private String password;

    @Column
    private String full_name;

    @Column
    private String phone_number;

    @Column
    private String email;



}
