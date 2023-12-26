package com.example.wallet.modals.entity;

import com.example.wallet.modals.enums.DealType;
import com.example.wallet.modals.enums.TrackingStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Entity
@Table(name = "TRANSACTION")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WalletTransactionEntity extends AbstractEntity {

    @Column(name = "DATE")
    private Date date;

    @Column(name = "AMOUNT")
    private Long amount;

    @Column(unique = true)
    private String trackingId;

    @Enumerated(EnumType.STRING)
    private TrackingStatus trackingStatus ;

    @Enumerated(EnumType.STRING)
    private DealType dealType;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private WalletEntity wallet;

}
