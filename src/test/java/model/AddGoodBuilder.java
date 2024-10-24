package model;

import com.github.javafaker.Faker;

public class AddGoodBuilder {

    static Faker faker = new Faker();

    public static AddGood get(){

        return AddGood.builder()
                .Item(faker.number().randomNumber(8))
                .ExternalCode(faker.number().randomNumber(6))
                .Code(faker.number().randomNumber(5))
                .Weight(faker.number().randomNumber(2))
                .Volume(faker.number().randomNumber(2))
                .build();
    }
}
