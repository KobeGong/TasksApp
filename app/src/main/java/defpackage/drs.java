package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: drs  reason: default package */
/* compiled from: PG */
final class drs implements dpd {
    drs() {
    }

    private static byte[] b(InputStream inputStream) {
        try {
            return c(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static byte[] c(InputStream inputStream) {
        try {
            return dtj.a(inputStream);
        } finally {
            inputStream.close();
        }
    }

    @Override // defpackage.dpd
    public final /* synthetic */ Object a(InputStream inputStream) {
        return b(inputStream);
    }

    @Override // defpackage.dpd
    public final /* synthetic */ InputStream a(Object obj) {
        return new ByteArrayInputStream((byte[]) obj);
    }
}
