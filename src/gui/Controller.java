package gui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    private Button btClienteMain;
    @FXML
    private Button btFiadoMain;
    @FXML
    private AnchorPane pane;

    @FXML
    public void abrirTelaClinte() {
        pane.getChildren().clear();
        pane.getChildren().add(getNode("/gui/view/TelaCliente.fxml"));

    }

    public Node getNode(String node) {
        Node no = null;
        try {
            no = FXMLLoader.load(getClass().getResource(node));
        } catch (Exception e) {

        }
        return no;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
