import java.util.List;

public interface ITrigger
{
    void setEventHandler(EventHandler t_handler);
    List<EventHandler> getEventHandler();
    void checkTrigger();
    void setName(String name);
    String getName();
}
