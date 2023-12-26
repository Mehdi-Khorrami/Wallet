package com.example.wallet.converters;

import com.example.wallet.modals.dto.WalletTransactionDto;
import com.example.wallet.modals.entity.WalletTransactionEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WalletTransactionConvert extends BaseConverter<WalletTransactionEntity, WalletTransactionDto> {
}
