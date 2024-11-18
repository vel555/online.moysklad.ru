package model;

import com.github.javafaker.Faker;

public class AddGoodBuilder {

    static Faker faker = new Faker();

    public static AddGood get(){

        return AddGood.builder()
                .productName(faker.name().name())
                .item(faker.number().digits(8))
                .externalCode(faker.number().digits(6))
                .code(faker.number().digits(5))
                .weight(faker.number().digits(2))
                .volume(faker.number().digits(3))
                .build();
    }
}
