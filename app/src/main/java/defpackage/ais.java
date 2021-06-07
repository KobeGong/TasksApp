package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ais  reason: default package */
/* compiled from: PG */
public final class ais {
    public air a;
    public final List b = new ArrayList();
    private final String c;
    private final /* synthetic */ aiq d;

    ais(aiq aiq, String str) {
        this.d = aiq;
        this.c = str;
    }

    public final synchronized void a(air air) {
        if (this.a != null) {
            new Object[1][0] = air;
        } else {
            this.a = air;
            if (!this.d.a(this.a, this.c)) {
                new Object[1][0] = air;
                this.a = null;
            }
        }
    }

    public final synchronized void a(aiy aiy) {
        this.b.add(aiy);
    }

    public final synchronized boolean a() {
        return this.a != null;
    }
}
