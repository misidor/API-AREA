import java.util.List;

/*
    Need to be threaded extend runnable ?
 */
public interface IModule
{
    boolean logIn(String login, String pass);
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
