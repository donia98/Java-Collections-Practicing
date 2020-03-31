/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.converter.NumberStringConverter;

/**
 *
 * @author nadoo
 */
public class JavaCollections extends Application {

    private Button addStd;
    private Button viewStd;

    public class Student {

        public int id;
        public String name;
        public String major;
        public double grade;
        List datalist = new ArrayList<>();

        public String stdData(int stdid, String stdname, String stdmajor, double stdgrade) {
            datalist.add(1, stdid);
            datalist.add(2, stdname);
            datalist.add(3, stdmajor);
            datalist.add(4, stdgrade);
            System.out.println(datalist.toString());
            return datalist.toString();

        }
    }

    @Override
    public void start(Stage primaryStage) {
        Button addStd = new Button("Add Student");
        Button viewStd = new Button("View Students");
        VBox vBox = new VBox(20, addStd, viewStd);
        vBox.setPadding(new Insets(40));
        vBox.setAlignment(Pos.CENTER);

        addStd.setOnAction(event -> {
            showStdPage();
        });

        Scene scene = new Scene(vBox, 400, 400);
        primaryStage.setTitle("Options Page");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void showStdPage() {
        Stage stage = new Stage();

        Text title = new Text("Student Data ");
        title.setFont(new Font(18));

        Label id = new Label("Id:    ");
        TextField idField = new TextField();
//        idField.setTextFormatter(new TextFormatter<>(new NumberStringConverter()));

        Label name = new Label("Name: ");
        TextField nameField = new TextField();

        Label major = new Label("Major: ");
        TextField majorField = new TextField();

        Label grade = new Label("Grade: ");
        TextField gradeField = new TextField();
//        gradeField.setTextFormatter(new TextFormatter<>(new NumberStringConverter()));

        Button add = new Button("Add");
        Button reset = new Button("Reset");
        Button exit = new Button("Exit");

        HBox hbox1 = new HBox(title);
        HBox hbox2 = new HBox(id, idField);
        HBox hbox3 = new HBox(name, nameField);
        HBox hbox4 = new HBox(major, majorField);
        HBox hbox5 = new HBox(grade, gradeField);
        HBox hbox6 = new HBox(add, reset, exit);

        ListView listViewData = new ListView<>();

        listViewData.setStyle("fx-min-width:500px;");
        VBox vbox1 = new VBox(hbox1, hbox2, hbox3, hbox4, hbox5, hbox6);
        VBox vbox2 = new VBox(listViewData);
        vbox1.setPadding(new Insets(10));
        vbox1.setAlignment(Pos.CENTER);
        vbox2.setPadding(new Insets(10));
        vbox2.setAlignment(Pos.CENTER);

        add.setOnAction(e -> {

            if (!idField.getText().equals(0) && !nameField.getText().equals("")
                    && !majorField.getText().equals("") && !gradeField.getText().equals(0)) {
                Student std = new Student();
                listViewData.getItems().add(std.stdData(Integer.parseInt(idField.getText()), nameField.getText(), majorField.getText(), Double.parseDouble(gradeField.getText())));

            }
        });

        reset.setOnAction(e -> {
            idField.clear();
            nameField.clear();
            majorField.clear();
            gradeField.clear();
        });

        exit.setOnAction(e -> {
            stage.close();
        });

        HBox hbox = new HBox(40, vbox1, vbox2);
        Scene scene = new Scene(hbox, 700, 500);
        stage.setTitle("Student Entry Page");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
