package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    public TextArea TextPersonal;
    public TextArea TextOverall;
    public GridPane Panel;


    //1. Не нашел как отступы от края сделать.
    //2. Иконку в панели изменить не получилось.
    //3. Не смог снять фокус из общего Текстового поля.


    public void btn1Click(ActionEvent actionEvent) throws IOException {
        if (!(TextPersonal.getText().isEmpty())) {
            TextOverall.appendText("User:" + "\n");
            TextOverall.appendText(TextPersonal.getText() + "\n");
            TextPersonal.clear();
        } else {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample1.fxml"));
                Parent root = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);

                stage.setTitle("Ошибка");
                stage.setScene(new Scene(root, 200,100));
                stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
     }


}
