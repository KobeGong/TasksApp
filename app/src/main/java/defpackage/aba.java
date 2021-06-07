package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug;
import android.view.ViewGroup;

/* renamed from: aba  reason: default package */
/* compiled from: PG */
public final class aba extends adv {
    @ViewDebug.ExportedProperty
    public boolean a;
    @ViewDebug.ExportedProperty
    public int b;
    @ViewDebug.ExportedProperty
    public int c;
    @ViewDebug.ExportedProperty
    public boolean d;
    @ViewDebug.ExportedProperty
    public boolean e;
    public boolean f;

    public aba(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public aba(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public aba(aba aba) {
        super(aba);
        this.a = aba.a;
    }

    public aba() {
        super(-2);
        this.a = false;
    }
}
