package defpackage;

/* renamed from: pu reason: default package */
/* compiled from: PG */
final class pu implements java.util.concurrent.Callable {
    private final /* synthetic */ android.content.Context a;
    private final /* synthetic */ defpackage.ps b;
    private final /* synthetic */ int c;
    private final /* synthetic */ java.lang.String d;

    pu(android.content.Context context, defpackage.ps psVar, int i, java.lang.String str) {
        this.a = context;
        this.b = psVar;
        this.c = i;
        this.d = str;
    }

    public final /* synthetic */ java.lang.Object call() {
        defpackage.qa a2 = defpackage.pt.a(this.a, this.b, this.c);
        if (a2.a != null) {
            defpackage.pt.a.a(this.d, a2.a);
        }
        return a2;
    }
}
