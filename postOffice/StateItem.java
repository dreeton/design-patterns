package postOffice;

public interface StateItem {
    public void applyStateItem(ClientSpec clientSpec);
    public String getStateItem();
}
