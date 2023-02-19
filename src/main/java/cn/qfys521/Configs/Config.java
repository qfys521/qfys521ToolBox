package cn.qfys521.Configs;

import cn.chuanwise.toolkit.preservable.AbstractPreservable;


public class Config extends AbstractPreservable {
    boolean CrazyEnabled = true;

    public boolean isCrazyEnabled() {
        return CrazyEnabled;
    }

    public void setCrazyEnabled(boolean b) {
        this.CrazyEnabled = b;
    }
}
