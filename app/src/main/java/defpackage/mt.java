package defpackage;

import android.transition.Transition;
import java.util.ArrayList;

/* renamed from: mt  reason: default package */
/* compiled from: PG */
final class mt implements Transition.TransitionListener {
    private final /* synthetic */ Object a;
    private final /* synthetic */ ArrayList b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ ArrayList d;
    private final /* synthetic */ Object e;
    private final /* synthetic */ ArrayList f;
    private final /* synthetic */ mq g;

    mt(mq mqVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.g = mqVar;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
        this.e = obj3;
        this.f = arrayList3;
    }

    public final void onTransitionStart(Transition transition) {
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

    public final void onTransitionEnd(Transition transition) {
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }
}
