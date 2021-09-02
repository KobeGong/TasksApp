package defpackage;

/* renamed from: ago reason: default package */
/* compiled from: PG */
public final class ago extends android.view.TouchDelegate {
    private final android.view.View a;
    private final android.graphics.Rect b = new android.graphics.Rect();
    private final android.graphics.Rect c = new android.graphics.Rect();
    private final android.graphics.Rect d = new android.graphics.Rect();
    private final int e;
    private boolean f;

    public ago(android.graphics.Rect rect, android.graphics.Rect rect2, android.view.View view) {
        super(rect, view);
        this.e = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        a(rect, rect2);
        this.a = view;
    }

    public final void a(android.graphics.Rect rect, android.graphics.Rect rect2) {
        this.b.set(rect);
        this.d.set(rect);
        this.d.inset(-this.e, -this.e);
        this.c.set(rect2);
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r1 = 1
            r0 = 0
            float r2 = r7.getX()
            int r3 = (int) r2
            float r2 = r7.getY()
            int r4 = (int) r2
            int r2 = r7.getAction()
            switch(r2) {
                case 0: goto L_0x003c;
                case 1: goto L_0x0048;
                case 2: goto L_0x0048;
                case 3: goto L_0x0056;
                default: goto L_0x0013;
            }
        L_0x0013:
            r2 = r0
        L_0x0014:
            if (r2 == 0) goto L_0x003b
            if (r1 == 0) goto L_0x005b
            android.graphics.Rect r0 = r6.c
            boolean r0 = r0.contains(r3, r4)
            if (r0 != 0) goto L_0x005b
            android.view.View r0 = r6.a
            int r0 = r0.getWidth()
            int r0 = r0 / 2
            float r0 = (float) r0
            android.view.View r1 = r6.a
            int r1 = r1.getHeight()
            int r1 = r1 / 2
            float r1 = (float) r1
            r7.setLocation(r0, r1)
        L_0x0035:
            android.view.View r0 = r6.a
            boolean r0 = r0.dispatchTouchEvent(r7)
        L_0x003b:
            return r0
        L_0x003c:
            android.graphics.Rect r2 = r6.b
            boolean r2 = r2.contains(r3, r4)
            if (r2 == 0) goto L_0x0013
            r6.f = r1
            r2 = r1
            goto L_0x0014
        L_0x0048:
            boolean r2 = r6.f
            if (r2 == 0) goto L_0x0014
            android.graphics.Rect r5 = r6.d
            boolean r5 = r5.contains(r3, r4)
            if (r5 != 0) goto L_0x0014
            r1 = r0
            goto L_0x0014
        L_0x0056:
            boolean r2 = r6.f
            r6.f = r0
            goto L_0x0014
        L_0x005b:
            android.graphics.Rect r0 = r6.c
            int r0 = r0.left
            int r0 = r3 - r0
            float r0 = (float) r0
            android.graphics.Rect r1 = r6.c
            int r1 = r1.top
            int r1 = r4 - r1
            float r1 = (float) r1
            r7.setLocation(r0, r1)
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ago.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
