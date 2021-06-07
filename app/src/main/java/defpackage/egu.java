package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: egu  reason: default package */
/* compiled from: PG */
public final class egu implements Iterable {
    public final List a = new ArrayList();
    public int b;
    public int c;
    public boolean d;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new egv(this);
    }
}
