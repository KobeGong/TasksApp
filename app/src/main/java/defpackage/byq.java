package defpackage;

/* renamed from: byq  reason: default package */
/* compiled from: PG */
public abstract class byq {
    public abstract String a();

    public abstract String b();

    public abstract bul c();

    public abstract Integer d();

    public abstract Integer e();

    public final String f() {
        bul c = c();
        String valueOf = String.valueOf(a());
        String valueOf2 = String.valueOf(c != null ? c.b() : "");
        String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        long j = 1125899906842597L;
        int length = concat.length();
        while (true) {
            length--;
            if (length >= 0) {
                j = (j * 31) + ((long) concat.charAt(length));
            } else {
                String hexString = Long.toHexString(1152921504606846975L & j);
                String valueOf3 = String.valueOf(e());
                String valueOf4 = String.valueOf(d());
                return new StringBuilder(String.valueOf(hexString).length() + 4 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length()).append(hexString).append("-h").append(valueOf3).append("-w").append(valueOf4).toString();
            }
        }
    }

    byq() {
    }
}
