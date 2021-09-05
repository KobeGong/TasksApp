package defpackage;

import com.google.android.apps.tasks.R;

/* renamed from: afv reason: default package */
/* compiled from: PG */
public class afv {
    private static final java.util.List p = java.util.Collections.EMPTY_LIST;
    public final android.view.View a;
    public java.lang.ref.WeakReference b;
    public int c;
    public int d;
    public long e;
    public int f;
    public int g;
    public defpackage.afv h;
    public defpackage.afv i;
    public int j;
    public defpackage.afn k;
    public boolean l;
    public int m;
    public int n;
    public android.support.v7.widget.RecyclerView o;
    private java.util.List q;
    private java.util.List r;
    private int s;

    public afv(android.view.View view) {
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
            throw new java.lang.IllegalArgumentException("itemView may not be null");
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
            ((defpackage.afh) this.a.getLayoutParams()).c = true;
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

    /* access modifiers changed from: 0000 */
    public final boolean e() {
        return this.k != null;
    }

    /* access modifiers changed from: 0000 */
    public final void f() {
        this.k.b(this);
    }

    /* access modifiers changed from: 0000 */
    public final boolean g() {
        return (this.j & 32) != 0;
    }

    /* access modifiers changed from: 0000 */
    public final void h() {
        this.j &= -33;
    }

    public final void i() {
        this.j &= -257;
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.afn afn, boolean z) {
        this.k = afn;
        this.l = z;
    }

    public final boolean j() {
        return (this.j & 4) != 0;
    }

    /* access modifiers changed from: 0000 */
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

    public final void a(java.lang.Object obj) {
        if (obj == null) {
            b(1024);
        } else if ((this.j & 1024) == 0) {
            if (this.q == null) {
                this.q = new java.util.ArrayList();
                this.r = java.util.Collections.unmodifiableList(this.q);
            }
            this.q.add(obj);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void o() {
        if (this.q != null) {
            this.q.clear();
        }
        this.j &= -1025;
    }

    public final java.util.List p() {
        if ((this.j & 1024) != 0) {
            return p;
        }
        if (this.q == null || this.q.size() == 0) {
            return p;
        }
        return this.r;
    }

    /* access modifiers changed from: 0000 */
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
        android.support.v7.widget.RecyclerView.b(this);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ViewHolder{" + java.lang.Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
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
            android.util.Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z && this.s == 1) {
            this.j |= 16;
        } else if (z && this.s == 0) {
            this.j &= -17;
        }
    }

    public final boolean r() {
        if ((this.j & 16) == 0) {
            if (!ViewCompat.a.b(this.a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean s() {
        return (this.j & 2) != 0;
    }

    public afv(android.view.View view, byte b2) {
        this(view);
    }

    public afv(android.view.View view, char c2) {
        this(view, 0);
    }

    public afv(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
        this(layoutInflater.inflate(R.layout.design_navigation_item_separator, viewGroup, false), (byte)0);
    }

    public afv(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, byte b2) {
        this(layoutInflater.inflate(R.layout.design_navigation_item_subheader, viewGroup, false), (byte)0);
    }

    public afv(android.content.Context context, android.view.ViewGroup viewGroup, defpackage.ces ces) {
        this(android.view.LayoutInflater.from(context).inflate(R.layout.action_list_item, viewGroup, false));
        ((android.widget.ImageView) this.a.findViewById(R.id.Icon)).setImageDrawable(ces.b);
        ((android.widget.TextView) this.a.findViewById(R.id.Text)).setText(ces.c);
        this.a.setOnClickListener(ces.d);
    }
}
