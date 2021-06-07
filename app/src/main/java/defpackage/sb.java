package defpackage;

import android.view.LayoutInflater;

/* access modifiers changed from: package-private */
/* renamed from: sb  reason: default package */
/* compiled from: PG */
public class sb {
    sb() {
    }

    public void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof LayoutInflater.Factory2) {
            rz.a(layoutInflater, (LayoutInflater.Factory2) factory);
        } else {
            rz.a(layoutInflater, factory2);
        }
    }
}
