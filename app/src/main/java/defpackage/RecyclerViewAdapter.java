package defpackage;

/* renamed from: aet reason: default package */
/* compiled from: PG */
public abstract class RecyclerViewAdapter {
    public final defpackage.aeu mObservable = new defpackage.aeu();
    public boolean mHasStableIds = false;

    public abstract int getItemCount();

    public abstract RecyclerViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i);

    public abstract void onBindViewHolder(RecyclerViewHolder viewHolder, int i);

    public final RecyclerViewHolder createViewHolder(android.view.ViewGroup viewGroup, int i) {
        try {
            defpackage.jd.c("RVCreateView ");
            RecyclerViewHolder viewHolder = onCreateViewHolder(viewGroup, i);
            if (viewHolder.itemView.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            viewHolder.f = i;
            return viewHolder;
        } finally {
            defpackage.jd.b();
        }
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public final void setHasStableIds() {
        if (this.mObservable.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.mHasStableIds = true;
    }

    public long getItemId(int i) {
        return -1;
    }

    public void a(RecyclerViewHolder afv) {
    }

    public void b(RecyclerViewHolder afv) {
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
