package defpackage;

import java.io.InputStream;

/* renamed from: dqy  reason: default package */
/* compiled from: PG */
public abstract class dqy implements dzp {
    public abstract dri c();

    /* access modifiers changed from: protected */
    public abstract dva d();

    @Override // defpackage.dzp
    public final void a(InputStream inputStream) {
        cld.a(inputStream, "message");
        try {
            if (!d().b()) {
                d().a(inputStream);
            }
        } finally {
            dvc.a(inputStream);
        }
    }

    @Override // defpackage.dzp
    public final void f() {
        if (!d().b()) {
            d().a();
        }
    }

    @Override // defpackage.dzp
    public final void a(doa doa) {
        d().a((doa) cld.a(doa, "compressor"));
    }
}
