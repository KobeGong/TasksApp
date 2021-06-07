package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: crr  reason: default package */
/* compiled from: PG */
public final class crr {
    private final String a;

    public crr(String str) {
        this.a = (String) cld.a(str);
    }

    public final StringBuilder a(StringBuilder sb, Iterator it) {
        try {
            cld.a(sb);
            if (it.hasNext()) {
                sb.append(a(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.a);
                    sb.append(a(it.next()));
                }
            }
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    private static CharSequence a(Object obj) {
        cld.a(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
