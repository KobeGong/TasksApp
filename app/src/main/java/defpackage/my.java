package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: my  reason: default package */
/* compiled from: PG */
public final class my implements Runnable {
    private final /* synthetic */ ArrayList a;
    private final /* synthetic */ Map b;

    my(ArrayList arrayList, Map map) {
        this.a = arrayList;
        this.b = map;
    }

    public final void run() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.a.get(i);
            sn.a(view, (String) this.b.get(sn.a.t(view)));
        }
    }
}
