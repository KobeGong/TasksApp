package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: dnn  reason: default package */
/* compiled from: PG */
public final class dnn implements doa {
    @Override // defpackage.doa
    public final String a() {
        return "gzip";
    }

    @Override // defpackage.doa
    public final OutputStream a(OutputStream outputStream) {
        return new GZIPOutputStream(outputStream);
    }

    @Override // defpackage.doa
    public final InputStream a(InputStream inputStream) {
        return new GZIPInputStream(inputStream);
    }
}
