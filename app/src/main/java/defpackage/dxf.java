package defpackage;

import java.io.InputStream;

/* access modifiers changed from: package-private */
/* renamed from: dxf  reason: default package */
/* compiled from: PG */
public final class dxf implements dzr {
    private InputStream a;

    dxf(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.dzr
    public final InputStream a() {
        InputStream inputStream = this.a;
        this.a = null;
        return inputStream;
    }
}
