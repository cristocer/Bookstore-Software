package tawelib;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import javafx.stage.Stage;
public class DashboardController extends Controller{
    LoginController loginController;

    @FXML
    private ListView<String> resourcesList;
    @FXML
    private Text user_id;
    @FXML
    private VBox adminVBox;

    @FXML
    void logoutButton(ActionEvent event) throws Exception{
        logoutHandling();
    }
    @FXML
    void transactionHistoryButton(ActionEvent event) {
        transactionHandling();
    }

    /**
     * Initializes the GUI, prompts user for Login...ToDO
     */
    public void initialize(){
        populateList();
    }

// Just until i can fetch from db
    private void populateList(){ // Just for testing
        for(int x=0; x<1000; x++){
            resourcesList.getItems().add("lol");
        }
    }

    private void logoutHandling(){

        Stage stage = (Stage) adminVBox.getScene().getWindow();
        stage.close();
        try{stage.setScene(new Scene(FXMLLoader.load(getClass().getResource(SceneController.LOGIN_SCREEN)), 600, 600));
        stage.show();
        }
        catch (IOException e) {
                    e.printStackTrace();
                    // Quit the program (with an error code)
                    System.exit(-1);
            }
    }
    //just to be clear so my work doesn't get immediatly deleted this time
    //So i experinced some problems with creating new windows and make the flow of the application to work (again if you want me to explain JUST ASK)
    //plus some annoying context and nullpointer exception (I bet you can guess why)
    //so i decided for now to change scenes directly in the method/button/controller that actually requires the action
    //and keep the window class for pop-up windows or let's say new temporary windows that require a selection from a list for example.
    //like here in the example of transactionHandling.
    //So I am open to proposals and to integrate more the window class if you want and if we can make it work propely
    private void transactionHandling(){
        Window<TransactionController> transactionWindow = new Window<>("TransactionHistory.fxml",600,400,"Transaction History");
        transactionWindow.makeModal();
        transactionWindow.showAndWait();
    }
    @Override
    public void close(){
        System.exit(0);
    }
}

