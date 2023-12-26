package com.example.wallet.modals.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Table(name = "WALLET")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WalletEntity extends AbstractEntity {

    @Column(name = "BALANCE")
    private Long balance;

    @Column(name = "ACCOUNT_NUMBER")
    private Long accountNumber;

    @OneToMany(mappedBy = "wallet", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<WalletTransactionEntity> transactions;
}
