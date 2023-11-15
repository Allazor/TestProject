package data;

import com.github.javafaker.Faker;

public class FakeData {
    Faker faker = new Faker();

    public String generateName(){
        return faker.name().firstName();
    }
}

