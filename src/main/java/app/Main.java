package app;

import javax.swing.*;
import java.awt.*;

/**
 * The Main class of our application.
 */
public class Main {
    /**
     * Builds and runs the CA architecture of the application.
     * @param args unused arguments
     */
    public static void main(String[] args) {
        final AppBuilder appBuilder = new AppBuilder();
        final JFrame application = appBuilder
                                            .addLoginView()
                                            .addSignupView()
                                            .addLoggedInView()
                                            .addSignupUseCase()
                                            .addLoginUseCase()
                                            .addChangePasswordUseCase()
                                            .addLogoutUseCase()

                                            .build();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        application.pack();

        application.setSize(screenSize.width/2, screenSize.height/2);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setIconImage(new ImageIcon("src/main/resources/icon.png").getImage());


        application.setVisible(true);
    }
}
