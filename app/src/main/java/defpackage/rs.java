package defpackage;

/* renamed from: rs reason: default package */
/* compiled from: PG */
public abstract class rs {
    public defpackage.rt a;

    public abstract android.view.View a();

    public android.view.View a(android.view.MenuItem menuItem) {
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

    public void a(android.view.SubMenu subMenu) {
    }

    public void a(defpackage.rt rtVar) {
        if (this.a != null) {
            android.util.Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.a = rtVar;
    }
}
