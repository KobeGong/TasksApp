package defpackage;

import android.view.View;
import java.util.Comparator;

/* renamed from: he  reason: default package */
/* compiled from: PG */
public final class he implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        float A = sn.a.A((View) obj);
        float A2 = sn.a.A((View) obj2);
        if (A > A2) {
            return -1;
        }
        if (A < A2) {
            return 1;
        }
        return 0;
    }
}
