import io.github.humbleui.jwm.App;
import io.github.humbleui.jwm.Event;
import io.github.humbleui.jwm.EventWindowCloseRequest;
import io.github.humbleui.jwm.Window;

import java.util.function.Consumer;

public class EventHandler implements Consumer<Event> {
    public final Window window;

    public EventHandler(Window window) {
        this.window = window;
    }

    @Override
    public void accept(Event event) {
        System.out.println(event);

        if (event instanceof EventWindowCloseRequest) {
            window.close();
            App.terminate();
        }
    }
}
