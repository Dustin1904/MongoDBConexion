package org.example;
import com.mongodb.client.*;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calif {
    JPanel Calificaciones;
    private JTextField nombre;
    private JTextField nota1;
    private JTextField textField3;
    private JLabel nota2;
    private JButton button1;
    private JButton button2;

    public Calif() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");

                MongoDatabase database = mongoClient.getDatabase("mybd2");
                MongoCollection<Document> collection = database.getCollection("mycollection");

                Document document = new Document
                        ( "Nombre",nombre.getText())
                        .append("Nota 1", Double.parseDouble(nota1.getText()))
                        .append("Nota 2", Double.parseDouble(nota2.getText()));
                collection.insertOne(document);
                System.out.println("Insertados");
            }
        });
    }
}
