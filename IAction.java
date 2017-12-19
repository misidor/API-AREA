public interface IAction extends EventHandler
{
    @Override
    void onEvent(Object o, EventArgs e);
    void setName(String name);
    String getName();
}
