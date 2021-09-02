package defpackage;

/* renamed from: crr reason: default package */
/* compiled from: PG */
public final class crr {
    private final java.lang.String a;

    public crr(java.lang.String str) {
        this.a = (java.lang.String) defpackage.cld.a((java.lang.Object) str);
    }

    public final java.lang.StringBuilder a(java.lang.StringBuilder sb, java.util.Iterator it) {
        try {
            defpackage.cld.a((java.lang.Object) sb);
            if (it.hasNext()) {
                sb.append(a(it.next()));
                while (it.hasNext()) {
                    sb.append(this.a);
                    sb.append(a(it.next()));
                }
            }
            return sb;
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    private static java.lang.CharSequence a(java.lang.Object obj) {
        defpackage.cld.a(obj);
        return obj instanceof java.lang.CharSequence ? (java.lang.CharSequence) obj : obj.toString();
    }
}
