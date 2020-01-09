package ua.epam.javacore.factoryMethod;

public class Auto {
    public static void main(String[] args) {
        ProducerFactory producerFactory = createProducerByCountry("german");
        Producer producer = producerFactory.createProducer();
        producer.buildCar();
    }

    static ProducerFactory createProducerByCountry(String country) {
        if(country.equalsIgnoreCase("german")) {
            return new GermanProducerFactory();
        }else if (country.equalsIgnoreCase("america")) {
            return new AmericanProducerFactory();
        }else {
            throw new RuntimeException(country + "is unknown country");
        }
    }

}
