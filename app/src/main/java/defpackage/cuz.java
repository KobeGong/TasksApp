package defpackage;

import java.util.Comparator;

/* renamed from: cuz  reason: default package */
/* compiled from: PG */
final class cuz implements Comparator {
    cuz() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        cva a = cva.a(obj);
        cva a2 = cva.a(obj2);
        return a == a2 ? a.a(obj, obj2) : a.compareTo((Enum) a2);
    }
}
