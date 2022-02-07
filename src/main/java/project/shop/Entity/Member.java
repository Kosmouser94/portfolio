package project.shop.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
@Table(name="member")
@ToString(exclude = "memberPassword")
public class Member {

    @Id
    @Column(name = "memberId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @NotBlank(message = "아이디는 필수입력 항목입니다.")
    @Size(min = 5, max = 20, message = "아이디가 너무 길거나 짧습니다.")
    private String memberAccount;

    @Column
    @NotBlank(message = "비밀번호는 필수입력 항목입니다.")
    @Size(min = 4, max = 20, message = "비밀번호는 4~20자 사이여야합니다.")
    private String memberPassword;

    @Column
    @NotBlank(message = "이름은 필수입력 항목입니다.")
    @Size(min = 2, max = 20, message = "이름은 2자 이상이여야 합니다")
    private String memberFullName;

    @Column
    @NotBlank(message = "연락처는 필수입력 항목입니다.")
    private String memberPhoneNumber;

    @Column
    @NotBlank(message = "이메일은 필수입력 항목입니다")
    private String memberEmail;


    //회원권한 : 일반회원 / 관리자
    @Column
    private String role;





}
