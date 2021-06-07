package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bea  reason: default package */
/* compiled from: PG */
public final class bea {
    private final List a = new ArrayList();
    private final Object b;

    public bea(Object obj) {
        this.b = azb.b(obj);
    }

    public final bea a(String str, Object obj) {
        List list = this.a;
        String str2 = (String) azb.b((Object) str);
        String valueOf = String.valueOf(obj);
        list.add(new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(valueOf).length()).append(str2).append("=").append(valueOf).toString());
        return this;
    }

    public final String toString() {
        StringBuilder append = new StringBuilder(100).append(this.b.getClass().getSimpleName()).append('{');
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            append.append((String) this.a.get(i));
            if (i < size - 1) {
                append.append(", ");
            }
        }
        return append.append('}').toString();
    }
}
