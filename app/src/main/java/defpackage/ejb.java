package defpackage;

import java.util.Collection;
import java.util.Collections;

/* renamed from: ejb  reason: default package */
/* compiled from: PG */
public final class ejb {
    public final String a;
    public final ejd b;
    public final int c;
    public final ejg d;
    public final bkv e;
    private final Collection f;

    public ejb() {
    }

    public final Collection a() {
        if (this.f == null) {
            return Collections.emptyList();
        }
        return this.f;
    }

    public ejb(String str, Collection collection, ejd ejd, int i, ejg ejg, bkv bkv) {
        this();
        this.a = str;
        this.f = collection;
        this.b = ejd;
        this.c = i;
        this.d = ejg;
        this.e = bkv;
    }
}
