package defpackage;

/* renamed from: he reason: default package */
/* compiled from: PG */
public final class he implements java.util.Comparator {
    public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View view = (android.view.View) obj2;
        float A = ViewCompat.a.A((android.view.View) obj);
        float A2 = ViewCompat.a.A(view);
        if (A > A2) {
            return -1;
        }
        if (A < A2) {
            return 1;
        }
        return 0;
    }
}
