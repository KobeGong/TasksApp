package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.tasks.R;

/* access modifiers changed from: package-private */
/* renamed from: ahg  reason: default package */
/* compiled from: PG */
public final class ahg implements View.OnAttachStateChangeListener, View.OnHoverListener, View.OnLongClickListener {
    public static ahg b;
    public static ahg c;
    public final View a;
    private final CharSequence d;
    private final int e;
    private final Runnable f = new ahh(this);
    private final Runnable g = new ahi(this);
    private int h;
    private int i;
    private ahj j;
    private boolean k;

    ahg(View view, CharSequence charSequence) {
        this.a = view;
        this.d = charSequence;
        this.e = sx.a(ViewConfiguration.get(this.a.getContext()));
        b();
        this.a.setOnLongClickListener(this);
        this.a.setOnHoverListener(this);
    }

    public final boolean onLongClick(View view) {
        this.h = view.getWidth() / 2;
        this.i = view.getHeight() / 2;
        a(true);
        return true;
    }

    public final boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.j == null || !this.k) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.a.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                switch (motionEvent.getAction()) {
                    case 7:
                        if (this.a.isEnabled() && this.j == null) {
                            int x = (int) motionEvent.getX();
                            int y = (int) motionEvent.getY();
                            if (Math.abs(x - this.h) > this.e || Math.abs(y - this.i) > this.e) {
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

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        int width;
        int height;
        int i2;
        int i3;
        long longPressTimeout;
        if (sn.a.s(this.a)) {
            a((ahg) null);
            if (c != null) {
                c.a();
            }
            c = this;
            this.k = z;
            this.j = new ahj(this.a.getContext());
            ahj ahj = this.j;
            View view = this.a;
            int i4 = this.h;
            int i5 = this.i;
            boolean z2 = this.k;
            CharSequence charSequence = this.d;
            if (ahj.b()) {
                ahj.a();
            }
            ahj.c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = ahj.d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = ahj.a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() >= dimensionPixelOffset) {
                width = i4;
            } else {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = ahj.a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                int i6 = i5 + dimensionPixelOffset2;
                int i7 = i5 - dimensionPixelOffset2;
                height = i6;
                i2 = i7;
            } else {
                height = view.getHeight();
                i2 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = ahj.a.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(ahj.e);
                if (ahj.e.left < 0 && ahj.e.top < 0) {
                    Resources resources = ahj.a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    if (identifier != 0) {
                        i3 = resources.getDimensionPixelSize(identifier);
                    } else {
                        i3 = 0;
                    }
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    ahj.e.set(0, i3, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(ahj.g);
                view.getLocationOnScreen(ahj.f);
                int[] iArr = ahj.f;
                iArr[0] = iArr[0] - ahj.g[0];
                int[] iArr2 = ahj.f;
                iArr2[1] = iArr2[1] - ahj.g[1];
                layoutParams.x = (ahj.f[0] + width) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
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
            ((WindowManager) ahj.a.getSystemService("window")).addView(ahj.b, ahj.d);
            this.a.addOnAttachStateChangeListener(this);
            if (this.k) {
                longPressTimeout = 2500;
            } else {
                if ((sn.a.m(this.a) & 1) == 1) {
                    longPressTimeout = 3000 - ((long) ViewConfiguration.getLongPressTimeout());
                } else {
                    longPressTimeout = 15000 - ((long) ViewConfiguration.getLongPressTimeout());
                }
            }
            this.a.removeCallbacks(this.g);
            this.a.postDelayed(this.g, longPressTimeout);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (c == this) {
            c = null;
            if (this.j != null) {
                this.j.a();
                this.j = null;
                b();
                this.a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (b == this) {
            a((ahg) null);
        }
        this.a.removeCallbacks(this.g);
    }

    static void a(ahg ahg) {
        if (b != null) {
            ahg ahg2 = b;
            ahg2.a.removeCallbacks(ahg2.f);
        }
        b = ahg;
        if (ahg != null) {
            ahg ahg3 = b;
            ahg3.a.postDelayed(ahg3.f, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    private final void b() {
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MAX_VALUE;
    }
}
