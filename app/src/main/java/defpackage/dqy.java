package defpackage;

/* renamed from: dqy reason: default package */
/* compiled from: PG */
public abstract class dqy implements defpackage.dzp {
    public abstract defpackage.dri c();

    /* access modifiers changed from: protected */
    public abstract defpackage.dva d();

    public final void a(java.io.InputStream inputStream) {
        defpackage.cld.a((java.lang.Object) inputStream, (java.lang.Object) "message");
        try {
            if (!d().b()) {
                d().a(inputStream);
            }
        } finally {
            defpackage.dvc.a(inputStream);
        }
    }

    public final void f() {
        if (!d().b()) {
            d().a();
        }
    }

    public final void a(defpackage.doa doa) {
        d().a((defpackage.doa) defpackage.cld.a((java.lang.Object) doa, (java.lang.Object) "compressor"));
    }
}
