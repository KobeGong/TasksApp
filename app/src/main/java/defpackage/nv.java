package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;

/* renamed from: nv  reason: default package */
/* compiled from: PG */
public class nv extends Activity implements y {
    public z g = new z(this);

    public nv() {
        new ri();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new ai(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.g.a(w.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Override // defpackage.y
    public final u a() {
        return this.g;
    }
}
