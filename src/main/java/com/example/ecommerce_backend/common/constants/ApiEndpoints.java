package com.example.ecommerce_backend.common.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ApiEndpoints {

    private static final String API_VERSION="/api/v1";
    private static final String BASE_ADMIN="/admin";


    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static  class ProductAdmin {
        public static final String BASE_PRODUCT_ADMIN=API_VERSION + BASE_ADMIN +"/products";
    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class ProductPublic
    {
        public static final String BASE_PRODUCT_PUBLIC=API_VERSION + "/products";
    }



    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class CategoryAdmin{
        public static final String BASE_CATEGORY_ADMIN=API_VERSION + BASE_ADMIN +"/categories";
    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class CategoryPublic{
        public static final String BASE_CATEGORY_PUBLIC=API_VERSION + "/categories";
    }



    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class InventoryAdmin{
        public static final String BASE_INVENTORY_ADMIN=API_VERSION + BASE_ADMIN + "/inventory";
    }
}
