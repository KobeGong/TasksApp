package defpackage;

import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: rs  reason: default package */
/* compiled from: PG */
public abstract class rs {
    public rt a;

    public abstract View a();

    public View a(MenuItem menuItem) {
        return a();
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return true;
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public void a(SubMenu subMenu) {
    }

    public void a(rt rtVar) {
        if (this.a != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.a = rtVar;
    }
}
