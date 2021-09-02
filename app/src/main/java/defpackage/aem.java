package defpackage;

/* renamed from: aem reason: default package */
/* compiled from: PG */
public final class aem extends defpackage.ade {
    public defpackage.aek c;
    private final int d;
    private final int e;
    private android.view.MenuItem f;

    public aem(android.content.Context context, boolean z) {
        super(context, z);
        android.content.res.Configuration configuration = context.getResources().getConfiguration();
        if (android.os.Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
            this.d = 22;
            this.e = 21;
            return;
        }
        this.d = 21;
        this.e = 22;
    }

    public final boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        android.support.v7.view.menu.ListMenuItemView listMenuItemView = (android.support.v7.view.menu.ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.d) {
            if (listMenuItemView.isEnabled() && listMenuItemView.a.hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView == null || i != this.e) {
            return super.onKeyDown(i, keyEvent);
        } else {
            setSelection(-1);
            ((defpackage.zd) getAdapter()).a.b(false);
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onHoverEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            aek r0 = r6.c
            if (r0 == 0) goto L_0x005b
            android.widget.ListAdapter r0 = r6.getAdapter()
            boolean r1 = r0 instanceof android.widget.HeaderViewListAdapter
            if (r1 == 0) goto L_0x0060
            android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0
            int r1 = r0.getHeadersCount()
            android.widget.ListAdapter r0 = r0.getWrappedAdapter()
            zd r0 = (defpackage.zd) r0
            r5 = r0
            r0 = r1
            r1 = r5
        L_0x001b:
            r2 = 0
            int r3 = r7.getAction()
            r4 = 10
            if (r3 == r4) goto L_0x0067
            float r3 = r7.getX()
            int r3 = (int) r3
            float r4 = r7.getY()
            int r4 = (int) r4
            int r3 = r6.pointToPosition(r3, r4)
            r4 = -1
            if (r3 == r4) goto L_0x0067
            int r0 = r3 - r0
            if (r0 < 0) goto L_0x0067
            int r3 = r1.getCount()
            if (r0 >= r3) goto L_0x0067
            java.lang.Object r0 = r1.getItem(r0)
            zi r0 = (defpackage.zi) r0
        L_0x0045:
            android.view.MenuItem r2 = r6.f
            if (r2 == r0) goto L_0x005b
            ze r1 = r1.a
            if (r2 == 0) goto L_0x0052
            aek r3 = r6.c
            r3.a(r1, r2)
        L_0x0052:
            r6.f = r0
            if (r0 == 0) goto L_0x005b
            aek r2 = r6.c
            r2.b(r1, r0)
        L_0x005b:
            boolean r0 = super.onHoverEvent(r7)
            return r0
        L_0x0060:
            r1 = 0
            zd r0 = (defpackage.zd) r0
            r5 = r0
            r0 = r1
            r1 = r5
            goto L_0x001b
        L_0x0067:
            r0 = r2
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aem.onHoverEvent(android.view.MotionEvent):boolean");
    }

    public final /* bridge */ /* synthetic */ boolean a(android.view.MotionEvent motionEvent, int i) {
        return super.a(motionEvent, i);
    }

    public final /* bridge */ /* synthetic */ int a(int i, int i2, int i3, int i4, int i5) {
        return super.a(i, i2, i3, i4, i5);
    }

    public final /* bridge */ /* synthetic */ boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public final /* bridge */ /* synthetic */ void setSelector(android.graphics.drawable.Drawable drawable) {
        super.setSelector(drawable);
    }

    public final /* bridge */ /* synthetic */ boolean hasFocus() {
        return super.hasFocus();
    }

    public final /* bridge */ /* synthetic */ boolean isFocused() {
        return super.isFocused();
    }

    public final /* bridge */ /* synthetic */ boolean hasWindowFocus() {
        return super.hasWindowFocus();
    }

    public final /* bridge */ /* synthetic */ boolean isInTouchMode() {
        return super.isInTouchMode();
    }
}
