package com.dcis.frontier.test;
import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Demo16 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        //创建buttion类
        Button button = new Button();
        button.setCursor(Cursor.MOVE);//设置鼠标移动到button按钮上的样式
        button.setText("Button");
        button.setPrefHeight(30);
        button.setPrefWidth(150);

        //创建Group类
        Group group = new Group();
        group.getChildren().add(button);
        //创建Scene --场景
        Scene scene = new Scene(group);

        scene.setCursor(Cursor.CLOSED_HAND);//设置鼠标移动到scene场景里面的样式

        primaryStage.setScene(scene);
        //设置stage的宽度 高度
        primaryStage.setHeight(500);
        primaryStage.setWidth(500);
        primaryStage.show();


    }

    public void getStart(){
        launch();
    }

    public static void main(String[] args) {
        launch(args);
    }
}