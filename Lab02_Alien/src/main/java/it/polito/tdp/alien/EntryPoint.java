package it.polito.tdp.alien;

import javafx.application.Application;
import static javafx.application.Application.launch;

import it.polito.tdp.alien.model.AlienDictionary;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class EntryPoint extends Application {

    @Override
    public void start(Stage stage) throws Exception {
    	/*
    	 * cambio il caricamento creando l'oggetto loader e chiamando load su di esso 
    	 * per aver la possibilità di richiamare direttamente il controller
    	 * e settare il model con il metodo generato nel FXMLcontroller 
    	 */
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Scene.fxml"));
        Parent root = loader.load();
        FXMLController controller= loader.getController();
        
        AlienDictionary model = new AlienDictionary();
        controller.setModel(model);
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");
        
        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
