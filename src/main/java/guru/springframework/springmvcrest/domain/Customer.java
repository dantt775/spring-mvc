package guru.springframework.springmvcrest.domain;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Customer {

    private Long id;
    private String firstName;
    private String lastName;


}
