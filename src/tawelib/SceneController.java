package tawelib;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//SceneController was made for changing scenes but I ran out of time so,so far it is a resource class
//and I should call it global session variables
public class SceneController {
    public static String USER_USERNAME;
    // Login Window
    public static final String LOGIN_SCREEN="LoginScreen.fxml";
    public static final String LOGIN_WINDOW_TITLE = "Login";
    public static final int LOGIN_WINDOW_WIDTH = 250;
    public static final int LOGIN_WINDOW_HEIGHT = 250;

    //Dashboard
    public static final String DASHBOARD_USER = "RootDashboard.fxml";
    public static final String DASHBOARD_LIBRARIAN = "RootDashboard.fxml";
    public static final int DASHBOARD_WINDOW_WIDTH = 600;
    public static final int DASHBOARD_WINDOW_HEIGHT = 600;
    public static final String DASHBOARD_USER_WINDOW_TITLE = "User Dashboard";
    public static final String DASHBOARD_LIBRARIAN_WINDOW_TITLE = "Librarian Dashboard";

    //Transaction Window
    public static final String TRANSACTION_WINDOW="TransactionHistory.fxml";
    public static final int TRANSACTION_WINDOW_HEIGHT = 300;
    public static final int TRANSACTION_WINDOW_WIDTH = 600;
    public static final String TRANSACTION_WINDOW_TITLE="Transaction History";

    //Resource View Window
    public static final String RESOURCE_VIEW="ViewResource.fxml";
    public static final int RESOURCE_VIEW_HEIGHT = 300;
    public static final int RESOURCE_VIEW_WIDTH = 600;
    public static final String RESOURCE_VIEW_TITLE="View Resource";

}
