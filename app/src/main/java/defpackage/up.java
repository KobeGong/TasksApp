package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: up  reason: default package */
/* compiled from: PG */
public abstract class up extends rn {
    private static final Rect f = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final AccessibilityManager b;
    public final View c;
    public int d = Integer.MIN_VALUE;
    public int e = Integer.MIN_VALUE;
    private final Rect g = new Rect();
    private final Rect h = new Rect();
    private final Rect i = new Rect();
    private final int[] j = new int[2];
    private uq k;
    private int l = Integer.MIN_VALUE;

    public up(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.c = view;
        this.b = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (sn.a.d(view) == 0) {
            sn.a(view, 1);
        }
    }

    public abstract int a(float f2, float f3);

    public abstract void a(List list);

    public abstract void a(tl tlVar);

    public abstract boolean a(int i2, int i3);

    @Override // defpackage.rn
    public final tp a(View view) {
        if (this.k == null) {
            this.k = new uq(this);
        }
        return this.k;
    }

    public final boolean b(int i2, int i3) {
        ViewParent parent;
        AccessibilityEvent accessibilityEvent;
        if (i2 == Integer.MIN_VALUE || !this.b.isEnabled() || (parent = this.c.getParent()) == null) {
            return false;
        }
        switch (i2) {
            case -1:
                accessibilityEvent = AccessibilityEvent.obtain(i3);
                this.c.onInitializeAccessibilityEvent(accessibilityEvent);
                break;
            default:
                accessibilityEvent = AccessibilityEvent.obtain(i3);
                tl b2 = b(i2);
                accessibilityEvent.getText().add(b2.a.getText());
                accessibilityEvent.setContentDescription(b2.a.getContentDescription());
                accessibilityEvent.setScrollable(b2.a.isScrollable());
                accessibilityEvent.setPassword(b2.a.isPassword());
                accessibilityEvent.setEnabled(b2.a.isEnabled());
                accessibilityEvent.setChecked(b2.a.isChecked());
                if (!accessibilityEvent.getText().isEmpty() || accessibilityEvent.getContentDescription() != null) {
                    accessibilityEvent.setClassName(b2.a.getClassName());
                    accessibilityEvent.setSource(this.c, i2);
                    accessibilityEvent.setPackageName(this.c.getContext().getPackageName());
                    break;
                } else {
                    throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                }
                break;
        }
        return tb.a(parent, this.c, accessibilityEvent);
    }

    public final void a(int i2) {
        if (this.l != i2) {
            int i3 = this.l;
            this.l = i2;
            b(i2, 128);
            b(i3, 256);
        }
    }

    /* access modifiers changed from: package-private */
    public final tl b(int i2) {
        boolean z;
        if (i2 == -1) {
            tl a = tl.a(AccessibilityNodeInfo.obtain(this.c));
            sn.a(this.c, a);
            ArrayList arrayList = new ArrayList();
            a(arrayList);
            if (a.a.getChildCount() <= 0 || arrayList.size() <= 0) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    a.a.addChild(this.c, ((Integer) arrayList.get(i3)).intValue());
                }
                return a;
            }
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        tl a2 = tl.a(AccessibilityNodeInfo.obtain());
        a2.c(true);
        a2.a.setFocusable(true);
        a2.a("android.view.View");
        a2.b(f);
        a2.d(f);
        a2.a.setParent(this.c);
        a(a2);
        if (a2.a.getText() == null && a2.a.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        a2.a(this.h);
        if (this.h.equals(f)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = a2.a.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        } else if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        } else {
            a2.a.setPackageName(this.c.getContext().getPackageName());
            a2.a.setSource(this.c, i2);
            if (this.d == i2) {
                a2.b(true);
                a2.a(128);
            } else {
                a2.b(false);
                a2.a(64);
            }
            boolean z2 = this.e == i2;
            if (z2) {
                a2.a(2);
            } else if (a2.a.isFocusable()) {
                a2.a(1);
            }
            a2.a.setFocused(z2);
            this.c.getLocationOnScreen(this.j);
            a2.c(this.g);
            if (this.g.equals(f)) {
                a2.a(this.g);
                if (a2.b != -1) {
                    tl a3 = tl.a(AccessibilityNodeInfo.obtain());
                    for (int i4 = a2.b; i4 != -1; i4 = a3.b) {
                        View view = this.c;
                        a3.b = -1;
                        a3.a.setParent(view, -1);
                        a3.b(f);
                        a(a3);
                        a3.a(this.h);
                        this.g.offset(this.h.left, this.h.top);
                    }
                    a3.a.recycle();
                }
                this.g.offset(this.j[0] - this.c.getScrollX(), this.j[1] - this.c.getScrollY());
            }
            if (this.c.getLocalVisibleRect(this.i)) {
                this.i.offset(this.j[0] - this.c.getScrollX(), this.j[1] - this.c.getScrollY());
                if (this.g.intersect(this.i)) {
                    a2.d(this.g);
                    Rect rect = this.g;
                    if (rect == null || rect.isEmpty()) {
                        z = false;
                    } else {
                        if (this.c.getWindowVisibility() == 0) {
                            ViewParent parent = this.c.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view2 = (View) parent;
                                    if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                        z = false;
                                    } else {
                                        parent = view2.getParent();
                                    }
                                } else if (parent != null) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        z = false;
                    }
                    if (z) {
                        a2.a.setVisibleToUser(true);
                    }
                }
            }
            return a2;
        }
    }

    @Override // defpackage.rn
    public final void a(View view, tl tlVar) {
        super.a(view, tlVar);
        b(tlVar);
    }

    /* access modifiers changed from: package-private */
    public final boolean c(int i2) {
        if (this.d != i2) {
            return false;
        }
        this.d = Integer.MIN_VALUE;
        this.c.invalidate();
        b(i2, 65536);
        return true;
    }

    public final boolean d(int i2) {
        if (this.e != i2) {
            return false;
        }
        this.e = Integer.MIN_VALUE;
        b(i2, 8);
        return true;
    }

    public void b(tl tlVar) {
    }

    static {
        new ur();
        new us();
    }
}
