package project.shop.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "item")
@Getter
@Setter
@ToString
public class Item {

    @Id
    @Column(name = "itemId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String item_name;
    private int item_price;
    private int item_stock;
    private String item_info;
    private int item_category;
    private String item_file_name;




}
