package defpackage;

/* renamed from: acb reason: default package */
/* compiled from: PG */
public final class acb extends android.widget.Spinner implements defpackage.sm {
    private static final int[] d = {16843505};
    public defpackage.ace a;
    public int b;
    public final android.graphics.Rect c;
    private final defpackage.abg e;
    private final android.content.Context f;
    private defpackage.ado g;
    private android.widget.SpinnerAdapter h;
    private final boolean i;

    public acb(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private acb(android.content.Context context, android.util.AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, 2130772241);
    }

    private acb(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        this(context, attributeSet, 2130772241, -1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private acb(android.content.Context r10, android.util.AttributeSet r11, int r12, int r13) {
        /*
            r9 = this;
            r7 = 1
            r1 = 0
            r6 = 0
            r9.<init>(r10, r11, r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.c = r0
            int[] r0 = defpackage.xu.cg
            agw r3 = defpackage.agw.a(r10, r11, r0, r12, r6)
            abg r0 = new abg
            r0.<init>(r9)
            r9.e = r0
            int r0 = defpackage.xu.ck
            int r2 = r3.g(r0, r6)
            if (r2 == 0) goto L_0x00b1
            yf r0 = new yf
            r0.<init>(r10, r2)
            r2 = r9
        L_0x0028:
            r2.f = r0
            android.content.Context r0 = r9.f
            if (r0 == 0) goto L_0x0080
            int[] r0 = d     // Catch:{ Exception -> 0x00bf, all -> 0x00c7 }
            r2 = 0
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r11, r0, r12, r2)     // Catch:{ Exception -> 0x00bf, all -> 0x00c7 }
            r2 = 0
            boolean r2 = r0.hasValue(r2)     // Catch:{ Exception -> 0x00d3, all -> 0x00ce }
            if (r2 == 0) goto L_0x0042
            r2 = 0
            r4 = 0
            int r13 = r0.getInt(r2, r4)     // Catch:{ Exception -> 0x00d3, all -> 0x00ce }
        L_0x0042:
            if (r0 == 0) goto L_0x0047
            r0.recycle()
        L_0x0047:
            if (r13 != r7) goto L_0x0080
            ace r0 = new ace
            android.content.Context r2 = r9.f
            r0.<init>(r9, r2, r11, r12)
            android.content.Context r2 = r9.f
            int[] r4 = defpackage.xu.cg
            agw r2 = defpackage.agw.a(r2, r11, r4, r12, r6)
            int r4 = defpackage.xu.ch
            r5 = -2
            int r4 = r2.f(r4, r5)
            r9.b = r4
            int r4 = defpackage.xu.ci
            android.graphics.drawable.Drawable r4 = r2.a(r4)
            r0.a(r4)
            int r4 = defpackage.xu.cj
            java.lang.String r4 = r3.d(r4)
            r0.a = r4
            android.content.res.TypedArray r2 = r2.b
            r2.recycle()
            r9.a = r0
            acc r2 = new acc
            r2.<init>(r9, r9, r0)
            r9.g = r2
        L_0x0080:
            android.content.res.TypedArray r0 = r3.b
            java.lang.CharSequence[] r0 = r0.getTextArray(r6)
            if (r0 == 0) goto L_0x0099
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r2.<init>(r10, r4, r0)
            r0 = 2131034208(0x7f050060, float:1.7678927E38)
            r2.setDropDownViewResource(r0)
            r9.setAdapter(r2)
        L_0x0099:
            android.content.res.TypedArray r0 = r3.b
            r0.recycle()
            r9.i = r7
            android.widget.SpinnerAdapter r0 = r9.h
            if (r0 == 0) goto L_0x00ab
            android.widget.SpinnerAdapter r0 = r9.h
            r9.setAdapter(r0)
            r9.h = r1
        L_0x00ab:
            abg r0 = r9.e
            r0.a(r11, r12)
            return
        L_0x00b1:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 >= r2) goto L_0x00bb
            r0 = r10
            r2 = r9
            goto L_0x0028
        L_0x00bb:
            r0 = r1
            r2 = r9
            goto L_0x0028
        L_0x00bf:
            r0 = move-exception
            r0 = r1
        L_0x00c1:
            if (r0 == 0) goto L_0x0047
            r0.recycle()
            goto L_0x0047
        L_0x00c7:
            r0 = move-exception
        L_0x00c8:
            if (r1 == 0) goto L_0x00cd
            r1.recycle()
        L_0x00cd:
            throw r0
        L_0x00ce:
            r1 = move-exception
            r8 = r1
            r1 = r0
            r0 = r8
            goto L_0x00c8
        L_0x00d3:
            r2 = move-exception
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acb.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public final android.content.Context getPopupContext() {
        if (this.a != null) {
            return this.f;
        }
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    public final void setPopupBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        if (this.a != null) {
            this.a.a(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public final void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(defpackage.xw.b(getPopupContext(), i2));
    }

    public final android.graphics.drawable.Drawable getPopupBackground() {
        if (this.a != null) {
            return this.a.r.getBackground();
        }
        return super.getPopupBackground();
    }

    public final void setDropDownVerticalOffset(int i2) {
        if (this.a != null) {
            this.a.a(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    public final int getDropDownVerticalOffset() {
        if (this.a != null) {
            return this.a.c();
        }
        return super.getDropDownVerticalOffset();
    }

    public final void setDropDownHorizontalOffset(int i2) {
        if (this.a != null) {
            this.a.g = i2;
        } else {
            super.setDropDownHorizontalOffset(i2);
        }
    }

    public final int getDropDownHorizontalOffset() {
        if (this.a != null) {
            return this.a.g;
        }
        return super.getDropDownHorizontalOffset();
    }

    public final void setDropDownWidth(int i2) {
        if (this.a != null) {
            this.b = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    public final int getDropDownWidth() {
        if (this.a != null) {
            return this.b;
        }
        return super.getDropDownWidth();
    }

    public final void setAdapter(android.widget.SpinnerAdapter spinnerAdapter) {
        if (!this.i) {
            this.h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.a != null) {
            this.a.a((android.widget.ListAdapter) new defpackage.acd(spinnerAdapter, (this.f == null ? getContext() : this.f).getTheme()));
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a != null && this.a.r.isShowing()) {
            this.a.e();
        }
    }

    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.g == null || !this.g.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.a != null && android.view.View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(java.lang.Math.min(java.lang.Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), android.view.View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    public final boolean performClick() {
        if (this.a == null) {
            return super.performClick();
        }
        if (!this.a.r.isShowing()) {
            this.a.d();
        }
        return true;
    }

    public final void setPrompt(java.lang.CharSequence charSequence) {
        if (this.a != null) {
            this.a.a = charSequence;
        } else {
            super.setPrompt(charSequence);
        }
    }

    public final java.lang.CharSequence getPrompt() {
        if (this.a != null) {
            return this.a.a;
        }
        return super.getPrompt();
    }

    public final void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        if (this.e != null) {
            this.e.a(i2);
        }
    }

    public final void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.e != null) {
            this.e.a();
        }
    }

    public final void a(android.content.res.ColorStateList colorStateList) {
        if (this.e != null) {
            this.e.a(colorStateList);
        }
    }

    public final android.content.res.ColorStateList d_() {
        if (this.e != null) {
            return this.e.b();
        }
        return null;
    }

    public final void a(android.graphics.PorterDuff.Mode mode) {
        if (this.e != null) {
            this.e.a(mode);
        }
    }

    public final android.graphics.PorterDuff.Mode b() {
        if (this.e != null) {
            return this.e.c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.e != null) {
            this.e.d();
        }
    }

    /* access modifiers changed from: 0000 */
    public final int a(android.widget.SpinnerAdapter spinnerAdapter, android.graphics.drawable.Drawable drawable) {
        android.view.View view;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = java.lang.Math.max(0, getSelectedItemPosition());
        int min = java.lang.Math.min(spinnerAdapter.getCount(), max + 15);
        int max2 = java.lang.Math.max(0, max - (15 - (min - max)));
        android.view.View view2 = null;
        int i2 = 0;
        int i3 = 0;
        while (max2 < min) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i3) {
                view = null;
            } else {
                itemViewType = i3;
                view = view2;
            }
            view2 = spinnerAdapter.getView(max2, view, this);
            if (view2.getLayoutParams() == null) {
                view2.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            }
            view2.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = java.lang.Math.max(i2, view2.getMeasuredWidth());
            max2++;
            i3 = itemViewType;
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.c);
        return this.c.left + this.c.right + i2;
    }
}
