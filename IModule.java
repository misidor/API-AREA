import java.util.List;


/*
    Module must be in a Module Package and named as ServiceModule
 */
public interface IModule
{
    boolean logIn(String login, String pass);
    void start();
    void join();
    void checkTriggers();
    List<IAction> getActions();
    void setActions(List<IAction> t_actions);
    void addAction(IAction t_action);
    List<ITrigger> getTriggers();
    void setTriggers(List<ITrigger> t_triggers);
    void addTrigger(ITrigger t_trigger);
    String getDisplayName();
    void setDisplayName(String t_displayName);
    void setTimeOut(long ms);
    long getTimeOut();
}
