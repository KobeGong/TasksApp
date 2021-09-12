package defpackage;

import com.google.android.apps.tasks.R;

/* renamed from: afv reason: default package */
/* compiled from: PG */
public class RecyclerViewHolder {
    private static final java.util.List p = java.util.Collections.EMPTY_LIST;
    public android.view.View itemView;
    public java.lang.ref.WeakReference mNestedRecyclerView;
    public int position;
    public int oldPos;
    public long id;
    public int f;
    public int mPreLayoutPosition;
    public RecyclerViewHolder mShadowedHolder;
    public RecyclerViewHolder mShadowingHolder;
    public int mFlags;
    public defpackage.afn k;
    public boolean l;
    public int m;
    public int n;
    public android.support.v7.widget.RecyclerView o;
    private java.util.List q;
    private java.util.List r;
    private int s;

    public RecyclerViewHolder(android.view.View view) {
        this.position = -1;
        this.oldPos = -1;
        this.id = -1;
        this.f = -1;
        this.mPreLayoutPosition = -1;
        this.mShadowedHolder = null;
        this.mShadowingHolder = null;
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
        this.itemView = view;
    }

    public final void a(int i2, boolean z) {
        if (this.oldPos == -1) {
            this.oldPos = this.position;
        }
        if (this.mPreLayoutPosition == -1) {
            this.mPreLayoutPosition = this.position;
        }
        if (z) {
            this.mPreLayoutPosition += i2;
        }
        this.position += i2;
        if (this.itemView.getLayoutParams() != null) {
            ((defpackage.afh) this.itemView.getLayoutParams()).c = true;
        }
    }

    public final void a() {
        this.oldPos = -1;
        this.mPreLayoutPosition = -1;
    }

    public final boolean shouldIgnore() {
        return (this.mFlags & 128) != 0;
    }

    public final int c() {
        return this.mPreLayoutPosition == -1 ? this.position : this.mPreLayoutPosition;
    }

    public final int d() {
        if (this.o == null) {
            return -1;
        }
        return this.o.c(this);
    }

    /* access modifiers changed from: 0000 */
    public final boolean isScrap() {
        return this.k != null;
    }

    /* access modifiers changed from: 0000 */
    public final void f() {
        this.k.b(this);
    }

    /* access modifiers changed from: 0000 */
    public final boolean g() {
        return (this.mFlags & 32) != 0;
    }

    /* access modifiers changed from: 0000 */
    public final void h() {
        this.mFlags &= -33;
    }

    public final void i() {
        this.mFlags &= -257;
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.afn afn, boolean z) {
        this.k = afn;
        this.l = z;
    }

    public final boolean isInvalid() {
        return (this.mFlags & 4) != 0;
    }

    /* access modifiers changed from: 0000 */
    public final boolean needsUpdate() {
        return (this.mFlags & 2) != 0;
    }

    public final boolean isBound() {
        return (this.mFlags & 1) != 0;
    }

    public final boolean isRemoved() {
        return (this.mFlags & 8) != 0;
    }

    public final boolean hasAnyOfTheFlags(int i2) {
        return (this.mFlags & i2) != 0;
    }

    public final boolean isTmpDetached() {
        return (this.mFlags & 256) != 0;
    }

    public final void a(int i2, int i3) {
        this.mFlags = (this.mFlags & (i3 ^ -1)) | (i2 & i3);
    }

    public final void b(int i2) {
        this.mFlags |= i2;
    }

    public final void a(java.lang.Object obj) {
        if (obj == null) {
            b(1024);
        } else if ((this.mFlags & 1024) == 0) {
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
        this.mFlags &= -1025;
    }

    public final java.util.List p() {
        if ((this.mFlags & 1024) != 0) {
            return p;
        }
        if (this.q == null || this.q.size() == 0) {
            return p;
        }
        return this.r;
    }

    /* access modifiers changed from: 0000 */
    public final void q() {
        this.mFlags = 0;
        this.position = -1;
        this.oldPos = -1;
        this.id = -1;
        this.mPreLayoutPosition = -1;
        this.s = 0;
        this.mShadowedHolder = null;
        this.mShadowingHolder = null;
        o();
        this.m = 0;
        this.n = -1;
        android.support.v7.widget.RecyclerView.b(this);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ViewHolder{" + java.lang.Integer.toHexString(hashCode()) + " position=" + this.position + " id=" + this.id + ", oldPos=" + this.oldPos + ", pLpos:" + this.mPreLayoutPosition);
        if (isScrap()) {
            sb.append(" scrap ").append(this.l ? "[changeScrap]" : "[attachedScrap]");
        }
        if (isInvalid()) {
            sb.append(" invalid");
        }
        if (!isBound()) {
            sb.append(" unbound");
        }
        if (needsUpdate()) {
            sb.append(" update");
        }
        if (isRemoved()) {
            sb.append(" removed");
        }
        if (shouldIgnore()) {
            sb.append(" ignored");
        }
        if (isTmpDetached()) {
            sb.append(" tmpDetached");
        }
        if (!isRecyclable()) {
            sb.append(" not recyclable(" + this.s + ")");
        }
        if ((this.mFlags & 512) != 0 || isInvalid()) {
            sb.append(" undefined adapter position");
        }
        if (this.itemView.getParent() == null) {
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
            this.mFlags |= 16;
        } else if (z && this.s == 0) {
            this.mFlags &= -17;
        }
    }

    public final boolean isRecyclable() {
        if ((this.mFlags & 16) == 0) {
            if (!ViewCompat.a.b(this.itemView)) {
                return true;
            }
        }
        return false;
    }

    public final boolean s() {
        return (this.mFlags & 2) != 0;
    }

    public RecyclerViewHolder(android.view.View view, byte b2) {
        this(view);
    }

    public RecyclerViewHolder(android.view.View view, char c2) {
        this(view, 0);
    }

    public RecyclerViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
        this(layoutInflater.inflate(R.layout.design_navigation_item_separator, viewGroup, false), (byte)0);
    }

    public RecyclerViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, byte b2) {
        this(layoutInflater.inflate(R.layout.design_navigation_item_subheader, viewGroup, false), (byte)0);
    }

    public RecyclerViewHolder(android.content.Context context, android.view.ViewGroup viewGroup, defpackage.ces ces) {
        this(android.view.LayoutInflater.from(context).inflate(R.layout.action_list_item, viewGroup, false));
        ((android.widget.ImageView) this.itemView.findViewById(R.id.Icon)).setImageDrawable(ces.b);
        ((android.widget.TextView) this.itemView.findViewById(R.id.Text)).setText(ces.c);
        this.itemView.setOnClickListener(ces.d);
    }
}
