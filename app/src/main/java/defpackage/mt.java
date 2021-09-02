package defpackage;

/* renamed from: mt reason: default package */
/* compiled from: PG */
final class mt implements android.transition.Transition.TransitionListener {
    private final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ java.util.ArrayList b;
    private final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ java.util.ArrayList d;
    private final /* synthetic */ java.lang.Object e;
    private final /* synthetic */ java.util.ArrayList f;
    private final /* synthetic */ defpackage.mq g;

    mt(defpackage.mq mqVar, java.lang.Object obj, java.util.ArrayList arrayList, java.lang.Object obj2, java.util.ArrayList arrayList2, java.lang.Object obj3, java.util.ArrayList arrayList3) {
        this.g = mqVar;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
        this.e = obj3;
        this.f = arrayList3;
    }

    public final void onTransitionStart(android.transition.Transition transition) {
        if (this.a != null) {
            this.g.b(this.a, this.b, (java.util.ArrayList) null);
        }
        if (this.c != null) {
            this.g.b(this.c, this.d, (java.util.ArrayList) null);
        }
        if (this.e != null) {
            this.g.b(this.e, this.f, (java.util.ArrayList) null);
        }
    }

    public final void onTransitionEnd(android.transition.Transition transition) {
    }

    public final void onTransitionCancel(android.transition.Transition transition) {
    }

    public final void onTransitionPause(android.transition.Transition transition) {
    }

    public final void onTransitionResume(android.transition.Transition transition) {
    }
}
