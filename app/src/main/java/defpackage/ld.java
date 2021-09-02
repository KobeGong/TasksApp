package defpackage;

/* renamed from: ld reason: default package */
/* compiled from: PG */
final class ld extends FragmentContainer {
    private final /* synthetic */ Fragment a;

    ld(Fragment lcVar) {
        this.a = lcVar;
    }

    public final android.view.View onFindViewById(int i) {
        if (this.a.J != null) {
            return this.a.J.findViewById(i);
        }
        throw new java.lang.IllegalStateException("Fragment does not have a view");
    }

    public final boolean onHasView() {
        return this.a.J != null;
    }

    public final Fragment instantiate(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        return this.a.u.instantiate(context, str, bundle);
    }
}
