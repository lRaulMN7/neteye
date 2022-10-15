import io.github.humbleui.jwm.App;
import io.github.humbleui.jwm.Window;

public class Main {
    public static void main(String[] args) {
        App.start(() -> {
            Window window = App.makeWindow();
            window.setTitle("NetEye");

            window.setEventListener(new EventHandler(window));
            window.setVisible(true);
        });
    }
}
