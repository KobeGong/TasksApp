package defpackage;

/* renamed from: ecv reason: default package */
/* compiled from: PG */
public class ecv {
    public static final defpackage.ecw a = new defpackage.ecw();

    public byte[] a(defpackage.ecf ecf) {
        return a(ecf);
    }

    @java.lang.Deprecated
    private final defpackage.ecf b(byte[] bArr) {
        try {
            return a(bArr);
        } catch (defpackage.ecy e) {
            throw new java.text.ParseException(e.toString(), 0);
        }
    }

    public defpackage.ecf a(byte[] bArr) {
        try {
            return b(bArr);
        } catch (java.text.ParseException e) {
            throw new defpackage.ecy("Error while parsing.", e);
        }
    }
}
