package defpackage;

/* renamed from: cum reason: default package */
/* compiled from: PG */
final class cum implements defpackage.cun {
    private static final java.util.Set a = new java.util.HashSet();
    private final java.lang.String b;
    private final java.lang.String c;
    private final java.lang.StringBuilder d;
    private boolean e = false;

    cum(java.lang.String str, java.lang.String str2, java.lang.StringBuilder sb) {
        a.add(java.lang.Boolean.class);
        a.add(java.lang.Byte.class);
        a.add(java.lang.Short.class);
        a.add(java.lang.Integer.class);
        a.add(java.lang.Long.class);
        a.add(java.lang.Float.class);
        a.add(java.lang.Double.class);
        this.b = str;
        this.c = str2;
        this.d = sb;
    }

    public final void a() {
        if (this.e) {
            this.d.append(this.c);
        }
    }

    private static int a(java.lang.String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt == '\"' || charAt == '\\') {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final /* synthetic */ defpackage.cun a(java.lang.String str, java.lang.Object obj) {
        char c2 = ' ';
        int i = 0;
        if (this.e) {
            this.d.append(' ');
        } else {
            if (this.d.length() > 0) {
                java.lang.StringBuilder sb = this.d;
                if (this.d.length() > 1000 || this.d.indexOf("\n") != -1) {
                    c2 = 10;
                }
                sb.append(c2);
            }
            this.d.append(this.b);
            this.e = true;
        }
        this.d.append(str).append('=');
        if (obj == null) {
            this.d.append(true);
        } else if (a.contains(obj.getClass())) {
            this.d.append(obj);
        } else {
            this.d.append('\"');
            java.lang.StringBuilder sb2 = this.d;
            java.lang.String obj2 = obj.toString();
            int a2 = a(obj2, 0);
            while (a2 != -1) {
                sb2.append(obj2, i, a2);
                i = a2 + 1;
                char charAt = obj2.charAt(a2);
                switch (charAt) {
                    case 9:
                        charAt = 't';
                        break;
                    case 10:
                        charAt = 'n';
                        break;
                    case 13:
                        charAt = 'r';
                        break;
                    case '\"':
                    case '\\':
                        break;
                    default:
                        sb2.append(65533);
                        continue;
                }
                sb2.append("\\").append(charAt);
                a2 = a(obj2, i);
            }
            sb2.append(obj2, i, obj2.length());
            this.d.append('\"');
        }
        return this;
    }
}
