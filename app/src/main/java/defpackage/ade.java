package defpackage;

/* renamed from: ade reason: default package */
/* compiled from: PG */
class ade extends android.widget.ListView {
    public boolean a;
    public defpackage.adg b;
    private final android.graphics.Rect c = new android.graphics.Rect();
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h;
    private java.lang.reflect.Field i;
    private defpackage.adf j;
    private boolean k;
    private boolean l;
    private defpackage.uw m;

    ade(android.content.Context context, boolean z) {
        super(context, null, 2130772203);
        this.k = z;
        setCacheColorHint(0);
        try {
            this.i = android.widget.AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.i.setAccessible(true);
        } catch (java.lang.NoSuchFieldException e2) {
            defpackage.cza.a.a(e2);
        }
    }

    public boolean isInTouchMode() {
        return (this.k && this.a) || super.isInTouchMode();
    }

    public boolean hasWindowFocus() {
        return this.k || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.k || super.isFocused();
    }

    public boolean hasFocus() {
        return this.k || super.hasFocus();
    }

    public void setSelector(android.graphics.drawable.Drawable drawable) {
        this.j = drawable != null ? new defpackage.adf(drawable) : null;
        super.setSelector(this.j);
        android.graphics.Rect rect = new android.graphics.Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.d = rect.left;
        this.e = rect.top;
        this.f = rect.right;
        this.g = rect.bottom;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.b == null) {
            super.drawableStateChanged();
            a(true);
            a();
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(android.graphics.Canvas canvas) {
        if (!this.c.isEmpty()) {
            android.graphics.drawable.Drawable selector = getSelector();
            if (selector != null) {
                selector.setBounds(this.c);
                selector.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                break;
        }
        if (this.b != null) {
            defpackage.adg adg = this.b;
            adg.a.b = null;
            adg.a.removeCallbacks(adg);
        }
        return super.onTouchEvent(motionEvent);
    }

    public int a(int i2, int i3, int i4, int i5, int i6) {
        android.view.View view;
        int makeMeasureSpec;
        int i7;
        int i8;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        android.graphics.drawable.Drawable divider = getDivider();
        android.widget.ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i9 = listPaddingBottom + listPaddingTop;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int i10 = 0;
        android.view.View view2 = null;
        int i11 = 0;
        int count = adapter.getCount();
        int i12 = 0;
        while (i12 < count) {
            int itemViewType = adapter.getItemViewType(i12);
            if (itemViewType != i11) {
                int i13 = itemViewType;
                view = null;
                i11 = i13;
            } else {
                view = view2;
            }
            view2 = adapter.getView(i12, view, this);
            android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view2.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view2.measure(i2, makeMeasureSpec);
            view2.forceLayout();
            if (i12 > 0) {
                i7 = i9 + dividerHeight;
            } else {
                i7 = i9;
            }
            i9 = view2.getMeasuredHeight() + i7;
            if (i9 < i5) {
                if (i6 < 0 || i12 < i6) {
                    i8 = i10;
                } else {
                    i8 = i9;
                }
                i12++;
                i10 = i8;
            } else if (i6 < 0 || i12 <= i6 || i10 <= 0 || i9 == i5) {
                return i5;
            } else {
                return i10;
            }
        }
        return i9;
    }

    private final void a(boolean z) {
        if (this.j != null) {
            this.j.b = z;
        }
    }

    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.b == null) {
            this.b = new defpackage.adg(this);
            defpackage.adg adg = this.b;
            adg.a.post(adg);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition == -1 || pointToPosition == getSelectedItemPosition()) {
                return onHoverEvent;
            }
            android.view.View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
            }
            a();
            return onHoverEvent;
        }
        setSelection(-1);
        return onHoverEvent;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.b = null;
        super.onDetachedFromWindow();
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.view.MotionEvent r15, int r16) {
        /*
            r14 = this;
            r0 = 1
            r1 = 0
            int r3 = r15.getActionMasked()
            switch(r3) {
                case 1: goto L_0x0049;
                case 2: goto L_0x004a;
                case 3: goto L_0x0044;
                default: goto L_0x0009;
            }
        L_0x0009:
            r13 = r1
            r1 = r0
            r0 = r13
        L_0x000c:
            if (r1 == 0) goto L_0x0010
            if (r0 == 0) goto L_0x002b
        L_0x0010:
            r0 = 0
            r14.l = r0
            r0 = 0
            r14.setPressed(r0)
            r14.drawableStateChanged()
            int r0 = r14.h
            int r2 = r14.getFirstVisiblePosition()
            int r0 = r0 - r2
            android.view.View r0 = r14.getChildAt(r0)
            if (r0 == 0) goto L_0x002b
            r2 = 0
            r0.setPressed(r2)
        L_0x002b:
            if (r1 == 0) goto L_0x017b
            uw r0 = r14.m
            if (r0 != 0) goto L_0x0038
            uw r0 = new uw
            r0.<init>(r14)
            r14.m = r0
        L_0x0038:
            uw r0 = r14.m
            r2 = 1
            r0.a(r2)
            uw r0 = r14.m
            r0.onTouch(r14, r15)
        L_0x0043:
            return r1
        L_0x0044:
            r0 = 0
            r13 = r1
            r1 = r0
            r0 = r13
            goto L_0x000c
        L_0x0049:
            r0 = 0
        L_0x004a:
            int r2 = r15.findPointerIndex(r16)
            if (r2 >= 0) goto L_0x0055
            r0 = 0
            r13 = r1
            r1 = r0
            r0 = r13
            goto L_0x000c
        L_0x0055:
            float r4 = r15.getX(r2)
            int r4 = (int) r4
            float r2 = r15.getY(r2)
            int r2 = (int) r2
            int r5 = r14.pointToPosition(r4, r2)
            r6 = -1
            if (r5 != r6) goto L_0x006b
            r1 = 1
            r13 = r1
            r1 = r0
            r0 = r13
            goto L_0x000c
        L_0x006b:
            int r0 = r14.getFirstVisiblePosition()
            int r0 = r5 - r0
            android.view.View r6 = r14.getChildAt(r0)
            float r4 = (float) r4
            float r7 = (float) r2
            r0 = 1
            r14.l = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x0083
            r14.drawableHotspotChanged(r4, r7)
        L_0x0083:
            boolean r0 = r14.isPressed()
            if (r0 != 0) goto L_0x008d
            r0 = 1
            r14.setPressed(r0)
        L_0x008d:
            r14.layoutChildren()
            int r0 = r14.h
            r2 = -1
            if (r0 == r2) goto L_0x00ae
            int r0 = r14.h
            int r2 = r14.getFirstVisiblePosition()
            int r0 = r0 - r2
            android.view.View r0 = r14.getChildAt(r0)
            if (r0 == 0) goto L_0x00ae
            if (r0 == r6) goto L_0x00ae
            boolean r2 = r0.isPressed()
            if (r2 == 0) goto L_0x00ae
            r2 = 0
            r0.setPressed(r2)
        L_0x00ae:
            r14.h = r5
            int r0 = r6.getLeft()
            float r0 = (float) r0
            float r0 = r4 - r0
            int r2 = r6.getTop()
            float r2 = (float) r2
            float r2 = r7 - r2
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 21
            if (r8 < r9) goto L_0x00c7
            r6.drawableHotspotChanged(r0, r2)
        L_0x00c7:
            boolean r0 = r6.isPressed()
            if (r0 != 0) goto L_0x00d1
            r0 = 1
            r6.setPressed(r0)
        L_0x00d1:
            android.graphics.drawable.Drawable r8 = r14.getSelector()
            if (r8 == 0) goto L_0x016c
            r0 = -1
            if (r5 == r0) goto L_0x016c
            r0 = 1
            r2 = r0
        L_0x00dc:
            if (r2 == 0) goto L_0x00e3
            r0 = 0
            r9 = 0
            r8.setVisible(r0, r9)
        L_0x00e3:
            android.graphics.Rect r0 = r14.c
            int r9 = r6.getLeft()
            int r10 = r6.getTop()
            int r11 = r6.getRight()
            int r12 = r6.getBottom()
            r0.set(r9, r10, r11, r12)
            int r9 = r0.left
            int r10 = r14.d
            int r9 = r9 - r10
            r0.left = r9
            int r9 = r0.top
            int r10 = r14.e
            int r9 = r9 - r10
            r0.top = r9
            int r9 = r0.right
            int r10 = r14.f
            int r9 = r9 + r10
            r0.right = r9
            int r9 = r0.bottom
            int r10 = r14.g
            int r9 = r9 + r10
            r0.bottom = r9
            java.lang.reflect.Field r0 = r14.i     // Catch:{ IllegalAccessException -> 0x0172 }
            boolean r0 = r0.getBoolean(r14)     // Catch:{ IllegalAccessException -> 0x0172 }
            boolean r9 = r6.isEnabled()     // Catch:{ IllegalAccessException -> 0x0172 }
            if (r9 == r0) goto L_0x0132
            java.lang.reflect.Field r9 = r14.i     // Catch:{ IllegalAccessException -> 0x0172 }
            if (r0 != 0) goto L_0x0170
            r0 = 1
        L_0x0125:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x0172 }
            r9.set(r14, r0)     // Catch:{ IllegalAccessException -> 0x0172 }
            r0 = -1
            if (r5 == r0) goto L_0x0132
            r14.refreshDrawableState()     // Catch:{ IllegalAccessException -> 0x0172 }
        L_0x0132:
            if (r2 == 0) goto L_0x014c
            android.graphics.Rect r0 = r14.c
            float r2 = r0.exactCenterX()
            float r9 = r0.exactCenterY()
            int r0 = r14.getVisibility()
            if (r0 != 0) goto L_0x0179
            r0 = 1
        L_0x0145:
            r10 = 0
            r8.setVisible(r0, r10)
            defpackage.jd.a(r8, r2, r9)
        L_0x014c:
            android.graphics.drawable.Drawable r0 = r14.getSelector()
            if (r0 == 0) goto L_0x0158
            r2 = -1
            if (r5 == r2) goto L_0x0158
            defpackage.jd.a(r0, r4, r7)
        L_0x0158:
            r0 = 0
            r14.a(r0)
            r14.refreshDrawableState()
            r0 = 1
            r2 = 1
            if (r3 != r2) goto L_0x0009
            long r2 = r14.getItemIdAtPosition(r5)
            r14.performItemClick(r6, r5, r2)
            goto L_0x0009
        L_0x016c:
            r0 = 0
            r2 = r0
            goto L_0x00dc
        L_0x0170:
            r0 = 0
            goto L_0x0125
        L_0x0172:
            r0 = move-exception
            czb r9 = defpackage.cza.a
            r9.a(r0)
            goto L_0x0132
        L_0x0179:
            r0 = 0
            goto L_0x0145
        L_0x017b:
            uw r0 = r14.m
            if (r0 == 0) goto L_0x0043
            uw r0 = r14.m
            r2 = 0
            r0.a(r2)
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ade.a(android.view.MotionEvent, int):boolean");
    }

    private final void a() {
        android.graphics.drawable.Drawable selector = getSelector();
        if (selector != null && this.l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }
}
