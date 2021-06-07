package defpackage;

import java.util.List;

/* renamed from: ah  reason: default package */
/* compiled from: PG */
final class ah implements t {
    private final Object a;
    private final cr b = n.a.b(this.a.getClass());

    ah(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.t
    public final void a(y yVar, v vVar) {
        cr crVar = this.b;
        Object obj = this.a;
        cr.a((List) crVar.a.get(vVar), yVar, vVar, obj);
        cr.a((List) crVar.a.get(v.ON_ANY), yVar, vVar, obj);
    }
}
