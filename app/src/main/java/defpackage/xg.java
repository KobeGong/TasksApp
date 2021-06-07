package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: xg  reason: default package */
/* compiled from: PG */
public class xg extends Dialog implements wn {
    private wo a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xg(android.content.Context r5, int r6) {
        /*
            r4 = this;
            if (r6 != 0) goto L_0x0014
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r1 = r5.getTheme()
            r2 = 2130772170(0x7f0100ca, float:1.714745E38)
            r3 = 1
            r1.resolveAttribute(r2, r0, r3)
            int r6 = r0.resourceId
        L_0x0014:
            r4.<init>(r5, r6)
            wo r0 = r4.b()
            r1 = 0
            r0.a(r1)
            wo r0 = r4.b()
            r0.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg.<init>(android.content.Context, int):void");
    }

    public void onCreate(Bundle bundle) {
        b().j();
        super.onCreate(bundle);
        b().a(bundle);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        b().b(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        b().a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b().a(view, layoutParams);
    }

    @Override // android.app.Dialog
    public View findViewById(int i) {
        return b().a(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        b().a(charSequence);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        b().a(getContext().getString(i));
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b().b(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        b().f();
    }

    public final boolean a() {
        return b().c(1);
    }

    public void invalidateOptionsMenu() {
        b().h();
    }

    private final wo b() {
        if (this.a == null) {
            this.a = wo.a(getContext(), getWindow(), this);
        }
        return this.a;
    }

    @Override // defpackage.wn
    public final void d() {
    }

    @Override // defpackage.wn
    public final void e() {
    }

    @Override // defpackage.wn
    public final yc f() {
        return null;
    }
}
