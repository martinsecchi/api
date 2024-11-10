package com.secchi.rest.util;

import com.secchi.rest.controller.dto.MakerDTO;
import com.secchi.rest.controller.dto.ProductDTO;
import com.secchi.rest.entities.Maker;
import com.secchi.rest.entities.Product;

import java.util.List;
import java.util.function.Function;

public class MakerMapper {

    public static final Function<MakerDTO, Maker> toEntity = dto -> {
        if (dto == null) return null;
        List<Product> l = dto.getProductList() != null ? dto.getProductList().stream().map(ProductMapper.toEntity).toList() : null;
        return new Maker(dto.getId(), dto.getName(), l);
    };

    public static final Function<Maker, MakerDTO> toDto = entity -> {
        if (entity == null) return null;
        List<ProductDTO> l = entity.getProductList() != null ? entity.getProductList().stream().map(ProductMapper.toDTO).toList() : null;
        return new MakerDTO(entity.getId(), entity.getName(), l);
    };

}
