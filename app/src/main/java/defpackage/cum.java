package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: cum  reason: default package */
/* compiled from: PG */
final class cum implements cun {
    private static final Set a = new HashSet();
    private final String b;
    private final String c;
    private final StringBuilder d;
    private boolean e = false;

    cum(String str, String str2, StringBuilder sb) {
        a.add(Boolean.class);
        a.add(Byte.class);
        a.add(Short.class);
        a.add(Integer.class);
        a.add(Long.class);
        a.add(Float.class);
        a.add(Double.class);
        this.b = str;
        this.c = str2;
        this.d = sb;
    }

    public final void a() {
        if (this.e) {
            this.d.append(this.c);
        }
    }

    private static int a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt == '\"' || charAt == '\\') {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // defpackage.cun
    public final /* synthetic */ cun a(String str, Object obj) {
        char c2 = ' ';
        int i = 0;
        if (this.e) {
            this.d.append(' ');
        } else {
            if (this.d.length() > 0) {
                StringBuilder sb = this.d;
                if (this.d.length() > 1000 || this.d.indexOf("\n") != -1) {
                    c2 = '\n';
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
            StringBuilder sb2 = this.d;
            String obj2 = obj.toString();
            int a2 = a(obj2, 0);
            while (a2 != -1) {
                sb2.append((CharSequence) obj2, i, a2);
                i = a2 + 1;
                char charAt = obj2.charAt(a2);
                switch (charAt) {
                    case '\t':
                        charAt = 't';
                        break;
                    case '\n':
                        charAt = 'n';
                        break;
                    case '\r':
                        charAt = 'r';
                        break;
                    case '\"':
                    case '\\':
                        break;
                    default:
                        sb2.append((char) 65533);
                        continue;
                        a2 = a(obj2, i);
                }
                sb2.append("\\").append(charAt);
                a2 = a(obj2, i);
            }
            sb2.append((CharSequence) obj2, i, obj2.length());
            this.d.append('\"');
        }
        return this;
    }
}
