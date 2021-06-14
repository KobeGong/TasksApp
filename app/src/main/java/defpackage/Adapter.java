package defpackage;

import android.view.ViewGroup;

/* renamed from: aet  reason: default package */
/* compiled from: PG */
public abstract class Adapter {
    public final aeu mObservable = new aeu();
    public boolean mHasStableIds = false;

    public abstract int getCount();

    public abstract ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i);

    public abstract void onBindViewHolder(ViewHolder afv, int i);

    public final ViewHolder createViewHolder(ViewGroup viewGroup, int i) {
        try {
            jd.c("RV CreateView");
            ViewHolder a = onCreateViewHolder(viewGroup, i);
            if (a.a.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            a.f = i;
            return a;
        } finally {
            jd.b();
        }
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public final void c() {
        if (this.mObservable.hasObserbers()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.mHasStableIds = true;
    }

    public long getItemId(int i) {
        return -1;
    }

    public void a(ViewHolder afv) {
    }

    public void b(ViewHolder afv) {
    }

    public final void c(int i) {
        this.mObservable.a(i, 1);
    }

    public final void d(int i) {
        this.mObservable.b(i, 1);
    }

    public final void a(int i, int i2) {
        this.mObservable.b(i, i2);
    }

    public final void e(int i) {
        this.mObservable.c(i, 1);
    }

    public final void b(int i, int i2) {
        this.mObservable.c(i, i2);
    }
}
