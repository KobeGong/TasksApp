package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: dpk  reason: default package */
/* compiled from: PG */
final class dpk implements Iterable {
    dpk() {
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("dut"));
        } catch (ClassNotFoundException e) {
        }
        return arrayList.iterator();
    }
}
