package defpackage;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: jk  reason: default package */
/* compiled from: PG */
public final class jk {
    public static je a = new jo((byte) 0);
    public static ArrayList b = new ArrayList();
    private static ThreadLocal c = new ThreadLocal();

    static qr a() {
        WeakReference weakReference = (WeakReference) c.get();
        if (weakReference == null || weakReference.get() == null) {
            weakReference = new WeakReference(new qr());
            c.set(weakReference);
        }
        return (qr) weakReference.get();
    }

    static void a(ViewGroup viewGroup, je jeVar) {
        if (jeVar != null && viewGroup != null) {
            jl jlVar = new jl(jeVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(jlVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(jlVar);
        }
    }
}
