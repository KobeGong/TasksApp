package defpackage;

/* renamed from: eaa reason: default package */
/* compiled from: PG */
public final class eaa {
    public static volatile defpackage.dhw a = defpackage.dhw.a();
    public static final java.lang.ThreadLocal b = new defpackage.eab();

    public static defpackage.dpd a(defpackage.djo djo) {
        return new defpackage.ebh(djo, djo.d());
    }

    public static defpackage.dox b(defpackage.djo djo) {
        return new defpackage.eac(djo);
    }

    static long a(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        defpackage.cld.a((java.lang.Object) inputStream);
        defpackage.cld.a((java.lang.Object) outputStream);
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
