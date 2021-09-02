package defpackage;

/* renamed from: doy reason: default package */
/* compiled from: PG */
public abstract class doy {
    private static final java.util.BitSet c;
    public final java.lang.String a;
    public final byte[] b;
    private final java.lang.String d;

    public static defpackage.doy a(java.lang.String str, defpackage.dox dox) {
        return new defpackage.dow(str, dox);
    }

    /* access modifiers changed from: 0000 */
    public abstract java.lang.Object a(byte[] bArr);

    /* access modifiers changed from: 0000 */
    public abstract byte[] a(java.lang.Object obj);

    public static defpackage.doy a(java.lang.String str, defpackage.dov dov) {
        return new defpackage.dou(str, dov);
    }

    static defpackage.doy a(java.lang.String str, boolean z, defpackage.dpa dpa) {
        return new defpackage.doz(str, z, dpa);
    }

    doy(java.lang.String str, boolean z) {
        this.d = (java.lang.String) defpackage.cld.a((java.lang.Object) str, (java.lang.Object) "name");
        java.lang.String lowerCase = this.d.toLowerCase(java.util.Locale.ROOT);
        defpackage.cld.a((java.lang.Object) lowerCase, (java.lang.Object) "name");
        defpackage.cld.a(!lowerCase.isEmpty(), (java.lang.Object) "token must have at least 1 tchar");
        for (int i = 0; i < lowerCase.length(); i++) {
            char charAt = lowerCase.charAt(i);
            if (!z || charAt != ':' || i != 0) {
                java.lang.String str2 = "Invalid character '%s' in key name '%s'";
                if (!c.get(charAt)) {
                    throw new java.lang.IllegalArgumentException(defpackage.cld.a(str2, java.lang.Character.valueOf(charAt), lowerCase));
                }
            }
        }
        this.a = lowerCase;
        this.b = this.a.getBytes(defpackage.crp.a);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((defpackage.doy) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public java.lang.String toString() {
        java.lang.String str = this.a;
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 12).append("Key{name='").append(str).append("'}").toString();
    }

    static {
        java.util.BitSet bitSet = new java.util.BitSet(127);
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
