import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Cenexion {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String cmdStr = "cmd /c start iexplore https://sites.google.com/view/leader-films?pli=1";
            try {
                Runtime.getRuntime().exec(cmdStr);
            } catch (IOException e) {
                e.printStackTrace();
            }
            /*try {
                Desktop.getDesktop().browse(new URI("https://sites.google.com/view/leader-films?pli=1"));
            } catch (IOException | URISyntaxException e) {
                throw new RuntimeException(e);


             */
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
