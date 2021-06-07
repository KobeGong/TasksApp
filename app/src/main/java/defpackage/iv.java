package defpackage;

import java.util.ArrayList;

/* renamed from: iv  reason: default package */
/* compiled from: PG */
final class iv implements ji {
    private final /* synthetic */ Object a;
    private final /* synthetic */ ArrayList b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ ArrayList d;
    private final /* synthetic */ Object e;
    private final /* synthetic */ ArrayList f;
    private final /* synthetic */ it g;

    iv(it itVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.g = itVar;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
        this.e = obj3;
        this.f = arrayList3;
    }

    @Override // defpackage.ji
    public final void c() {
        if (this.a != null) {
            this.g.b(this.a, this.b, (ArrayList) null);
        }
        if (this.c != null) {
            this.g.b(this.c, this.d, (ArrayList) null);
        }
        if (this.e != null) {
            this.g.b(this.e, this.f, (ArrayList) null);
        }
    }

    @Override // defpackage.ji
    public final void a(je jeVar) {
    }

    @Override // defpackage.ji
    public final void a() {
    }

    @Override // defpackage.ji
    public final void b() {
    }
}
