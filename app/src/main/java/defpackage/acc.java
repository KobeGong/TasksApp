package defpackage;

/* renamed from: acc reason: default package */
/* compiled from: PG */
final class acc extends defpackage.ado {
    private final /* synthetic */ defpackage.ace c;
    private final /* synthetic */ defpackage.acb d;

    acc(defpackage.acb acb, android.view.View view, defpackage.ace ace) {
        this.d = acb;
        this.c = ace;
        super(view);
    }

    public final defpackage.zz a() {
        return this.c;
    }

    public final boolean b() {
        if (!this.d.a.r.isShowing()) {
            this.d.a.d();
        }
        return true;
    }
}
