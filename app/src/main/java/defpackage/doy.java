package defpackage;

import java.util.BitSet;
import java.util.Locale;

/* renamed from: doy  reason: default package */
/* compiled from: PG */
public abstract class doy {
    private static final BitSet c;
    public final String a;
    public final byte[] b;
    private final String d;

    public static doy a(String str, dox dox) {
        return new dow(str, dox);
    }

    /* access modifiers changed from: package-private */
    public abstract Object a(byte[] bArr);

    /* access modifiers changed from: package-private */
    public abstract byte[] a(Object obj);

    public static doy a(String str, dov dov) {
        return new dou(str, dov);
    }

    static doy a(String str, boolean z, dpa dpa) {
        return new doz(str, z, dpa);
    }

    doy(String str, boolean z) {
        this.d = (String) cld.a(str, "name");
        String lowerCase = this.d.toLowerCase(Locale.ROOT);
        cld.a(lowerCase, "name");
        cld.a(!lowerCase.isEmpty(), "token must have at least 1 tchar");
        for (int i = 0; i < lowerCase.length(); i++) {
            char charAt = lowerCase.charAt(i);
            if (!(z && charAt == ':' && i == 0) && !c.get(charAt)) {
                throw new IllegalArgumentException(cld.a("Invalid character '%s' in key name '%s'", Character.valueOf(charAt), lowerCase));
            }
        }
        this.a = lowerCase;
        this.b = this.a.getBytes(crp.a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((doy) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        String str = this.a;
        return new StringBuilder(String.valueOf(str).length() + 12).append("Key{name='").append(str).append("'}").toString();
    }

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c2 = '0'; c2 <= '9'; c2 = (char) (c2 + 1)) {
            bitSet.set(c2);
        }
        for (char c3 = 'a'; c3 <= 'z'; c3 = (char) (c3 + 1)) {
            bitSet.set(c3);
        }
        c = bitSet;
    }
}
