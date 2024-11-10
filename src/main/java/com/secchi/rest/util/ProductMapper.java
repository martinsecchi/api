package com.secchi.rest.util;

import com.secchi.rest.controller.dto.MakerDTO;
import com.secchi.rest.controller.dto.ProductDTO;
import com.secchi.rest.entities.Maker;
import com.secchi.rest.entities.Product;
import java.util.function.Function;

public class ProductMapper {

    public static final Function<Product, ProductDTO> toDTO = entity -> {
        if (entity == null) return null;
        return new ProductDTO(new MakerDTO(entity.getMaker().getId()),
                entity.getPrice(),
                entity.getName(),
                entity.getId());
    };


    public static final Function<ProductDTO, Product> toEntity = dto -> {
        if (dto == null) return null;
        return new Product(dto.getId(), dto.getPrice(),new Maker(dto.getMaker().getId()), dto.getName());

    };

  }
