package org.example;

import org.example.JPA.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws SQLException {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu-petstore");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();


        entityManager.persist(product1);
        entityManager.persist(product2);
        entityManager.persist(product3);

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        entityManager.persist(cat1);
        entityManager.persist(cat2);
        entityManager.persist(cat3);

        Fish fish1 = new Fish();
        Fish fish2 = new Fish();
        Fish fish3 = new Fish();

        entityManager.persist(fish1);
        entityManager.persist(fish2);
        entityManager.persist(fish3);

        PetStore petStore1 = new PetStore();
        PetStore petStore2 = new PetStore();
        PetStore petStore3 = new PetStore();

        entityManager.persist(petStore1);
        entityManager.persist(petStore2);
        entityManager.persist(petStore3);

        Address address1 = new Address();
        Address address2 = new Address();
        Address address3 = new Address();

        entityManager.persist(address1);
        entityManager.persist(address2);
        entityManager.persist(address3);


        entityTransaction.commit();

        Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3307/petstore", "root", "");

        Statement statement = connection.createStatement();
        //ResultSet resultSet = statement.executeQuery("select * from animal inner join petstore. on animal.petstore.id = petstore.id");

        entityManager.close();
        entityManagerFactory.close();
    }
}
