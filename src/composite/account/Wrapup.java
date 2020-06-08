package composite.account;

import java.util.ArrayList;
import java.util.List;

public class Wrapup extends AccountComponent {
    private String _name;
    private List<AccountComponent> accountComponents = new ArrayList<AccountComponent>();

    public Wrapup(String name) {
        _name = name;
    }

    @Override
    public int sum() {
        int summary = 0;
        for(AccountComponent accountComponent: accountComponents) {
            summary += accountComponent.sum();
        }
        System.out.println(name() + ":" + summary);
        return summary;
    }

    public String name() {
        return _name;
    }

    public void add(AccountComponent accountComponent) {
        accountComponents.add(accountComponent);
    }

    public void remove(AccountComponent accountComponent) {
        accountComponents.remove(accountComponent);
    }
}
