package project.shop.Entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Entity
@Table(name = "csBoard")
public class CSBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long csBoardNo;

    @NotBlank
    @Column
    private String csBoardTitle;

    @NotBlank
    @Column
    private String writer;

    @CreationTimestamp
    private LocalDateTime regDate;

    @Lob
    private String csBoardContent;

//    @NotBlank
//    @Column
//    private int csBoardViewCount;




}
