package defpackage;

/* renamed from: tl reason: default package */
/* compiled from: PG */
public final class tl {
    public final android.view.accessibility.AccessibilityNodeInfo a;
    public int b = -1;

    private tl(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    public static defpackage.tl a(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return new defpackage.tl(accessibilityNodeInfo);
    }

    public final void a(int i) {
        this.a.addAction(i);
    }

    public final void a(android.graphics.Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public final void b(android.graphics.Rect rect) {
        this.a.setBoundsInParent(rect);
    }

    public final void c(android.graphics.Rect rect) {
        this.a.getBoundsInScreen(rect);
    }

    public final void d(android.graphics.Rect rect) {
        this.a.setBoundsInScreen(rect);
    }

    public final void a(boolean z) {
        this.a.setCheckable(z);
    }

    public final void b(boolean z) {
        this.a.setAccessibilityFocused(z);
    }

    public final void c(boolean z) {
        this.a.setEnabled(z);
    }

    public final void a() {
        this.a.setScrollable(true);
    }

    public final void a(java.lang.CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public final void b(java.lang.CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    public final void d(boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            this.a.setDismissable(z);
        }
    }

    public final int hashCode() {
        if (this.a == null) {
            return 0;
        }
        return this.a.hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        defpackage.tl tlVar = (defpackage.tl) obj;
        if (this.a == null) {
            if (tlVar.a != null) {
                return false;
            }
            return true;
        } else if (!this.a.equals(tlVar.a)) {
            return false;
        } else {
            return true;
        }
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        android.graphics.Rect rect = new android.graphics.Rect();
        a(rect);
        sb.append("; boundsInParent: " + rect);
        c(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ").append(this.a.getPackageName());
        sb.append("; className: ").append(this.a.getClassName());
        sb.append("; text: ").append(this.a.getText());
        sb.append("; contentDescription: ").append(this.a.getContentDescription());
        java.lang.StringBuilder append = sb.append("; viewId: ");
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            str = this.a.getViewIdResourceName();
        } else {
            str = null;
        }
        append.append(str);
        sb.append("; checkable: ").append(this.a.isCheckable());
        sb.append("; checked: ").append(this.a.isChecked());
        sb.append("; focusable: ").append(this.a.isFocusable());
        sb.append("; focused: ").append(this.a.isFocused());
        sb.append("; selected: ").append(this.a.isSelected());
        sb.append("; clickable: ").append(this.a.isClickable());
        sb.append("; longClickable: ").append(this.a.isLongClickable());
        sb.append("; enabled: ").append(this.a.isEnabled());
        sb.append("; password: ").append(this.a.isPassword());
        sb.append("; scrollable: " + this.a.isScrollable());
        sb.append("; [");
        int actions = this.a.getActions();
        while (actions != 0) {
            int numberOfTrailingZeros = 1 << java.lang.Integer.numberOfTrailingZeros(actions);
            int i = (numberOfTrailingZeros ^ -1) & actions;
            switch (numberOfTrailingZeros) {
                case 1:
                    str2 = "ACTION_FOCUS";
                    break;
                case 2:
                    str2 = "ACTION_CLEAR_FOCUS";
                    break;
                case 4:
                    str2 = "ACTION_SELECT";
                    break;
                case 8:
                    str2 = "ACTION_CLEAR_SELECTION";
                    break;
                case 16:
                    str2 = "ACTION_CLICK";
                    break;
                case 32:
                    str2 = "ACTION_LONG_CLICK";
                    break;
                case 64:
                    str2 = "ACTION_ACCESSIBILITY_FOCUS";
                    break;
                case 128:
                    str2 = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    break;
                case 256:
                    str2 = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    break;
                case 512:
                    str2 = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    break;
                case 1024:
                    str2 = "ACTION_NEXT_HTML_ELEMENT";
                    break;
                case 2048:
                    str2 = "ACTION_PREVIOUS_HTML_ELEMENT";
                    break;
                case 4096:
                    str2 = "ACTION_SCROLL_FORWARD";
                    break;
                case 8192:
                    str2 = "ACTION_SCROLL_BACKWARD";
                    break;
                case 16384:
                    str2 = "ACTION_COPY";
                    break;
                case 32768:
                    str2 = "ACTION_PASTE";
                    break;
                case 65536:
                    str2 = "ACTION_CUT";
                    break;
                case 131072:
                    str2 = "ACTION_SET_SELECTION";
                    break;
                default:
                    str2 = "ACTION_UNKNOWN";
                    break;
            }
            sb.append(str2);
            if (i != 0) {
                sb.append(", ");
            }
            actions = i;
        }
        sb.append("]");
        return sb.toString();
    }
}
