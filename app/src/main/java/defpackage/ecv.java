package defpackage;

import java.text.ParseException;

/* renamed from: ecv  reason: default package */
/* compiled from: PG */
public class ecv {
    public static final ecw a = new ecw();

    public byte[] a(ecf ecf) {
        return a(ecf);
    }

    @Deprecated
    private final ecf b(byte[] bArr) {
        try {
            return a(bArr);
        } catch (ecy e) {
            throw new ParseException(e.toString(), 0);
        }
    }

    public ecf a(byte[] bArr) {
        try {
            return b(bArr);
        } catch (ParseException e) {
            throw new ecy("Error while parsing.", e);
        }
    }
}
