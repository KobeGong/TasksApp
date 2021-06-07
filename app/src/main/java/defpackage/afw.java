package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: afw  reason: default package */
/* compiled from: PG */
public class afw extends rn {
    public final RecyclerView b;
    public final rn c = new afx(this);

    public afw(RecyclerView recyclerView) {
        this.b = recyclerView;
    }

    @Override // defpackage.rn
    public final boolean a(View view, int i, Bundle bundle) {
        int i2;
        int i3;
        int i4;
        if (super.a(view, i, bundle)) {
            return true;
        }
        if (this.b.n() || this.b.l == null) {
            return false;
        }
        afd afd = this.b.l;
        afn afn = afd.b.e;
        aft aft = afd.b.D;
        if (afd.b == null) {
            return false;
        }
        switch (i) {
            case 4096:
                if (afd.b.canScrollVertically(1)) {
                    i2 = (afd.m - afd.m()) - afd.o();
                } else {
                    i2 = 0;
                }
                if (afd.b.canScrollHorizontally(1)) {
                    i3 = i2;
                    i4 = (afd.l - afd.l()) - afd.n();
                    break;
                }
                i3 = i2;
                i4 = 0;
                break;
            case 8192:
                if (afd.b.canScrollVertically(-1)) {
                    i2 = -((afd.m - afd.m()) - afd.o());
                } else {
                    i2 = 0;
                }
                if (afd.b.canScrollHorizontally(-1)) {
                    i3 = i2;
                    i4 = -((afd.l - afd.l()) - afd.n());
                    break;
                }
                i3 = i2;
                i4 = 0;
                break;
            default:
                i4 = 0;
                i3 = 0;
                break;
        }
        if (i3 == 0 && i4 == 0) {
            return false;
        }
        afd.b.a(i4, i3);
        return true;
    }

    @Override // defpackage.rn
    public final void a(View view, tl tlVar) {
        int i;
        tn tnVar;
        int i2 = 1;
        super.a(view, tlVar);
        tlVar.a(RecyclerView.class.getName());
        if (!this.b.n() && this.b.l != null) {
            afd afd = this.b.l;
            afn afn = afd.b.e;
            aft aft = afd.b.D;
            if (afd.b.canScrollVertically(-1) || afd.b.canScrollHorizontally(-1)) {
                tlVar.a(8192);
                tlVar.a();
            }
            if (afd.b.canScrollVertically(1) || afd.b.canScrollHorizontally(1)) {
                tlVar.a(4096);
                tlVar.a();
            }
            if (afd.b == null || afd.b.k == null) {
                i = 1;
            } else {
                i = afd.e() ? afd.b.k.a() : 1;
            }
            if (!(afd.b == null || afd.b.k == null || !afd.d())) {
                i2 = afd.b.k.a();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                tnVar = new tn(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, 0));
            } else if (Build.VERSION.SDK_INT >= 19) {
                tnVar = new tn(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false));
            } else {
                tnVar = new tn(null);
            }
            if (Build.VERSION.SDK_INT >= 19) {
                tlVar.a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) tnVar.a);
            }
        }
    }

    @Override // defpackage.rn
    public void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !this.b.n()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.l != null) {
                recyclerView.l.a(accessibilityEvent);
            }
        }
    }
}
