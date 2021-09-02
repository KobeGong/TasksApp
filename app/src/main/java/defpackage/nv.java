package defpackage;

/* renamed from: nv reason: default package */
/* compiled from: PG */
public class nv extends android.app.Activity implements LifecycleOwner {
    public defpackage.z g = new defpackage.z(this);

    public nv() {
        new defpackage.ri();
    }

    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.app.FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new defpackage.ai(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public void onSaveInstanceState(android.os.Bundle bundle) {
        this.g.a(State.CREATED);
        super.onSaveInstanceState(bundle);
    }

    public final Lifecycle getLifecycle() {
        return this.g;
    }
}
