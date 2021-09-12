package defpackage;

/* renamed from: akv reason: default package */
/* compiled from: PG */
final class akv extends RecyclerViewHolder {
    public defpackage.aky p;
    public final android.widget.TextView q;
    public final android.widget.TextView r;
    public final android.widget.TextView s;
    public final android.widget.TextView t;
    public final android.widget.TextView u;
    public final com.google.android.apps.tasks.ui.components.FancyCheckboxView v;

    public akv(android.view.View view) {
        super(view);
        this.q = (android.widget.TextView) view.findViewById(2131755329);
        this.r = (android.widget.TextView) view.findViewById(2131755330);
        this.s = (android.widget.TextView) view.findViewById(2131755332);
        this.t = (android.widget.TextView) view.findViewById(2131755333);
        this.u = (android.widget.TextView) view.findViewById(2131755331);
        this.v = (com.google.android.apps.tasks.ui.components.FancyCheckboxView) view.findViewById(2131755335);
        this.v.setOnClickListener(new defpackage.akw(this));
        this.itemView.setOnClickListener(new defpackage.akx(this));
    }

    static java.lang.String a(android.content.Context context, java.lang.String str, java.lang.String str2, int i) {
        return str.replace(str2, java.lang.String.format("#%06X", new java.lang.Object[]{java.lang.Integer.valueOf(16777215 & defpackage.ob.c(context, i))}));
    }

    static java.util.Calendar t() {
        java.util.Calendar instance = java.util.Calendar.getInstance();
        instance.set(14, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(11, 0);
        return instance;
    }
}
