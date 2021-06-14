package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.tasks.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: afv  reason: default package */
/* compiled from: PG */
public class ViewHolder {
    private static final List p = Collections.EMPTY_LIST;
    public final View a;
    public WeakReference b;
    public int c;
    public int d;
    public long e;
    public int f;
    public int g;
    public ViewHolder h;
    public ViewHolder i;
    public int j;
    public afn k;
    public boolean l;
    public int m;
    public int n;
    public RecyclerView o;
    private List q;
    private List r;
    private int s;

    public ViewHolder(View view) {
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = null;
        this.i = null;
        this.q = null;
        this.r = null;
        this.s = 0;
        this.k = null;
        this.l = false;
        this.m = 0;
        this.n = -1;
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.a = view;
    }

    public final void a(int i2, boolean z) {
        if (this.d == -1) {
            this.d = this.c;
        }
        if (this.g == -1) {
            this.g = this.c;
        }
        if (z) {
            this.g += i2;
        }
        this.c += i2;
        if (this.a.getLayoutParams() != null) {
            ((afh) this.a.getLayoutParams()).c = true;
        }
    }

    public final void a() {
        this.d = -1;
        this.g = -1;
    }

    public final boolean b() {
        return (this.j & 128) != 0;
    }

    public final int c() {
        return this.g == -1 ? this.c : this.g;
    }

    public final int d() {
        if (this.o == null) {
            return -1;
        }
        return this.o.c(this);
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        return this.k != null;
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        this.k.b(this);
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        return (this.j & 32) != 0;
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        this.j &= -33;
    }

    public final void i() {
        this.j &= -257;
    }

    /* access modifiers changed from: package-private */
    public final void a(afn afn, boolean z) {
        this.k = afn;
        this.l = z;
    }

    public final boolean j() {
        return (this.j & 4) != 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean k() {
        return (this.j & 2) != 0;
    }

    public final boolean l() {
        return (this.j & 1) != 0;
    }

    public final boolean m() {
        return (this.j & 8) != 0;
    }

    public final boolean a(int i2) {
        return (this.j & i2) != 0;
    }

    public final boolean n() {
        return (this.j & 256) != 0;
    }

    public final void a(int i2, int i3) {
        this.j = (this.j & (i3 ^ -1)) | (i2 & i3);
    }

    public final void b(int i2) {
        this.j |= i2;
    }

    public final void a(Object obj) {
        if (obj == null) {
            b(1024);
        } else if ((this.j & 1024) == 0) {
            if (this.q == null) {
                this.q = new ArrayList();
                this.r = Collections.unmodifiableList(this.q);
            }
            this.q.add(obj);
        }
    }

    /* access modifiers changed from: package-private */
    public final void o() {
        if (this.q != null) {
            this.q.clear();
        }
        this.j &= -1025;
    }

    public final List p() {
        if ((this.j & 1024) != 0) {
            return p;
        }
        if (this.q == null || this.q.size() == 0) {
            return p;
        }
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public final void q() {
        this.j = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.g = -1;
        this.s = 0;
        this.h = null;
        this.i = null;
        o();
        this.m = 0;
        this.n = -1;
        RecyclerView.b(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
        if (e()) {
            sb.append(" scrap ").append(this.l ? "[changeScrap]" : "[attachedScrap]");
        }
        if (j()) {
            sb.append(" invalid");
        }
        if (!l()) {
            sb.append(" unbound");
        }
        if (k()) {
            sb.append(" update");
        }
        if (m()) {
            sb.append(" removed");
        }
        if (b()) {
            sb.append(" ignored");
        }
        if (n()) {
            sb.append(" tmpDetached");
        }
        if (!r()) {
            sb.append(" not recyclable(" + this.s + ")");
        }
        if ((this.j & 512) != 0 || j()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final void a(boolean z) {
        this.s = z ? this.s - 1 : this.s + 1;
        if (this.s < 0) {
            this.s = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z && this.s == 1) {
            this.j |= 16;
        } else if (z && this.s == 0) {
            this.j &= -17;
        }
    }

    public final boolean r() {
        if ((this.j & 16) == 0) {
            if (!sn.a.b(this.a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean s() {
        return (this.j & 2) != 0;
    }

    public ViewHolder(View view, byte b2) {
        this(view);
    }

    public ViewHolder(View view, char c2) {
        this(view, (byte) 0);
    }

    public ViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this(layoutInflater.inflate(R.layout.design_navigation_item_separator, viewGroup, false), (byte) 0);
    }

    public ViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup, byte b2) {
        this(layoutInflater.inflate(R.layout.design_navigation_item_subheader, viewGroup, false), (byte) 0);
    }

    public ViewHolder(Context context, ViewGroup viewGroup, ces ces) {
        this(LayoutInflater.from(context).inflate(R.layout.action_list_item, viewGroup, false));
        ((ImageView) this.a.findViewById(R.id.Icon)).setImageDrawable(ces.b);
        ((TextView) this.a.findViewById(R.id.Text)).setText(ces.c);
        this.a.setOnClickListener(ces.d);
    }
}
