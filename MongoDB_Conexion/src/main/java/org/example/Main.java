package org.example;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Mongo");
        frame.setContentPane(new org.example.Calif().Calificaciones);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(480,560);
        frame.setVisible(true);


        /*MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");

        MongoDatabase database = mongoClient.getDatabase("mybd2");
        MongoCollection<Document> collection = database.getCollection("mycollection");

        Document document = new Document
                ( "name","Alejandro Minga")
                .append("age", 20)
                .append("city", "Quito")
                .append("country","Ecuador");

        collection.insertOne(document);
        System.out.println("Insertados");*/

    }
}
