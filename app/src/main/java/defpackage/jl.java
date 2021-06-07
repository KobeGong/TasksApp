package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: jl  reason: default package */
/* compiled from: PG */
public final class jl implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    public ViewGroup a;
    private je b;

    jl(je jeVar, ViewGroup viewGroup) {
        this.b = jeVar;
        this.a = viewGroup;
    }

    private final void a() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        this.a.removeOnAttachStateChangeListener(this);
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        a();
        jk.b.remove(this.a);
        ArrayList arrayList = (ArrayList) jk.a().get(this.a);
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((je) obj).e(this.a);
            }
        }
        this.b.a(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onPreDraw() {
        /*
        // Method dump skipped, instructions count: 744
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jl.onPreDraw():boolean");
    }
}
