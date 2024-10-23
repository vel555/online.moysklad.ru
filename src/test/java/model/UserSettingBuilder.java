package model;

import com.github.javafaker.Faker;

public class UserSettingBuilder {

    static Faker faker = new Faker();

    public static UserSettings get(){
        return UserSettings.builder()
                .name(faker.name().name())
                .patronymic(faker.cat().name())
                .lastName(faker.name().lastName())
                .phone(faker.phoneNumber().subscriberNumber(9))
                .position(faker.hobbit().character())
                .build();
    }
}
