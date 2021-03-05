package net.utku.bank.db.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.utku.bank.db.model.enumaration.CustomerStatusType;

@Getter @Setter @NoArgsConstructor
public class Customer extends UserEntityBase {

    private CustomerStatusType status;

   // private List<Account> accounts = new ArrayList<>();

}
