package kitchenpos.product.dto;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import kitchenpos.product.domain.Product;

public class ProductResponseTest {

    public static ProductResponse 상품_응답_객체_생성(Long id, String name, BigDecimal price) {
        return new ProductResponse.Builder()
                .id(id)
                .name(name)
                .price(price)
                .build();
    }

    public static ProductResponse 상품_응답_객체_생성(Product product) {
        return new ProductResponse.Builder()
                .id(product.getId())
                .name(product.getName())
                .price(product.getPrice())
                .build();
    }

    public static List<ProductResponse> 상품_응답_객체들_생성(Product... products) {
        return Arrays.stream(products)
                .map(ProductResponseTest::상품_응답_객체_생성)
                .collect(Collectors.toList());
    }
}