package defpackage;

/* renamed from: jk reason: default package */
/* compiled from: PG */
public final class jk {
    public static defpackage.je a = new defpackage.jo(0);
    public static java.util.ArrayList b = new java.util.ArrayList();
    private static java.lang.ThreadLocal c = new java.lang.ThreadLocal();

    static defpackage.qr a() {
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) c.get();
        if (weakReference == null || weakReference.get() == null) {
            weakReference = new java.lang.ref.WeakReference(new defpackage.qr());
            c.set(weakReference);
        }
        return (defpackage.qr) weakReference.get();
    }

    static void a(android.view.ViewGroup viewGroup, defpackage.je jeVar) {
        if (jeVar != null && viewGroup != null) {
            defpackage.jl jlVar = new defpackage.jl(jeVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(jlVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(jlVar);
        }
    }
}
