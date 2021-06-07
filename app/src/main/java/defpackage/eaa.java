package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: eaa  reason: default package */
/* compiled from: PG */
public final class eaa {
    public static volatile dhw a = dhw.a();
    public static final ThreadLocal b = new eab();

    public static dpd a(djo djo) {
        return new ebh(djo, djo.d());
    }

    public static dox b(djo djo) {
        return new eac(djo);
    }

    static long a(InputStream inputStream, OutputStream outputStream) {
        cld.a(inputStream);
        cld.a(outputStream);
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }
}
