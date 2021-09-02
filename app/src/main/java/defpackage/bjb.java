package defpackage;

/* renamed from: bjb reason: default package */
/* compiled from: PG */
public final class bjb {
    private final java.lang.String a;
    private final java.lang.String b;
    private final int c;

    public bjb(java.lang.String str, java.lang.String... strArr) {
        java.lang.String sb;
        if (strArr.length == 0) {
            sb = "";
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append('[');
            for (java.lang.String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append(']').append(' ');
            sb = sb2.toString();
        }
        this(str, sb);
    }

    private bjb(java.lang.String str, java.lang.String str2) {
        this.b = str2;
        this.a = str;
        new defpackage.avi(str, 0);
        int i = 2;
        while (7 >= i && !android.util.Log.isLoggable(this.a, i)) {
            i++;
        }
        this.c = i;
    }

    public final void a(java.lang.String str, java.lang.Object... objArr) {
        if (this.c <= 3) {
            c(str, objArr);
        }
    }

    public final void b(java.lang.String str, java.lang.Object... objArr) {
        android.util.Log.w(this.a, c(str, objArr));
    }

    public final java.lang.String c(java.lang.String str, java.lang.Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = java.lang.String.format(java.util.Locale.US, str, objArr);
        }
        return this.b.concat(str);
    }
}
