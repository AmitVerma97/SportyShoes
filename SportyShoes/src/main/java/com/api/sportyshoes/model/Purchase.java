package com.api.sportyshoes.model;

//import com.api.sportyshoes.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Purchase {

    private Customer customer;
}