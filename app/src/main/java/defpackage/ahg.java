package defpackage;

/* renamed from: ahg reason: default package */
/* compiled from: PG */
final class ahg implements android.view.View.OnAttachStateChangeListener, android.view.View.OnHoverListener, android.view.View.OnLongClickListener {
    public static defpackage.ahg b;
    public static defpackage.ahg c;
    public final android.view.View a;
    private final java.lang.CharSequence d;
    private final int e;
    private final java.lang.Runnable f = new defpackage.ahh(this);
    private final java.lang.Runnable g = new defpackage.ahi(this);
    private int h;
    private int i;
    private defpackage.ahj j;
    private boolean k;

    ahg(android.view.View view, java.lang.CharSequence charSequence) {
        this.a = view;
        this.d = charSequence;
        this.e = defpackage.sx.a(android.view.ViewConfiguration.get(this.a.getContext()));
        b();
        this.a.setOnLongClickListener(this);
        this.a.setOnHoverListener(this);
    }

    public final boolean onLongClick(android.view.View view) {
        this.h = view.getWidth() / 2;
        this.i = view.getHeight() / 2;
        a(true);
        return true;
    }

    public final boolean onHover(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z;
        if (this.j == null || !this.k) {
            android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) this.a.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                switch (motionEvent.getAction()) {
                    case 7:
                        if (this.a.isEnabled() && this.j == null) {
                            int x = (int) motionEvent.getX();
                            int y = (int) motionEvent.getY();
                            if (java.lang.Math.abs(x - this.h) > this.e || java.lang.Math.abs(y - this.i) > this.e) {
                                this.h = x;
                                this.i = y;
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                a(this);
                                break;
                            }
                        }
                        break;
                    case 10:
                        b();
                        a();
                        break;
                }
            }
        }
        return false;
    }

    public final void onViewAttachedToWindow(android.view.View view) {
    }

    public final void onViewDetachedFromWindow(android.view.View view) {
        a();
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z) {
        int width;
        int height;
        int i2;
        int i3;
        long longPressTimeout;
        if (ViewCompat.a.s(this.a)) {
            a((defpackage.ahg) null);
            if (c != null) {
                c.a();
            }
            c = this;
            this.k = z;
            this.j = new defpackage.ahj(this.a.getContext());
            defpackage.ahj ahj = this.j;
            android.view.View view = this.a;
            int i4 = this.h;
            int i5 = this.i;
            boolean z2 = this.k;
            java.lang.CharSequence charSequence = this.d;
            if (ahj.b()) {
                ahj.a();
            }
            ahj.c.setText(charSequence);
            android.view.WindowManager.LayoutParams layoutParams = ahj.d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = ahj.a.getResources().getDimensionPixelOffset(2131689904);
            if (view.getWidth() >= dimensionPixelOffset) {
                width = i4;
            } else {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = ahj.a.getResources().getDimensionPixelOffset(2131689903);
                int i6 = i5 + dimensionPixelOffset2;
                int i7 = i5 - dimensionPixelOffset2;
                height = i6;
                i2 = i7;
            } else {
                height = view.getHeight();
                i2 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = ahj.a.getResources().getDimensionPixelOffset(z2 ? 2131689907 : 2131689906);
            android.view.View rootView = view.getRootView();
            android.view.ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof android.view.WindowManager.LayoutParams) || ((android.view.WindowManager.LayoutParams) layoutParams2).type != 2) {
                android.content.Context context = view.getContext();
                while (true) {
                    if (!(context instanceof android.content.ContextWrapper)) {
                        break;
                    } else if (context instanceof android.app.Activity) {
                        rootView = ((android.app.Activity) context).getWindow().getDecorView();
                        break;
                    } else {
                        context = ((android.content.ContextWrapper) context).getBaseContext();
                    }
                }
            }
            if (rootView == null) {
                android.util.Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(ahj.e);
                if (ahj.e.left < 0 && ahj.e.top < 0) {
                    android.content.res.Resources resources = ahj.a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    if (identifier != 0) {
                        i3 = resources.getDimensionPixelSize(identifier);
                    } else {
                        i3 = 0;
                    }
                    android.util.DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    ahj.e.set(0, i3, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(ahj.g);
                view.getLocationOnScreen(ahj.f);
                int[] iArr = ahj.f;
                iArr[0] = iArr[0] - ahj.g[0];
                int[] iArr2 = ahj.f;
                iArr2[1] = iArr2[1] - ahj.g[1];
                layoutParams.x = (ahj.f[0] + width) - (rootView.getWidth() / 2);
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                ahj.b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = ahj.b.getMeasuredHeight();
                int i8 = ((ahj.f[1] + i2) - dimensionPixelOffset3) - measuredHeight;
                int i9 = ahj.f[1] + height + dimensionPixelOffset3;
                if (z2) {
                    if (i8 < 0) {
                        layoutParams.y = i9;
                    }
                } else if (measuredHeight + i9 <= ahj.e.height()) {
                    layoutParams.y = i9;
                }
                layoutParams.y = i8;
            }
            ((android.view.WindowManager) ahj.a.getSystemService("window")).addView(ahj.b, ahj.d);
            this.a.addOnAttachStateChangeListener(this);
            if (this.k) {
                longPressTimeout = 2500;
            } else {
                if ((ViewCompat.a.m(this.a) & 1) == 1) {
                    longPressTimeout = 3000 - ((long) android.view.ViewConfiguration.getLongPressTimeout());
                } else {
                    longPressTimeout = 15000 - ((long) android.view.ViewConfiguration.getLongPressTimeout());
                }
            }
            this.a.removeCallbacks(this.g);
            this.a.postDelayed(this.g, longPressTimeout);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        if (c == this) {
            c = null;
            if (this.j != null) {
                this.j.a();
                this.j = null;
                b();
                this.a.removeOnAttachStateChangeListener(this);
            } else {
                android.util.Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (b == this) {
            a((defpackage.ahg) null);
        }
        this.a.removeCallbacks(this.g);
    }

    static void a(defpackage.ahg ahg) {
        if (b != null) {
            defpackage.ahg ahg2 = b;
            ahg2.a.removeCallbacks(ahg2.f);
        }
        b = ahg;
        if (ahg != null) {
            defpackage.ahg ahg3 = b;
            ahg3.a.postDelayed(ahg3.f, (long) android.view.ViewConfiguration.getLongPressTimeout());
        }
    }

    private final void b() {
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MAX_VALUE;
    }
}
