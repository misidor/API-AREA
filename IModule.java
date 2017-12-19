import java.util.List;

/*
    Need to be threaded extend runnable ?
 */
public interface IModule
{
    boolean logIn(String login, String pass);
    void checkTriggers();
    List<IAction> getActions();
    void setActions(List<IAction> m_actions);
    List<ITrigger> getTriggers();
    void setTriggers(List<ITrigger> m_triggers);
    String getDisplayName();
    void setDisplayName(String m_displayName);
    void setTimeOut(long ms);
    long getTimeOut();
}
