package defpackage;

/* renamed from: up reason: default package */
/* compiled from: PG */
public abstract class up extends defpackage.rn {
    private static final android.graphics.Rect f = new android.graphics.Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final android.view.accessibility.AccessibilityManager b;
    public final android.view.View c;
    public int d = Integer.MIN_VALUE;
    public int e = Integer.MIN_VALUE;
    private final android.graphics.Rect g = new android.graphics.Rect();
    private final android.graphics.Rect h = new android.graphics.Rect();
    private final android.graphics.Rect i = new android.graphics.Rect();
    private final int[] j = new int[2];
    private defpackage.uq k;
    private int l = Integer.MIN_VALUE;

    public up(android.view.View view) {
        if (view == null) {
            throw new java.lang.IllegalArgumentException("View may not be null");
        }
        this.c = view;
        this.b = (android.view.accessibility.AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (ViewCompat.a.d(view) == 0) {
            ViewCompat.a(view, 1);
        }
    }

    public abstract int a(float f2, float f3);

    public abstract void a(java.util.List list);

    public abstract void a(defpackage.tl tlVar);

    public abstract boolean a(int i2, int i3);

    public final defpackage.tp a(android.view.View view) {
        if (this.k == null) {
            this.k = new defpackage.uq(this);
        }
        return this.k;
    }

    public final boolean b(int i2, int i3) {
        android.view.accessibility.AccessibilityEvent accessibilityEvent;
        if (i2 == Integer.MIN_VALUE || !this.b.isEnabled()) {
            return false;
        }
        android.view.ViewParent parent = this.c.getParent();
        if (parent == null) {
            return false;
        }
        switch (i2) {
            case -1:
                accessibilityEvent = android.view.accessibility.AccessibilityEvent.obtain(i3);
                this.c.onInitializeAccessibilityEvent(accessibilityEvent);
                break;
            default:
                accessibilityEvent = android.view.accessibility.AccessibilityEvent.obtain(i3);
                defpackage.tl b2 = b(i2);
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
                    throw new java.lang.RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                }
                break;
        }
        return defpackage.tb.a(parent, this.c, accessibilityEvent);
    }

    public final void a(int i2) {
        if (this.l != i2) {
            int i3 = this.l;
            this.l = i2;
            b(i2, 128);
            b(i3, 256);
        }
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.tl b(int i2) {
        boolean z;
        boolean z2;
        if (i2 == -1) {
            defpackage.tl a = defpackage.tl.a(android.view.accessibility.AccessibilityNodeInfo.obtain(this.c));
            ViewCompat.a(this.c, a);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            a((java.util.List) arrayList);
            if (a.a.getChildCount() <= 0 || arrayList.size() <= 0) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    a.a.addChild(this.c, ((java.lang.Integer) arrayList.get(i3)).intValue());
                }
                return a;
            }
            throw new java.lang.RuntimeException("Views cannot have both real and virtual children");
        }
        defpackage.tl a2 = defpackage.tl.a(android.view.accessibility.AccessibilityNodeInfo.obtain());
        a2.c(true);
        a2.a.setFocusable(true);
        a2.a((java.lang.CharSequence) "android.view.View");
        a2.b(f);
        a2.d(f);
        a2.a.setParent(this.c);
        a(a2);
        if (a2.a.getText() == null && a2.a.getContentDescription() == null) {
            throw new java.lang.RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        a2.a(this.h);
        if (this.h.equals(f)) {
            throw new java.lang.RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = a2.a.getActions();
        if ((actions & 64) != 0) {
            throw new java.lang.RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        } else if ((actions & 128) != 0) {
            throw new java.lang.RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
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
            if (this.e == i2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                a2.a(2);
            } else if (a2.a.isFocusable()) {
                a2.a(1);
            }
            a2.a.setFocused(z);
            this.c.getLocationOnScreen(this.j);
            a2.c(this.g);
            if (this.g.equals(f)) {
                a2.a(this.g);
                if (a2.b != -1) {
                    defpackage.tl a3 = defpackage.tl.a(android.view.accessibility.AccessibilityNodeInfo.obtain());
                    for (int i4 = a2.b; i4 != -1; i4 = a3.b) {
                        android.view.View view = this.c;
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
                    android.graphics.Rect rect = this.g;
                    if (rect == null || rect.isEmpty()) {
                        z2 = false;
                    } else {
                        if (this.c.getWindowVisibility() == 0) {
                            android.view.ViewParent parent = this.c.getParent();
                            while (true) {
                                if (parent instanceof android.view.View) {
                                    android.view.View view2 = (android.view.View) parent;
                                    if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                        z2 = false;
                                    } else {
                                        parent = view2.getParent();
                                    }
                                } else if (parent != null) {
                                    z2 = true;
                                }
                            }
                            z2 = false;
                        }
                        z2 = false;
                    }
                    if (z2) {
                        a2.a.setVisibleToUser(true);
                    }
                }
            }
            return a2;
        }
    }

    public final void a(android.view.View view, defpackage.tl tlVar) {
        super.a(view, tlVar);
        b(tlVar);
    }

    /* access modifiers changed from: 0000 */
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

    public void b(defpackage.tl tlVar) {
    }

    static {
        new defpackage.ur();
        new defpackage.us();
    }
}
