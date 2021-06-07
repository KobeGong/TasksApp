package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: mx  reason: default package */
/* compiled from: PG */
public final class mx implements Runnable {
    private final /* synthetic */ ArrayList a;
    private final /* synthetic */ Map b;

    mx(ArrayList arrayList, Map map) {
        this.a = arrayList;
        this.b = map;
    }

    public final void run() {
        String str;
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.a.get(i);
            String t = sn.a.t(view);
            if (t != null) {
                Iterator it = this.b.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (t.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                sn.a(view, str);
            }
        }
    }
}
