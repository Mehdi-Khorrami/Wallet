package com.example.wallet.converters;

import com.example.wallet.modals.dto.WalletDto;
import com.example.wallet.modals.entity.WalletEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WalletConvert extends BaseConverter<WalletEntity, WalletDto> {
}
